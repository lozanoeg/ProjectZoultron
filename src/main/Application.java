package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.settings.settings;

import java.io.IOException;
import java.util.ArrayList;

public class Application extends javafx.application.Application {

    @FXML
    private PasswordField newPass;

    @FXML
    private PasswordField newPassCheck;

    @FXML
    private Text warning;

    @FXML
    private Text warning2;

    @FXML
    private Text passChangeText;

    //Change to Hashmap and offload to database
    private static ArrayList<User> Users = new ArrayList<>();
    private static User currentUser;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Zoultron");
        primaryStage.setScene(new Scene(root, 359, 400));
        primaryStage.setResizable(false);
        primaryStage.getScene().getStylesheets().add("main.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static ArrayList<User> getUserList(){
        return Users;
    }

    public static boolean addUser(User user) {
        Users.add(user);
        return true;
    }

    public static void setCurrentUser(User currentUser) {
        Application.currentUser = currentUser;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    @FXML
    private void handleCancelButtonAction(ActionEvent event){
        closeStage();
        loadLogin();
    }

    @FXML
    private void handleLeagueButtonAction(ActionEvent event) {
        warning.setVisible(true);
        new Thread( new Runnable() {
            public void run()  {
                try  { Thread.sleep( 10000 ); }
                catch (InterruptedException ie)  {}
                warning.setVisible(false);
            }
        } ).start();
    }

    @FXML
    private void handleTournamentButtonAction(ActionEvent event) {
        warning2.setVisible(true);
        new Thread( new Runnable() {
            public void run()  {
                try  { Thread.sleep( 10000 ); }
                catch (InterruptedException ie)  {}
                warning2.setVisible(false);
            }
        } ).start();
    }

    @FXML
    private void handlePasswordChange(ActionEvent event) {
        setCurrentUser(new User());
        if(settings.passwordChange(Application.getCurrentUser(),newPass.getText(), newPassCheck.getText())) {
            passChangeText.setText("Password has been changed!");
            passChangeText.setVisible(true);
            new Thread( new Runnable() {
                public void run()  {
                    try  { Thread.sleep( 5000 ); }
                    catch (InterruptedException ie)  {}
                    passChangeText.setVisible(false);
                }
            } ).start();
        }
        else{
            passChangeText.setText("Password has not been changed!");
            passChangeText.setVisible(true);
            new Thread( new Runnable() {
                public void run()  {
                    try  { Thread.sleep( 5000 ); }
                    catch (InterruptedException ie)  {}
                    passChangeText.setVisible(false);
                }
            } ).start();
        }
    }

    private void closeStage() {
        ((Stage)newPass.getScene().getWindow()).close();
    }

    void loadLogin() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Zoultron");
            stage.setResizable(false);
            stage.setScene(new Scene(parent));
            stage.getScene().getStylesheets().add("login.css");
            stage.show();
        }
        catch (IOException ex){

        }
    }
}