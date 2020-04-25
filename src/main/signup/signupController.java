package main.signup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.Main;
import main.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class signupController implements Initializable {
    @FXML
    private TextField usernameIn;
    @FXML
    private PasswordField passwordIn;
    @FXML
    private PasswordField passCheckIn;
    @FXML
    private Text passCheckLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void handleSignupButtonAction(ActionEvent event) {
        String uname = usernameIn.getText();
        String pword = passwordIn.getText();
        String pcheck = passCheckIn.getText();
        User u = new User();
        if(u.signupCheck(uname, pword, pcheck)) {
            Main.addUser(u);
            Main.setCurrentUser(u);
            closeStage();
            loadMain();
        }
        passCheckLabel.setVisible(true);
    }

    @FXML
    private void handleCancelButtonAction(ActionEvent event){
        closeStage();
        loadLogin();
    }

    @FXML
    private void handlePassRetry(MouseEvent event) {
        passCheckLabel.setVisible(false);
    }

    private void closeStage() {
        ((Stage)usernameIn.getScene().getWindow()).close();
    }

    void loadMain() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/main/main.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Zoultron");
            stage.setScene(new Scene(parent));
            stage.getScene().getStylesheets().add("main.css");
            stage.show();
        }
        catch (IOException ex){

        }
    }

    void loadLogin() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/main//login/login.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Zoultron");
            stage.setScene(new Scene(parent));
            stage.getScene().getStylesheets().add("login.css");
            stage.show();
        }
        catch (IOException ex){

        }
    }

}
