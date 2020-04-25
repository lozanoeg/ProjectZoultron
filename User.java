package main;

public class User {
    private boolean admin = false;
    private boolean player = false;
    private boolean sponsor = false;
    private boolean leagueOwner = false;
    private boolean spectator = false;
    private String username = "";
    private String password = "";

    public boolean User(String username, String password, String passcheck) {
        if (password != passcheck)
        {
            return false;
        }
        this.username = username;
        this.password = password;
        return true;
    }

    public boolean changePassword(String password, String passcheck) {
        if (password != passcheck)
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
}
