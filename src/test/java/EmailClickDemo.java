import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EmailClickDemo {

    @Test
    public void clickEmail() {

        String driverPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", driverPath + "/build/webdriver/chromedriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        GmailPageObjects gp=PageFactory.initElements(driver, GmailPageObjects.class);
        gp.enterEmail("rtest3028");//Replace with your email id
        gp.enterPassword("Welcome1$");//Replace with your password
        gp.clickEmail("hello");//Replace with email subject you want to click


    }




}