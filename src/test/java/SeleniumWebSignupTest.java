import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {

    // Import the Selenium WebDriver
    private ChromeDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        //Locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. Open chrome browser
        driver = new ChromeDriver();
        //2. Input url
        driver.get("https://selenium-blog.herokuapp.com/");
        Thread.sleep(2000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        //4. Click on signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(2000);
    }

    @Test (priority = 0)
    public void negativeSignup() throws InterruptedException {
        //5. Input your username on the username field
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("kehinde18");
        //6. Input your email on the email field
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("kehinde18@yopmail.com");
        //7. Locate password field and include password
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("password");
        //8. Click on signup button
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(2000);
    }

    @Test (priority = 1)
    public void user1Item() throws InterruptedException {
        //9. Click on user1 item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
    }

    @Test (priority = 2)
    public void verifyItem() throws InterruptedException {
        //10. Search for an element and confirm if it is present
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        Thread.sleep(2000);

        //11. Click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser(){
        //12. Quit browser
        driver.quit();
    }

}

/***
//1. Open chrome browser
        driver = new ChromeDriver();
                //2. Input url
                driver.get("https://selenium-blog.herokuapp.com/");
                Thread.sleep(10000);
                //3. Maximize the browser
                driver.manage().window().maximize();
                //4. Click on signup button to open signup page
                driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();

                //5. Input username on the username field
                driver.findElement(By.id("user_username")).sendKeys("kehinde1");
                //6. Input email on email field
                driver.findElement(By.id("user_email")).sendKeys("kehinde1@yopmail.com");
                //7. Input password on the password field
                driver.findElement(By.id("user_password")).sendKeys("Kehinde123");
                //8. Click on signup button
                driver.findElement(By.id("submit")).click();
                Thread.sleep(10000);
                //9. Click on user1 item on the listpage
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
                //10. Search for an element and confirm if it is present
                driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
                //11. Click on logout
                driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
                //12. Quit browser
                driver.quit();
        **/
