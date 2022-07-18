package tema3PrincipiiOOP;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("azor",3);
        Cat cat = new Cat("Fifi",2);
        Animal []animals = new Animal[20];
        Shelter shelter = new Shelter(animals);
        shelter.addAnimal(dog);
        shelter.addAnimal(cat);
        shelter.getAnimals();
        shelter.makeNoise();
    }

}
