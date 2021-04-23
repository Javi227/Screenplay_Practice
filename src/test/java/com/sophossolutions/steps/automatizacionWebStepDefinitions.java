package com.sophossolutions.steps;

import com.sophossolutions.tasks.Ingresar;
import com.sophossolutions.tasks.IngresarAddress;
import com.sophossolutions.tasks.IngresarDevices;
import com.sophossolutions.tasks.IngresarInformacion;
import com.sophossolutions.userInterfaces.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class automatizacionWebStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("^\"([^\"]*)\" accede a la url de la web$")
    public void accedeALaUrlDeLaWeb(String arg1) {
        theActorCalled("Usuario").wasAbleTo(Open.browserOn(new HomePage()));
        theActorInTheSpotlight().attemptsTo(Ingresar.paginaRegistro());
    }

    @When("^Agrego informacion solicitada$")
    public void agregoInformacionSolicitada(DataTable info) {
    theActorInTheSpotlight().attemptsTo(IngresarInformacion.personal(info),
            IngresarAddress.user(info),
            IngresarDevices.user(info)
            );

    }

    @Then("^Valida que este en la pagina dos$")
    public void validaQueEsteEnLaPaginaDos() {

    }

}
