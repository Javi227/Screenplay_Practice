package com.sophossolutions.tasks;

import com.sophossolutions.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ingresar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.JOIN_TODAY));
    }

    public static Ingresar paginaRegistro(){
        return Tasks.instrumented(Ingresar.class);
    }
}
