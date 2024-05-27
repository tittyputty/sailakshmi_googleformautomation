package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
       // WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        //driver.close();
       // driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        
        try{
        System.out.println("Start Test case: testCase01");
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSep9LTMntH5YqIXa5nkiPKSs283kdwitBBhXWyZdAS-e4CxBQ/viewform");
        Thread.sleep(3000);
        WebElement nameInput = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
        nameInput.sendKeys("sailakshmi");
        Thread.sleep(3000);
        WebElement txtBox = driver.findElement(By.xpath("//div[@class='Pc9Gce Wic03c']//textarea[@class='KHxj8b tL9Q4c']"));
        txtBox.click();
        String str = "I want to be the best QA Engineer!";
        long epoch = System.currentTimeMillis();
        String textmsg = str+ " " +epoch;
        txtBox.sendKeys(textmsg);
        Thread.sleep(5000);
        WebElement radiobutton = driver.findElement(By.xpath("//div[@id='i16']"));
        radiobutton.click();
       //List<WebElement>radiobtns = driver.findElements(By.xpath("//div[@class='nWQGrd zwllIb']//label"));
        WebElement checkbox = driver.findElement(By.xpath("(//div[@class='bzfPab wFGF8'])[6]"));
        checkbox.click();
        //WebElement drpdwn = driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']"));
       // drpdwn.click();
    }
    catch(Exception e){
        e.printStackTrace();
    }
        }
    public void testCase02(){
        try{
            WebElement drpdwn = driver.findElement(By.xpath("//div[@jsname='LgbsSe']//div[@class='e2CuFe eU809d']"));
            drpdwn.click();
            Thread.sleep(3000);
            WebElement multipleEle = driver.findElement(By.xpath("//div[@class='OA0qNb ncFHed QXL7Te']/div[4]//span[text()='Ms']"));
            multipleEle.click();
            Thread.sleep(3000);
            WebElement date_box = driver.findElement(By.xpath("//input[@type='date']"));
            LocalDate presentDate = LocalDate.now();
            LocalDate before_7Days = presentDate.minusDays(7);
            DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String final_date = formatObj.format(before_7Days);
            date_box.sendKeys(final_date);
            System.out.println("enter date:"+final_date);
            WebElement hour_data = driver.findElement(By.xpath("//input[@aria-label='Hour']"));
            hour_data.click();
            hour_data.sendKeys("17");
            WebElement min_data = driver.findElement(By.xpath("//input[@aria-label='Minute']"));
            min_data.click();
            min_data.sendKeys("40");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        }
    
        

       // System.out.println("end Test case: testCase01");
    


