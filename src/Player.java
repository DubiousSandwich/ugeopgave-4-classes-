public class Player {
//opgave 4
    private String name;
    private int skillLevel;

    public Player(String name, int skillLevel){
        this.name = name;
        this.skillLevel = skillLevel;
        if (skillLevel < 1){
            this.skillLevel = 1;
        } else if (skillLevel > 100){
            this.skillLevel = 100;
        }
    }
    @Override
    public String toString(){
        return "Player: " + name + " Skill level: " + skillLevel;
    }

}
