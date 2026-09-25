package Opgave6;

import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playerName, int maxCapacity){
        this.playerName = playerName;
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        if (items.size() < maxCapacity){
            items.add(item);
        }
    }
    public int getTotalValue(){
        int sum = 0;
        for (Item item : items){
            sum += item.getValue();
        }
        return sum;
    }
    public ArrayList<Item> findItemByType(String type){
        ArrayList<Item> itemsType = new ArrayList<>();
        for (Item item : items){
            if (type.equals(item.getType())){
                itemsType.add(item);
            }
        }
        return itemsType;
    }
    public void printInventory(){
        for (Item item : items){
            System.out.println(item.toString());
        }
    }
}
