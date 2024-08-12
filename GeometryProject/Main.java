public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(7.0),
                new Triangle(3.0, 4.0),
                new Square(2.0)
        };

        double totalArea = ShapeUtils.getTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}