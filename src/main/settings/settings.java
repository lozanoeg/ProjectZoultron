package main.settings;

import main.User;

public class settings {
    private String password;
    private String passCheck;
    public static boolean passwordChange(User s, String password, String passCheck){

        if(s.changePassword(password, passCheck)){
            return true;
        }
        else {
            return false;
        }
    }
}
