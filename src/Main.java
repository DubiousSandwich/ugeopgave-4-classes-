public class Main {
    static Product[] products = new Product[5];

    public static void main(){

        //opgave 1
        /*
        Student student1 = new Student("Bo" , 32);
        Student student2 = new Student("Kirsten" , 62);
        Student student3 = new Student("Karl" , 14);

        Student[] students = {student1,student2,student3};

        for (Student student : students){
            student.printInfo();
        }

        Student oldest = students[0];
        for (Student student : students){
            if (oldest.age < student.age){
                oldest = student;
            }
        }

        System.out.println("Oldest student: ");
        oldest.printInfo();

         */

        //opgave 2
        /*
        products[0]= new Product("Skindsæk", 100.0, new String[]{"mediteranian", "sale"});
        products[1]= new Product("Olivenolie", 85.0, new String[]{"mediteranian"});
        products[2]= new Product("Tomatsovs", 20.0, new String[]{"food"});
        products[3]= new Product("Rosmarin", 15.0, new String[]{"food", "spices", "sale"});
        products[4]= new Product("Oregano", 25.0, new String[]{"food", "spices", "sale"});

        for (Product product : products){
            if (product.hasTag("sale")){
                product.printInfo();
            }
        }

        findMostExpensive();

         */

        //opgave 3
        /*
        BankAccount bank = new BankAccount("Naya", 2000.0);
        bank.deposit(1000.0);
        bank.withdraw(500.0);

        bank.printAccount();

         */

        //opgave 4




    }

    /*
    public static void findMostExpensive(){
        Product mostExpensive = products[0];
        for (Product product : products){
            if (product.price > mostExpensive.price){
                mostExpensive = product;
            }
        }
        System.out.println("Most expensive: ");
        mostExpensive.printInfo();
    }*/

}
