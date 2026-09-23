package Opgave1234;

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
        System.out.println(p.toString() + " added!");
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
        System.out.println("\n" + teamName);
        for (Player player : players){
            System.out.println(player.toString());
        }
    }

    public void compete(Team opponent){
        System.out.println("\n" + this.teamName + " competes against " + opponent.teamName + "\n");
        if (this.getAverageSkill() > opponent.getAverageSkill()){
            System.out.println(this.teamName + " wins!");
        } else if (opponent.getAverageSkill() > this.getAverageSkill()){
            System.out.println(opponent.teamName + " wins!");
        }
    }

}
