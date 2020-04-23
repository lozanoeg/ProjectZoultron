import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Prototype extends Application {

   public void start(Stage primaryStage){
      
      
     
      Scene scene = new Scene(new LogInPane(), 500, 300);
      
      primaryStage.setTitle("Project Zoultron");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }

}