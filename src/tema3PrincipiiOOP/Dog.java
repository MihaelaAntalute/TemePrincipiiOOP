package tema3PrincipiiOOP;

public class Dog extends Animal{

    public Dog(String name,int age){
        super(name,age);
    }


    public void makeSound(){
        System.out.println("Cainele " + getName() + "latra");
    }

}
