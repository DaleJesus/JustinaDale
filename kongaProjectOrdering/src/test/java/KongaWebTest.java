import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class KongaWebTest {

    private WebDriver driver;

     @BeforeTest
    public void start() throws InterruptedException {
         //locate webdriver
         System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
         //open chromebrowser
         driver = new ChromeDriver();
         //maximize page
         driver.manage().window().maximize();
         //input konga url
         driver.get("http://www.konga.com");
         Thread.sleep(5000);
         //click on login button
         driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
         Thread.sleep(5000);
         //input gmail or phone number
         driver.findElement(By.id("username")).sendKeys("justinaidakwo4@gmail.com");
         Thread.sleep(5000);
         //input password in password field
         driver.findElement(By.id("password")).sendKeys("DALEJAY");
         Thread.sleep(5000);
         //click on login
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[3]/button")).click();
         Thread.sleep(5000);
         //click on computers and accessories
         driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
         Thread.sleep(5000);
         //click on laptop subcategory
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[2]/h1")).click();
         Thread.sleep(5000);
         //click on the Apple MacBooks
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[2]/h1")).click();
         Thread.sleep(5000);
         //Add an item to the cart
         driver.findElement(By.xpath("//*[@id=\"js-cart-items-wrapper\"]/div/div/div[1]/div/div/div/h3/a")).click();
         Thread.sleep(5000);
         //select Address
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[1]/div[1]/h1")).click();
         Thread.sleep(5000);
         //Continue to make payment
         driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[1]/h1")).click();
         Thread.sleep(5000);
         //Input invalid card details
         driver.findElement(By.id("//*[@id=\"card-number\"]")).sendKeys("1234 5678 9652 6");
         Thread.sleep(5000);
         //click on logout
         driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/ul/li[7]/a")).click();

         @AfterTest
         public void chromebrowser {
             //quit browser
             driver.quit();
         }
     }