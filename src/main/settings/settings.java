package main.settings;

import main.User;

public class settings {
    private String password;
    private String passCheck;
    public void passwordChange(User s){
        if(s.changePassword(password,passCheck) == true){
            System.out.print("Password has been changed");
        }
        else {
            System.out.print("Password has not been changed");
        }
    }
}
