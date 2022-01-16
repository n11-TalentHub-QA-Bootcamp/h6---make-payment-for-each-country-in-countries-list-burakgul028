package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogoutToEriBank implements Task {
    @Override
    @Step()
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.LOGOUT_BTN)
        );
    }

    public static LogoutToEriBank logout() {
        return instrumented(LogoutToEriBank.class);


    }

}
