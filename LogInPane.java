import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class LogInPane extends GridPane {

   public LogInPane() {
      Font font = new Font("Arial", 18);
   
      Label username = new Label("Username :");
      username.setFont(font);
      username.setTextFill(Color.WHITE);
      GridPane.setHalignment(username, HPos.RIGHT);
   
      Label password = new Label("Password :");
      password.setFont(font);
      password.setTextFill(Color.WHITE);
      GridPane.setHalignment(password, HPos.RIGHT);
   
      TextField usernameIn = new TextField();
      usernameIn.setFont(font);
      usernameIn.setPrefWidth(200);
      usernameIn.setAlignment(Pos.BASELINE_LEFT);
      
      TextField passwordIn = new TextField();
      passwordIn.setFont(font);
      passwordIn.setPrefWidth(200);
      passwordIn.setAlignment(Pos.BASELINE_LEFT);
   
      setAlignment(Pos.CENTER);
      setHgap(20);
      setVgap(10);
      setStyle("-fx-background-color: #496e9c");
      
      Button login = new Button("LOGIN");
      login.setOnAction(this::processCredentials);
      
      Button signup = new Button("SIGN UP");
      signup.setOnAction(this::newUser);
   
      add(username, 0, 0);
      add(usernameIn, 1, 0);
      add(password, 0, 1);
      add(passwordIn, 1, 1);
      add(login, 1, 3);
      add(signup, 0, 3);
      
   
      
   }

   public void processCredentials(ActionEvent event) {
   
   }


}
