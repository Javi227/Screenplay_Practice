package com.sophossolutions.tasks;

import com.sophossolutions.userInterfaces.YourDevices;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

public class IngresarDevices implements Task {

    public Map<String,String> info;

    public IngresarDevices(DataTable info) {
        this.info = info.asMap(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SendKeys.of(info.get("computer")).into(YourDevices.COMPUTER).thenHit(Keys.TAB),
                Enter.theValue(info.get("version")).into(YourDevices.VERSION).thenHit(Keys.TAB),
                Enter.theValue(info.get("language")).into(YourDevices.LANGUAGE).thenHit(Keys.TAB),
                Enter.theValue(info.get("mobile")).into(YourDevices.MOBILE).thenHit(Keys.TAB),
                Enter.theValue(info.get("model")).into(YourDevices.MODEL).thenHit(Keys.TAB),
                Enter.theValue(info.get("system")).into(YourDevices.SYSTEM).thenHit(Keys.TAB),
                Click.on(YourDevices.CONTINUE)

        );

    }

    public static IngresarDevices user(DataTable info){
        return Tasks.instrumented(IngresarDevices.class,info);
    }
}
