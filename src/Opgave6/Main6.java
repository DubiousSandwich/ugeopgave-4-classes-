package Opgave6;

public class Main6 {

    public static void main(){

        Inventory player1 = new Inventory("Bo", 7);
        Inventory player2 = new Inventory("Steen", 4);

        player1.addItem(new Item("hammer",120,"tool"));
        player1.addItem(new Item("burger",20,"food"));
        player1.addItem(new Item("pizza",35,"food"));
        player1.addItem(new Item("screwdriver",80,"tool"));
        player1.addItem(new Item("sword",200,"weapon"));
        player1.addItem(new Item("bow",150,"weapon"));

        player2.addItem(new Item("screwdriver",80,"tool"));
        player2.addItem(new Item("hammer",120,"tool"));
        player2.addItem(new Item("burger",20,"food"));
        player2.addItem(new Item("pizza",35,"food"));

        player1.printInventory();
        System.out.println(" ");
        player2.printInventory();

        System.out.println(Item.getTotalItemsCreated());

        System.out.println(player1.getTotalValue());
        System.out.println(player2.getTotalValue());

        System.out.println(" ");

        System.out.println(player1.findItemByType("tool"));


    }

}
