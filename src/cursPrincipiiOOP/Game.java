package cursPrincipiiOOP;

public class Game {
    public static void main(String[] args) {
//      PlayerCharacter player1 = new PlayerCharacter("Mihaela",30);
//        player1.speak();
//        System.out.println(player1.getName());
//        player1.setName("Oli");
//        System.out.println(player1.getName());



        cursPrincipiiOOP.Archer archer1 = new cursPrincipiiOOP.Archer("John", 34,1, 12);
        archer1.attack();
        cursPrincipiiOOP.Wizard wizard1 = new cursPrincipiiOOP.Wizard("Ela", 50,1, 89);
        wizard1.speak();
        System.out.println(wizard1 instanceof cursPrincipiiOOP.PlayerCharacter);
        System.out.println(wizard1 instanceof cursPrincipiiOOP.Wizard);
        System.out.println(wizard1 instanceof Object);
        archer1.attack();
        wizard1.attack();
        //System.out.println(wizard.get);

    }

    public static void playerAttack(cursPrincipiiOOP.PlayerCharacter playerCharacter) {
        playerCharacter.attack();
    }

    public static void initAttacks(cursPrincipiiOOP.PlayerCharacter[] characters) {
        for (int i = 0; i < characters.length; i++) {
            characters[i].attack();
        }



    }
}

