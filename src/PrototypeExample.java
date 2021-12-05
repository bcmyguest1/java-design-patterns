import domain.shape.Circle;

public class PrototypeExample {
    public static void main(String[] args) {
        Circle c1 = new Circle(123);
        System.out.println(String.format("First circle: %s", c1));

        Circle c2 = new Circle(c1);
        System.out.println(String.format("Second circle: %s", c2));

        c2.rad = 20;
        System.out.println(String.format("Edited second circle: %s", c2));
        System.out.println(String.format("First circle: %s", c1));
    }

}
