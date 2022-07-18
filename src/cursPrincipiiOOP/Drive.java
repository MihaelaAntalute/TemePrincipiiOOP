package cursPrincipiiOOP;

import cursPrincipiiOOP.Bycicle;
import cursPrincipiiOOP.Car;

public class Drive {
    public static void main(String[] args) {
        Car car = new Car(0,0);
        Bycicle bycicle = new Bycicle(0,0);
        accelerate(car,25);
        accelerate(bycicle,7);
        System.out.println("Viteza masinii este " + car.getCurrentSpeed());
        System.out.println( "Viteza bicicletei este " + bycicle.getCurrentSpeed());
    }

    public static void accelerate(Vehicle vehicle, int speed){
        vehicle.accelerate(speed);
    }
}
