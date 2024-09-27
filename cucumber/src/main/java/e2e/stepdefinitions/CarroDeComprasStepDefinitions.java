package e2e.stepdefinitions;

import e2e.tasks.SeleccionarProductos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CarroDeComprasStepDefinitions {

    @Given("el usuario está en la página de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("selecciona dos productos de la categoría amor")
    public void seleccionaDosProductosDeLaCategoriaAmor() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductos.deLaCategoriaAmor());
    }

    @Then("los productos se agregan al carro de compras")
    public void losProductosSeAgreganAlCarroDeCompras() {
       
    }
}
 