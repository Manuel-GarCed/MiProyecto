
package layotfx;

import static java.awt.Adjustable.HORIZONTAL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LayotFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button1");
        Button btn2 = new Button("Button2");
        Button btn3 = new Button("Button3");
        Button btn4 = new Button("Button4");
        Button btn5 = new Button("Button5");
        
        FlowPane root = new FlowPane(Orientation.HORIZONTAL, 10,10);
        
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
