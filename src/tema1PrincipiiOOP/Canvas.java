package tema1PrincipiiOOP;

public class Canvas {
    public static void main(String[] args) {
        Circle circle= new Circle();
        Rectangle rectangle = new Rectangle();
        System.out.println("Aria cercului este: " + circle.computeArea());
        System.out.println("Aria dreptunghiului este: "+ rectangle.computeArea());
        circle.resize(30);
        System.out.println(circle.getRadius());
    }
}
