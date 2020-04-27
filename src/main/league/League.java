package main.league;


import main.User;
import main.tournament.Tournament;

import java.util.ArrayList;

public class League {

    String leagueName;
    String ownerName;

    ArrayList<Tournament> tournaments = new ArrayList<Tournament>();
    ArrayList<String> players = new ArrayList<String>();

    public League(String name, String oName) {
        leagueName = name;
        ownerName = oName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    boolean inLeague(User s){
        if (players.contains(s.getUsername())){
            return true;
        }
        else {
            return false;
        }

    }
}
