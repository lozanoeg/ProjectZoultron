public class Settings {
    
    public void passwordChange(User s){
        if(s.changePassword(String password, String passCheck) == true){
            System.out.print("Password has been changed");
        }
        else {
            System.out.print("Password has not been changed");
        }
    }
}
