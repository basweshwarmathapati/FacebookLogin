import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {


    // Initiate the driver instance
    WebDriver driver = new ChromeDriver();

    @Given("I navigate to Facebook")
    public void iNavigateToFacebook() {
        // driver.get("www.facebook.com");  //hit url
        driver.navigate().to("www.facebook.com");
        // driver.navigate("www.facebook.com");
        
    }

    @When("I put username as {string}")
    public void iPutUsernameAs(String arg0) {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(arg0);


    }

    @And("I put password as {string}")
    public void iPutPasswordAs(String arg0) {
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(arg0);


    }

    @And("I click on Login button.")
    public void iClickOnLoginButton() {
        driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
        
    }

    @Then("I should be on Home Page with Title {string}")
    public void iShouldBeOnHomePageWithTitle(String arg0) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(arg0,actualTitle);
    }
}
