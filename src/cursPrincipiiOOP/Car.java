package cursPrincipiiOOP;

public class Car implements Vehicle {
   private int currentSpeed;
   private int currentGear;
    public static final int NUMBER_OF_WHEELS = 4;

    @Override
    public void accelerate(int speed) {
        currentSpeed = currentSpeed + speed;
        //Sau currentSpeed+= speed;
    }

    @Override
    public void upGear() {
        if (currentGear < 6) {
            currentGear++;
        }
    }

    @Override
    public void downGear() {
        if(currentGear > 1){
            currentGear--;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public Car(int currentSpeed, int currentGear) {
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
    }
}
