package main.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;


public class loginController implements Initializable {
    @FXML
    private TextField usernameIn;
    @FXML
    private PasswordField passwordIn;
    @FXML
    private Text passLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void handleLoginButtonAction (ActionEvent event) {

        String uname = usernameIn.getText();
        String pword = passwordIn.getText();
        User u = new User();
        if (u.loginCheck(uname, pword)) {
            closeStage();
            loadMain();
        }
        //for testing
        /*if (true) {
            closeStage();
            loadMain();
        }*/
        passLabel.setVisible(true);
    }

    @FXML
    private void handleSignupButtonAction(ActionEvent event) {
        closeStage();
        loadSignup();
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

    void loadSignup() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/main/signup/signup.fxml"));
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
