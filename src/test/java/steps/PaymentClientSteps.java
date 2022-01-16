package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import tasks.LogoutToEriBank;
import tasks.Payment;
import ui.HomePageElements;


public class PaymentClientSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="burak";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("user login in Eribank App")
    public void userLoginInEribankApp() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company","company"));
    }

    @And("user make a payment {string} {string} {string} {string}")
    public void userMakeAPayment(String phone, String name, String amount, String client) {
        actor.attemptsTo(Payment.type(phone, name, amount, client));
    }

    @Then("user check balance")
    public void userCheckBalanceAmount() {
        actor.attemptsTo(
                //Ensure.that(HomePageElements.BALANCE_CHECK)
                        //.attribute("content-desc")
        );
    }

    @And("user logout Eribank")
    public void userLogoutEriBank() {
        actor.attemptsTo(LogoutToEriBank.logout());
    }
}
