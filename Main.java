package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	public void start(Stage escenarioPrincipal) {
		try {
			//Declaracion de elementos
			HBox barraHorizontal = new HBox();
			Tooltip tooltip1 = new Tooltip("Hola, soy un Tooltip. Sirvo para explicar la función de este botón, que realmente es ninguna la verdad...");
			Button boton1 = new Button("Botón");
			Scene escena1 = new Scene(barraHorizontal,300,200);
			
			//Propiedades del Tooltip
			tooltip1.setMaxWidth(150);
			tooltip1.setGraphic(new ImageView("file:C:\\2 DAM David Sanchez\\1º Proyectos\\Eclipse\\PruebaTooltip\\src\\application\\nba.png"));
			tooltip1.setTextAlignment(TextAlignment.RIGHT);
			tooltip1.setGraphicTextGap(30);
			tooltip1.setWrapText(true);
			
			//Composicion
			escenarioPrincipal.setTitle("Prueba de Tooltip");
			boton1.setTooltip(tooltip1);
			barraHorizontal.getChildren().add(boton1);
			escena1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
			//Mostrar
			escenarioPrincipal.setScene(escena1);
			escenarioPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
