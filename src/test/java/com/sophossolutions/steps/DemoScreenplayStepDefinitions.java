package com.sophossolutions.steps;

import com.sophossolutions.questions.ValidateTextField;
import com.sophossolutions.tasks.AgregarVestidoACarrito;
import com.sophossolutions.tasks.BuscarVestido;
import com.sophossolutions.userinterfaces.EveningDresses;
import com.sophossolutions.userinterfaces.HomePageYourLogo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class DemoScreenplayStepDefinitions {
    @Before
    public void  setup(){
        setTheStage(new OnlineCast());
    }

    @Given("^Necesito buscar un vestido$")
    public void necesitoBuscarUnVestido() {
        theActorCalled("Practicante").wasAbleTo(Open.browserOn(new HomePageYourLogo()));
        theActorInTheSpotlight().attemptsTo(BuscarVestido.buscarVestido());
    }

    @When("^El tipo de vestido es nocturno$")
    public void elTipoDeVestidoEsNocturno() {
        theActorInTheSpotlight().attemptsTo(AgregarVestidoACarrito.agregar());
    }

    @Then("^Valido que el vestido sea agregado al carrito de compras$")
    public void validoQueElVestidoSeaAgregadoAlCarritoDeCompras() {

        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(EveningDresses.QUANTITY),equalTo("1")));

    }

}
