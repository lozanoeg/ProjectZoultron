package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    @FXML
    private PasswordField newPass;

    @FXML
    private PasswordField newPassCheck;

    //Change to Hashmap and offload to database
    private static ArrayList<User> Users = new ArrayList<>();
    private static User currentUser;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/main/login/login.fxml"));
        primaryStage.setTitle("Zoultron");
        primaryStage.setScene(new Scene(root, 359, 400));
        primaryStage.setResizable(false);
        primaryStage.getScene().getStylesheets().add("login.css");
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
        Main.currentUser = currentUser;
    }

    @FXML
    private void handleCancelButtonAction(ActionEvent event){
        closeStage();
        loadLogin();
    }

    private void closeStage() {
        ((Stage)newPass.getScene().getWindow()).close();
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