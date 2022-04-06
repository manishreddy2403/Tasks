package com.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    public static Logger logger = LoggerFactory.getLogger(filter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
logger.info("inside authentication Filter");
        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        Optional<Object> authCookie =Optional.empty();
        if (httpServletRequest.getCookies() !=null){
            authCookie= Arrays.stream(httpServletRequest.getCookies()).filter(cookie ->
                    "auth".equals(cookie.getName())).findAny().map(cookie -> cookie.getValue());
        }
        if(authCookie.isPresent()&& Objects.equals(authCookie.get(),"validAuth")){
            logger.info("it's a valid user");
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            logger.info("user is not valid");
            HttpServletResponse httpServletResponse=(HttpServletResponse) servletResponse;
            httpServletResponse.setStatus(401);
            httpServletResponse.getOutputStream().write("UnAuthorized".getBytes());
        }



        servletResponse.getWriter().println("well come");
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.getWriter().println("thank you");


    }


    @Override
    public void destroy() {

    }
}
