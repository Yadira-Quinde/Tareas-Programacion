package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    private ListView<String> listView;
    private TextField newInfoTextField;
    private Map<String, String> labelData;

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();

            // Crear el AnchorPane para las imágenes y etiquetas
            AnchorPane leftPane = new AnchorPane();

            // Cargar las imágenes
            Image imagen1 = new Image("file:///C:/Users/quind/git/P_tarea/P_tarea/imagenes/Foto1.png");
            Image imagen2 = new Image("file:///C:/Users/quind/git/P_tarea/P_tarea/imagenes/Foto2.png");
            Image imagen3 = new Image("file:///C:/Users/quind/git/P_tarea/P_tarea/imagenes/Foto3.png");
            Image imagen4 = new Image("file:///C:/Users/quind/git/P_tarea/P_tarea/imagenes/Foto4.png");
            // Crear ImageViews y ajustar tamaño
            
            ImageView imageView1 = new ImageView(imagen1);
            ImageView imageView2 = new ImageView(imagen2);
            ImageView imageView3 = new ImageView(imagen3);
            ImageView imageView4 = new ImageView(imagen4);

            double imageWidth = 80;
            double imageHeight = 80;

            imageView1.setFitWidth(imageWidth);
            imageView1.setFitHeight(imageHeight);
            imageView2.setFitWidth(imageWidth);
            imageView2.setFitHeight(imageHeight);
            imageView3.setFitWidth(imageWidth);
            imageView3.setFitHeight(imageHeight);
            imageView4.setFitWidth(imageWidth);
            imageView4.setFitHeight(imageHeight);


            // Crear etiquetas para las imágenes
            Label label1 = new Label("JOSE RAMIRES VARGAS", imageView1);
            Label label2 = new Label("MARIA JUANA DE LA CRUZ", imageView2);
            Label label3 = new Label("ALICIA ESPINOZA MENDEZ", imageView3);
            Label label4 = new Label("JENNY VERA CASTILLO", imageView4);

            // Datos almacenados para cada etiqueta
            labelData = new HashMap<>();
            labelData.put("Etiqueta 1", "Fecha de nacimiento: 01/01/2000, Cédula: 8703765445, Edad: 24, Teléfono: 1234567890, Email: joser@gmail.com");
            labelData.put("Etiqueta 2", "Fecha de nacimiento: 24/07/2010, Cédula: 0987537823, Edad: 14, Teléfono: 0987654321, Email: juanad@hotmail.com");
            labelData.put("Etiqueta 3", "Fecha de nacimiento: 03/09/2002, Cédula: 9893893462, Edad: 22, Teléfono: 1122334455, Email: aliciae@yahoo.com");
            labelData.put("Etiqueta 4", "Fecha de nacimiento: 18/10/2007, Cédula: 5566778832, Edad: 17, Teléfono: 5566778899, Email: jennyv@hotmail.com");
            
            // Manejo de eventos para clics en las etiquetas
            label1.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 1")));
            label2.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 2")));
            label3.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 3")));
            label4.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 4")));

            // Ubicar elementos en el AnchorPane
            leftPane.getChildren().addAll(label1, label2, label3, label4);

            // Posicionar las etiquetas de forma vertical sin tocarse
            AnchorPane.setTopAnchor(label1, 20.0);
            AnchorPane.setLeftAnchor(label1, 20.0);

            AnchorPane.setTopAnchor(label2, 120.0);
            AnchorPane.setLeftAnchor(label2, 20.0);

            AnchorPane.setTopAnchor(label3, 220.0);
            AnchorPane.setLeftAnchor(label3, 20.0);

            AnchorPane.setTopAnchor(label4, 320.0);
            AnchorPane.setLeftAnchor(label4, 20.0);

            // Configuración de la parte derecha del BorderPane
            AnchorPane rightPane = new AnchorPane();

            listView = new ListView<>();
            rightPane.getChildren().add(listView);
            
            AnchorPane.setTopAnchor(listView, 20.0);
            AnchorPane.setLeftAnchor(listView, 160.0);
            AnchorPane.setRightAnchor(listView, 20.0);
            AnchorPane.setBottomAnchor(listView, 150.0);

            newInfoTextField = new TextField();
            newInfoTextField.setPromptText("Ingresa nueva información aquí...");
            newInfoTextField.setStyle("-fx-background-color: blue; -fx-text-fill: white;");

         // Para el ListView
            listView.setStyle("-fx-background-color: black; -fx-text-fill: blue;");
            rightPane.getChildren().add(newInfoTextField);

            AnchorPane.setBottomAnchor(newInfoTextField, 60.0);
            AnchorPane.setLeftAnchor(newInfoTextField, 390.0);
            AnchorPane.setRightAnchor(newInfoTextField, 20.0);

            // Guardar información al presionar Enter
            newInfoTextField.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    String newText = newInfoTextField.getText();
                    if (!newText.isEmpty()) {
                        listView.getItems().add(newText);
                        newInfoTextField.clear();
                    }
                }
            });

            root.setLeft(leftPane);
            root.setRight(rightPane);

            // Crear la escena y mostrarla
            Scene scene = new Scene(root, 850, 675);
            // Aquí puedes agregar estilos CSS o modificar las propiedades directamente si lo deseas
            // Ejemplo:
            // listView.setStyle("-fx-background-color: lightblue;");
            // newInfoTextField.setStyle("-fx-background-color: lightgray;");
            primaryStage.setTitle("¨Proyecto 1");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}