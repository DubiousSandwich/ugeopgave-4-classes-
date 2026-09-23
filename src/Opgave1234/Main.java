package Opgave1234;

public class Main {
    static Product[] products = new Product[5];

    public static void main(){

        //opgave 1
        /*
        Opgave1234.Student student1 = new Opgave1234.Student("Bo" , 32);
        Opgave1234.Student student2 = new Opgave1234.Student("Kirsten" , 62);
        Opgave1234.Student student3 = new Opgave1234.Student("Karl" , 14);

        Opgave1234.Student[] students = {student1,student2,student3};

        for (Opgave1234.Student student : students){
            student.printInfo();
        }

        Opgave1234.Student oldest = students[0];
        for (Opgave1234.Student student : students){
            if (oldest.age < student.age){
                oldest = student;
            }
        }

        System.out.println("Oldest student: ");
        oldest.printInfo();

         */

        //opgave 2
        /*
        products[0]= new Opgave1234.Product("Skindsæk", 100.0, new String[]{"mediteranian", "sale"});
        products[1]= new Opgave1234.Product("Olivenolie", 85.0, new String[]{"mediteranian"});
        products[2]= new Opgave1234.Product("Tomatsovs", 20.0, new String[]{"food"});
        products[3]= new Opgave1234.Product("Rosmarin", 15.0, new String[]{"food", "spices", "sale"});
        products[4]= new Opgave1234.Product("Oregano", 25.0, new String[]{"food", "spices", "sale"});

        for (Opgave1234.Product product : products){
            if (product.hasTag("sale")){
                product.printInfo();
            }
        }

        findMostExpensive();

         */

        //opgave 3
        /*
        Opgave1234.BankAccount bank = new Opgave1234.BankAccount("Naya", 2000.0);
        bank.deposit(1000.0);
        bank.withdraw(500.0);

        bank.printAccount();

         */

        //opgave 4

        Team team1 = new Team("The Teamy Opgave1234.Team");
        team1.addPlayer(new Player("Svendhilda", 20));
        team1.addPlayer(new Player("Bo Børgesen", 35));
        team1.addPlayer(new Player("Gert Gertrude", 30));
        team1.addPlayer(new Player("Bartolomæus", 20));

        Team team2 = new Team("The Not So Teamy Opgave1234.Team");
        team2.addPlayer(new Player("Magic Mike", 20));
        team2.addPlayer(new Player("The Less Magic Mike", 40));
        team2.addPlayer(new Player("Evil Wizard One", 30));
        team2.addPlayer(new Player("Gibeon", 20));

        team1.printTeam();
        team2.printTeam();

        team2.compete(team1);


    }

    /*
    public static void findMostExpensive(){
        Opgave1234.Product mostExpensive = products[0];
        for (Opgave1234.Product product : products){
            if (product.price > mostExpensive.price){
                mostExpensive = product;
            }
        }
        System.out.println("Most expensive: ");
        mostExpensive.printInfo();
    }*/

}
