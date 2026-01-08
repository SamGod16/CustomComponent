import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.juego.customcomponent.InterruptorAnimado;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import static org.junit.jupiter.api.Assertions.*;

public class InterruptorAnimadoTest extends ApplicationTest {

    private InterruptorAnimado interruptor;

    @Override
    public void start(Stage stage) {
        interruptor = new InterruptorAnimado();
        stage.setScene(new Scene(new VBox(interruptor), 100, 100));
        stage.show();
    }

    @Test
    public void testEstadoInicial() {
        // Verificar que inicia apagado
        assertFalse(interruptor.isEncendido(), "El interruptor debe iniciar apagado");
    }

    @Test
    public void testClickCambiaPropiedad() {
        // Simular click con TestFX
        clickOn(interruptor);

        // Verificar cambio de estado
        assertTrue(interruptor.isEncendido(), "Debe encenderse tras el primer click");

        // Simular segundo click
        clickOn(interruptor);
        assertFalse(interruptor.isEncendido(), "Debe apagarse tras el segundo click");
    }
}