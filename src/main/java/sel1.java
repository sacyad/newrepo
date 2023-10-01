import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sel1 {


    public static void main(String[] args) throws InterruptedException {


//        System.setProperty("webdriver.chrome.driver" , "C:\\gitProject\\src\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver" , "C:\\gitProject\\src\\drivers\\msedgedriver.exe");

//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://www.interviewbit.com/selenium-interview-questions/");

//         to maximize the screen  window
        driver.manage().window().maximize();

//         to scroll the window

        JavascriptExecutor js =  (JavascriptExecutor)driver ;

//        general logic to scroll the wind is  -- executeScript("window.scrollBy(x-pixels,y-pixels)");
//        js.executeScript("window.scrollBy(10 , 10000)");
//        js.executeScript("window.scrollBy(10 , document.body.scrollHeight)");

        Thread.sleep(10000);

        driver.quit();
        System.out.println("finished ................");


    }
}
