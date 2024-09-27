package e2e.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProductos implements Task {

    public static Task deLaCategoriaAmor() {
        return instrumented(SeleccionarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on("//selector-for-product-1"),
            Click.on("//selector-for-product-2")
        );
    }
}
