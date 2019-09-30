import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.driver.Driver;


public class DeleteUser {


    private static By admin = By.linkText("Administration interface");

    @Step("Delete user <name>")
    public void deleteUser(String name) throws  InterruptedException {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(admin).click();
        webDriver.findElement(By.linkText("Customers")).click();
        webDriver.findElement(By.id("q_username")).sendKeys(name);
        webDriver.findElement(By.id("q_email")).sendKeys("doe");
        webDriver.findElement(By.name("commit")).click();
        Thread.sleep(500);
        webDriver.findElement(By.name("collection_selection_toggle_all")).click();
        webDriver.findElement(By.id("batch_actions_selector")).click();
        webDriver.findElement(By.className("batch_action")).click();
//        webDriver.findElement(By.linkText("Delete Selected")).click();
//        Select dropdown = new Select(webDriver.findElement(By.id("batch_actions_selector")));
//        dropdown.selectByVisibleText("Delete Selected");
        Thread.sleep(500);
        Alert myAlert = webDriver.switchTo().alert(); //Switch to alert pop-up
        myAlert.accept();
    }

    @Step("Delete users")
    public void deleteUsers() throws  InterruptedException {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(admin).click();
        webDriver.findElement(By.linkText("Customers")).click();
        webDriver.findElement(By.id("q_email")).sendKeys("doe");
        webDriver.findElement(By.name("commit")).click();
        Thread.sleep(500);
        webDriver.findElement(By.name("collection_selection_toggle_all")).click();
        webDriver.findElement(By.id("batch_actions_selector")).click();
        webDriver.findElement(By.className("batch_action")).click();
//        webDriver.findElement(By.linkText("Delete Selected")).click();
//        Select dropdown = new Select(webDriver.findElement(By.id("batch_actions_selector")));
//        dropdown.selectByVisibleText("Delete Selected");
        Thread.sleep(500);
        Alert myAlert = webDriver.switchTo().alert(); //Switch to alert pop-up
        myAlert.accept();
    }

}
