package org.juego.customcomponent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane; // Usamos StackPane para centrarlo
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // 1. Creamos tu componente
        InterruptorAnimado miInterruptor = new InterruptorAnimado();

        // (Opcional) Podemos añadirle una acción para ver que funciona en la consola
        miInterruptor.setOnAction(e -> {
            System.out.println("El interruptor está: " + (miInterruptor.isEncendido() ? "ON" : "OFF"));
        });

        // 2. Lo metemos en un diseño (layout)
        StackPane root = new StackPane(miInterruptor);

        // 3. Configuramos la escena
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Custom Component");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}