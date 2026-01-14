# ⚡ CustomComponent: InterruptorAnimado

![Java](https://img.shields.io/badge/Java-21%2B-orange)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)

Bienvenido al repositorio oficial de **InterruptorAnimado**. Un componente personalizado para JavaFX que implementa un botón de tipo *toggle switch* moderno, con animaciones fluidas, propiedades observables y diseño vectorial.

Este proyecto ha sido desarrollado como una librería reutilizable, lista para ser integrada en cualquier aplicación JavaFX.

## 📸 Demo Visual

<img width="91" height="67" alt="image" src="https://github.com/user-attachments/assets/5f0f45f3-8d88-4097-a82b-3ccdbd55686c" />
<img width="91" height="67" alt="image" src="https://github.com/user-attachments/assets/8a435b72-5d14-4cac-b71a-86ed2f9972e4" />

*(Vista previa del componente en funcionamiento)*

---

## 🚀 Instalación y Descarga

Puedes integrar este componente en tu proyecto de dos formas:

### 1. Descarga Directa (.jar)
Descarga la última versión estable lista para usar desde la sección de **Releases**:
👉 **[Descargar InterruptorAnimado v1.0.jar](https://github.com/SamGod16/Componente-Future/releases/latest)**

### 2. Instalación con Maven
Si prefieres compilarlo tú mismo o añadirlo como dependencia local:

1. Clona el repositorio:
   ```bash
   git clone [https://github.com/SamGod16/Componente-Future.git](https://github.com/SamGod16/Componente-Future.git)
   ```
2. Instala la librería en tu repositorio local (.m2):
```
   mvn clean install
```
3. Añade la dependencia en el pom.xml de tu proyecto:
```
   <dependency>
    <groupId>org.juego</groupId>
    <artifactId>CustomComponent</artifactId>
    <version>1.0-SNAPSHOT</version>
   </dependency>
```
## 🛠️ Manual de Uso
El componente hereda de StackPane, por lo que es compatible con cualquier contenedor de JavaFX. Aquí tienes un ejemplo completo de cómo usarlo en tu código:


```Java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.juego.customcomponent.InterruptorAnimado;

public class MiApp extends Application {
    @Override
    public void start(Stage stage) {
        // 1. Instanciar el componente
        InterruptorAnimado miSwitch = new InterruptorAnimado();
        
        // 2. Suscribirse a eventos (Propiedad Observable)
        miSwitch.encendidoProperty().addListener((obs, oldVal, newVal) -> {
            System.out.println("El sistema está: " + (newVal ? "ENCENDIDO" : "APAGADO"));
        });

        // 3. (Opcional) Configurar estado inicial
        miSwitch.setEncendido(true);

        // 4. Añadir a la escena
        StackPane root = new StackPane(miSwitch);
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Demo Interruptor");
        stage.show();
    }
}
```

## ✅ Calidad y Tests
La fiabilidad es clave. Este componente incluye una batería de pruebas automatizadas utilizando JUnit 5 y TestFX para garantizar que tanto la lógica como la interfaz gráfica funcionan perfectamente.

## 📊 Informe de Resultados (Maven Surefire)

<img width="1664" height="771" alt="image" src="https://github.com/user-attachments/assets/00d5839e-2d68-4933-ace1-474060b49dea" />

### Tests Ejecutados: 2

### Tasa de Éxito: 100% 🟢

### Herramientas: JUnit 5, TestFX, Maven Surefire Plugin.

## 🤝 Colaboración y Contribuciones

¡Cualquier aportación es bienvenida! Si tienes una idea para una nueva animación, encuentras un *bug* o quieres mejorar la documentación, sigue estos pasos:

1. **Haz un Fork** del repositorio.
2. **Crea una nueva rama** para tu funcionalidad:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. **Realiza tus cambios y haz el commit** (intenta ser descriptivo):

   ```Bash
   git commit -m "Añade: Nueva animación de rotación"
   ```
4. **Sube tus cambios** a tu rama:

   ```
   Bash
   git push origin feature/nueva-funcionalidad
   ```
5. **Abre un Pull Request** en este repositorio original explicando tus mejoras.
