package com.sophossolutions.tasks;



import com.sophossolutions.userInterfaces.Signup;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

public class IngresarInformacion implements Task {

    private Map<String,String> info;

    public IngresarInformacion(DataTable info) {
        this.info = info.asMap(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SendKeys.of(info.get("firsName")).into(Signup.FIRST_NAME),
                SendKeys.of(info.get("lastName")).into(Signup.LAST_NAME),
                SendKeys.of(info.get("email")).into(Signup.EMAIL),
                SelectFromOptions.byVisibleText(info.get("mothDay")).from(Signup.MOTH_BIRTH),
                SelectFromOptions.byVisibleText(info.get("dayBirth")).from(Signup.DAY_BIRTH),
                SelectFromOptions.byVisibleText(info.get("yearBirth")).from(Signup.YEAR_BIRTH),
                SendKeys.of(info.get("languages")).into(Signup.LANGUAGES).thenHit(Keys.ENTER),
                Click.on(Signup.NEXT_LOCATION)
        );
    }
    public static IngresarInformacion personal(DataTable info){
        return Tasks.instrumented(IngresarInformacion.class,info);
    }
}
