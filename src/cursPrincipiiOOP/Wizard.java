package cursPrincipiiOOP;

public class Wizard extends PlayerCharacter {
    private int power;

    public Wizard(String name,int age,int power,int currentLevel){
        super(name,age,currentLevel);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

   public void attack(){
       System.out.println("Attacking with power " + power);
   }

    @Override
    public String toString() {
        return "cursPrincipiiOOP.Wizard{" +
                "power=" + power +
                '}';
    }
    @Override
    public void levelUp(){
        int level = getCurrentLevel() + 1;
        setCurrentLevel(level);
        power += 50;
    }

}