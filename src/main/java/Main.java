import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static String url = "https://inter.ua";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().proxy("192.168.0.164:3128").setup();
        WebDriver driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage(url);

        driver.quit();
    }
}
