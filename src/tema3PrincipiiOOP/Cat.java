package tema3PrincipiiOOP;

public class Cat extends Animal{

    public Cat(String name,int age) {
        super(name,age);
    }


   public void makeSound(){
       System.out.println("Pisica "+ getName() + " face miau");
    }
}
