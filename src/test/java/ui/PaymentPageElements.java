package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPageElements {

    public static Target PHONE_FIELD =
            Target.the("phone field")
                    .located(By.id("phoneTextField"));

    public static Target NAME_FIELD =
            Target.the("name field")
                    .located(By.id("nameTextField"));

    public static Target COUNTRY_FIELD =
            Target.the("country field")
                    .located(By.id("countryTextField"));

    public static Target AMOUNT_SCROLL=
            Target.the("amount scroll")
                    .located(By.id("amount"));

    public static Target COUNTRY_BUTTON=
            Target.the("country button")
                    .located(By.id("countryButton"));

    public static Target CONFIRM_BUTTON=
            Target.the("confirm button")
                    .located(By.id("android:id/button1"));

    public static Target SEND_PAYMENT_BUTTON=
            Target.the("send payment button")
                    .located(By.id("sendPaymentButton"));

}
