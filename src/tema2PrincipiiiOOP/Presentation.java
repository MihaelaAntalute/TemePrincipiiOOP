package tema2PrincipiiiOOP;

public class Presentation {
    public static void main(String[] args) {
       Student Monica = new Student("Popescu","Monica","12C");
       Teacher George = new Teacher("Ionescu","George","Liceul teoretic","matematica");
       Monica.introduce();
       George.introduce();

    }
}
