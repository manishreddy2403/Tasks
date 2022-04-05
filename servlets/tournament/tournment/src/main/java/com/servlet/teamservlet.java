package com.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.model.Player;
import com.model.Team;
import com.service.PlayerService;
import com.service.TeamImp;
import com.service.TeamService;
import com.service.playerImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class teamservlet extends HttpServlet {
    private static final Gson GSON=new GsonBuilder().create();
    private  static TeamService teamService=new TeamImp();
    private  static PlayerService playerService=new playerImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if (req.getPathInfo()==null) {
            List<Team> team = null;
            List<Player> players = null;
            try {
                // for teamList
                team = teamService.getteam();
                //for player Sortedlist
                players=playerService.SortPlayer();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            resp.setStatus(200);
            resp.setHeader("Context-Type", "Application/json");
            resp.getOutputStream().println(GSON.toJson(team));
            resp.setHeader("Context-type", "Application/json");
            resp.getOutputStream().println(GSON.toJson(players));
        }

//
//        }else {
//            int teamId =Integer.parseInt(req.getPathInfo().replace("/",""));
//            Team team = null;
//            try {
//                team = teamService.getTeamId(teamId);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if(team!=null){
//                resp.setStatus(200);
//                resp.setHeader("Context-Type","application/json");
//                resp.getOutputStream().println(GSON.toJson(team));
//
//            }else {
//                resp.setStatus(404);
//            }
//        }
//
//
//


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Team team=GSON.fromJson(req.getReader(),Team.class);
        try {
            teamService.createTeam(team);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("Context-Type","application/json");
        resp.getOutputStream().println(GSON.toJson(team));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        Team team=GSON.fromJson(req.getReader(),Team.class);

        try {
             teamService.deleteTeam(team);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setStatus(201);
        resp.setHeader("Context-Type","application/json");
        resp.getOutputStream().println(GSON.toJson(team));
    }
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Team> teamList=null;
//        teamService.SortTeam();
//        resp.setStatus(200);
//        resp.setHeader("context-type","applocation/json");
//        resp.getOutputStream().println(GSON.toJson(teamList));
//
//    }
}
