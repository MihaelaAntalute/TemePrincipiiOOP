package tema1PrincipiiOOP;

public class Circle implements Shape ,Resizable{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea(){
        double areaCircle =  Math.PI * (radius * radius);
        return areaCircle;
    }
    public void resize(double percent){
        radius = radius * (percent/100);
    }


}