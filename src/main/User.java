package main;

public class User {
    private boolean admin = false;
    private boolean player = false;
    private boolean sponsor = false;
    private boolean leagueOwner = false;
    private boolean spectator = false;
    private String username = "admin";
    private String password = "bum";
    private String passcheck = "";

    public User() {

    }

    public boolean signupCheck(String username, String password, String passcheck) {
        this.username = username;
        this.password = password;
        this.passcheck = passcheck;

        if (Main.getUserList().contains(this)) {
            return false;
        }

        if (!password.equals(passcheck))
            return false;

        return true;
    }

    //change to hashmap functionality
    //checks to see if Login info is correct
    public boolean loginCheck(String username, String password) {
        this.username = username;
        for(User u : Main.getUserList()){
            if (u.getUsername().equals(this.username)) {
                if (u.getPassword().equals(this.password)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean changePassword(String password, String passcheck) {
        if (!password.equals(passcheck))
        {
            return false;
        }
        this.password = password;
        return true;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public boolean getAdmin() {
        return admin;
    }
    public boolean getPlayer() {
        return player;
    }
    public boolean getSponser() {
        return sponsor;
    }
    public boolean getLeagueOwner() {
        return leagueOwner;
    }
    public boolean getSpectator() {
        return spectator;
    }

    public boolean equals(User u) {
        if (this.username.equals(u.getUsername())) {
            return true;
        }
        else return false;
    }
}
