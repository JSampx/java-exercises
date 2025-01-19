import entities.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.printf("%.2f" + "m2", circle.getArea());

    }
}