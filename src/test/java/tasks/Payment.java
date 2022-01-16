package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import ui.HomePageElements;
import ui.PaymentPageElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Payment implements Task {
    private String name="";
    private String phone="";
    private String amount="";
    private String client="";

    public Payment(String name,
                   String phone,
                   String amount,
                   String client) {
        this.name = name;
        this.phone = phone;
        this.amount = amount;
        this.client = client;

    }




    @Override
    @Step("{0} deposite to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.PAYMENT_BTN),
                Click.on(PaymentPageElements.PHONE_FIELD),
                //send phone variable
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE_FIELD),
                Click.on(PaymentPageElements.NAME_FIELD),
                //Send name and amount variable
                SendKeys.of(this.name).into(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.amount).into(PaymentPageElements.AMOUNT_SCROLL),
                Click.on(PaymentPageElements.COUNTRY_BUTTON),
                Click.on(By.xpath("//android.widget.TextView[@text='"+this.client+"']")),
                Click.on(PaymentPageElements.SEND_PAYMENT_BUTTON),
                Click.on(PaymentPageElements.CONFIRM_BUTTON)


        );
    }

    public static Payment type(String phone, String name, String amount, String client){
        return instrumented(Payment.class,phone,name,amount,client);
    }


}
