package com.sophossolutions.tasks;

import com.sophossolutions.userInterfaces.Address;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.Keys;

import java.util.Map;

public class IngresarAddress implements Task {

    private Map<String,String> info;

    public IngresarAddress(DataTable info) {
        this.info = info.asMap(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(info.get("city")).into(Address.CITY),
                Enter.theValue(info.get("postalCode")).into(Address.COD_POSTAL),
                SendKeys.of(info.get("country")).into(Address.COUNTRY).thenHit(Keys.ENTER),
                Click.on(Address.SIGUIENTE)
                );

    }

    public static IngresarAddress user(DataTable info){

        return Tasks.instrumented(IngresarAddress.class, info);
    }
}
