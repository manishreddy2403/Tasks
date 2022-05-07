import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    private WebDriver webDriver;




        @Test
        public void login () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            try{webDriver.findElement(By.xpath("//a[@name='Login']")).click();}
            catch (Exception e){webDriver.findElement(By.xpath("//a[@name='Login']")).click();}
            webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
            webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
            try{webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();}
            catch (Exception e){webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();}
            webDriver.quit();

        }

        @Test
    public  void searchcamera() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            try{webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("canon");}
            catch (Exception e){webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("canon");}
            try{webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys(Keys.ENTER);}
            catch(Exception e){webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys(Keys.ENTER);}
            webDriver.quit();

            //            String attribute=webDriver.findElement(By.name("productionSearch")).getAttribute("value");
//            Assert.assertTrue(attribute.equals("cameras"),"expected camera tap"+attribute);





        }
        @Test
        public void  clickImage() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            try{webDriver.findElement(By.xpath("//img[@name='picture_Laptops1']")).click();}
            catch (Exception e){webDriver.findElement(By.xpath("//img[@name='picture_Laptops1']")).click();}
            webDriver.quit();

        }
//        @Test
//    public void addToCart() throws InterruptedException {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//            webDriver = new ChromeDriver();
//            webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
//            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
//            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            webDriver.quit();
//
//        }

        @Test
    public  void priceHighTOLow() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            try{
                webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();
            }catch (Exception e){webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();}
            try{
                webDriver.findElement(By.xpath("//a[@title='Price - Low to High']")).click();
            }catch(Exception e){webDriver.findElement(By.xpath("//a[@title='Price - Low to High']")).click();}
            webDriver.quit();
        }

    @Test
    public  void priceLOwTOHight() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try{
            webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();}
        try{
            webDriver.findElement(By.xpath("//a[@title='Price - High to Low']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//a[@title='Price - High to Low']")).click();}
        webDriver.quit();

    }
    @Test
    public  void AddToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        try{
            webDriver.findElement(By.xpath("//img[@name='picture_Cameras']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//img[@name='picture_Cameras']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();}
            webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
            webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        try{
            webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();}
        webDriver.quit();
    }

    @Test
    public void PlaceOreder() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        try{
            webDriver.findElement(By.xpath("//img[@name='picture_Cameras']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//img[@name='picture_Cameras']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//button[@name='AddToCart']")).click();}
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("user");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("user");
        try{
            webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='button5']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//button[@name='button5']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();}
        try{
            webDriver.findElement(By.xpath("//label[@name='Name']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//label[@name='Name']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//button[@name='nextBtn_wizard_payment']")).click();}
        try{
            webDriver.findElement(By.xpath("//button[@name='doneBtn_wizard_payment']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//button[@name='doneBtn_wizard_payment']")).click();}
        webDriver.quit();

    }

    @Test
    public void Adminlogin () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try{
            webDriver.findElement(By.xpath("//a[@name='Login']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//a[@name='Login']")).click();}
        webDriver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("admin");
        webDriver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Admin");
        try{
            webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//button[@name='loginbutton']")).click();}
        webDriver.quit();
    }
    @Test
    public  void outOfStock() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try{
            webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();}
        try{
            webDriver.findElement(By.xpath("//span[@class='caption']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//span[@class='caption']")).click();}
        webDriver.quit();


    }
    @Test
    public  void sortlaptops() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manishreddya\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try{
            webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();
        }catch (Exception e){webDriver.findElement(By.xpath("//a[@name='ProductsPage']")).click();}
        try{
            webDriver.findElement(By.xpath("//a[@name='Laptops']")).click();
        }catch(Exception e){webDriver.findElement(By.xpath("//a[@name='Laptops']")).click();}
        webDriver.quit();
    }
}


