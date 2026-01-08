# Herramientas y Librerías Utilizadas

## 1. Herramientas de Desarrollo (IDE y Gestión)
* **IntelliJ IDEA Community Edition:** Entorno de Desarrollo Integrado (IDE) utilizado para la escritura de código, depuración y ejecución de pruebas. Se ha elegido por su integración nativa con Maven y soporte para JavaFX.
* **Maven:** Herramienta de gestión de proyectos y comprensión de software. Se ha utilizado para gestionar las dependencias (librerías), compilar el código y automatizar el ciclo de vida del proyecto (test, package).
* **Git / GitHub:** Sistema de control de versiones utilizado para el seguimiento de cambios y repositorio remoto para el alojamiento del código.

## 2. Herramientas de Diseño
* **JavaFX API (Código):** El diseño de la interfaz gráfica del componente `InterruptorAnimado` se ha realizado de forma programática (mediante código Java) utilizando las clases `Rectangle` y `Circle` y contenedores `StackPane`, sin utilizar herramientas gráficas externas como SceneBuilder, para tener un control preciso de las animaciones.

## 3. Herramientas de Prueba
* **JUnit 5 (Jupiter):** Framework utilizado para realizar las pruebas unitarias de la lógica del componente (comprobar que la propiedad `encendido` cambia de valor correctamente).
* **TestFX:** Librería especializada para probar interfaces de usuario JavaFX. Permite simular interacciones humanas (clics de ratón) y verificar el estado visual de los nodos en tiempo real dentro del entorno de pruebas de JUnit.

## 4. Librerías del Proyecto
* **org.openjfx:javafx-controls:** Proporciona los componentes visuales básicos.
* **org.openjfx:javafx-graphics:** Necesaria para el renderizado y animaciones.
* **org.testfx:testfx-junit5:** Puente para integrar TestFX con JUnit 5.