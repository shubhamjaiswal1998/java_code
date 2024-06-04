 abstract class Shape {
    // Abstract method for calculating the area
     abstract  double calculateArea();
   // Concrete method
     void displayInfo() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
     double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
class Rectangle extends Shape {
     double length;
     double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
     double calculateArea() {
        return length * width;
    }
}
public class abstraction {
    public static void main(String[] args) {
        // Create instances of concrete subclasses
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
       // Call methods on shapes
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

