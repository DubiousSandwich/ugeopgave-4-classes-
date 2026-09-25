package Opgave6;

public class Item {

    private String name;
    private int value;
    private String type;
    private static int totalItemsCreated;

    public Item(String name, int value, String type){
        this.name = name;
        this.value = value;
        this.type = type;
        totalItemsCreated++;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
    public String getType(){
        return type;
    }
    public static int getTotalItemsCreated(){
        return totalItemsCreated;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Value: " + value + " | Type: " + type;
    }
}
