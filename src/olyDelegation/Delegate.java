package olyDelegation;

public class Delegate {
    private String country;

    Delegate(){
        Player player = new Player();
        Coach coach = new Coach(player);

    }

    public void addPlayer(){}
    public void addCoach(){}
    public void getNumPlayers(){}
}
