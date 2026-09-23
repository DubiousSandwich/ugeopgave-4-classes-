package Opgave1234;

public class Product {
//opgave 2
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    void printInfo(){
        System.out.println(this.name + " " + this.price + "kr tag: ");
        for (int i = 0; i < tags.length;i++){
            System.out.print(this.tags[i] + ", ");
        }
        System.out.println(" ");
    }
    boolean hasTag(String tag){
        for (String t : tags){
            if (t.equals(tag)){
                return true;
            }
        }
        return false;
    }

}
