import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p){
        players.add(p);
        System.out.println("Player " + p.toString() + " added!");
    }

    public int getAverageSkill(){
        int players = this.players.size();
        int sum = 0;
        for (Player player : this.players){
            sum += player.getSkillLevel();
        }
        return sum/players;
    }

    public void printTeam(){
        System.out.println(teamName);
        for (Player player : players){
            System.out.println(player.toString());
        }
    }

    public void compete()

}
