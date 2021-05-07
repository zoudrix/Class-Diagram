package olyDelegation;

public class Player extends Person{
    private  int playerId;
    private  int numMedal;
    public String coachName;
    public String team;
    public String medal;

    public void setNumMedal(int numMedal) {
        this.numMedal = numMedal;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getNumMedal() {
        return numMedal;
    }

    public int getPlayerId() {
        return playerId;
    }
    public String assignCoach(String coachName){
        coachName=this.coachName;
        return coachName;
    }
    public String assignTeam(String team){
        team=this.team;
        return team;
    }
    public String assignMedal(String medal){
        medal=this.medal;
        return medal;
    }
}
