package org.juego.customcomponent;

import javafx.animation.TranslateTransition;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class InterruptorAnimado extends StackPane {

    // --- REQUISITO: Al menos una propiedad ---
    private final BooleanProperty encendido = new SimpleBooleanProperty(false);

    // --- REQUISITO: Al menos un evento propio ---
    private EventHandler<ActionEvent> onAction;

    private Rectangle fondo;
    private Circle boton;

    public InterruptorAnimado() {
        initGraphics();
        initListeners();
    }

    private void initGraphics() {
        fondo = new Rectangle(50, 25, Color.GREY);
        fondo.setArcWidth(25);
        fondo.setArcHeight(25);

        boton = new Circle(12.5, Color.WHITE);
        boton.setTranslateX(-12.5); // Posición inicial (izquierda)

        this.getChildren().addAll(fondo, boton);
        // Hacemos que el StackPane tenga el tamaño del rectángulo
        this.setMaxSize(50, 25);
    }

    private void initListeners() {
        this.setOnMouseClicked(e -> {
            setEncendido(!isEncendido()); // Cambiar valor propiedad
            animar();                     // Ejecutar animación
            fireEvent();                  // Lanzar evento
        });
    }

    // --- REQUISITO: Al menos una animación sencilla ---
    private void animar() {
        TranslateTransition t = new TranslateTransition(Duration.millis(200), boton);
        t.setToX(isEncendido() ? 12.5 : -12.5);
        t.play();

        fondo.setFill(isEncendido() ? Color.LIGHTGREEN : Color.GREY);
    }

    // Métodos para el evento
    public void setOnAction(EventHandler<ActionEvent> handler) {
        this.onAction = handler;
    }

    private void fireEvent() {
        if (this.onAction != null) {
            this.onAction.handle(new ActionEvent(this, null));
        }
    }

    // Getters y Setters de la propiedad 'encendido'
    public boolean isEncendido() { return encendido.get(); }
    public void setEncendido(boolean estado) { this.encendido.set(estado); }
    public BooleanProperty encendidoProperty() { return encendido; }
}