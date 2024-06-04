interface Shape {
    // Abstract method 
   abstract void calculateArea(); 
}
class Circle implements Shape {
     double radius; double area;
     Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        this.area= Math.PI * radius * radius;
        System.out.println(this.area);
    }
}
class Rectangle implements Shape {
     double length; double area;
     double width;
     Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void calculateArea() {
        this.area= length * width;
      System.out.println(area);
    }
    
}
public class interfaces1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        circle.calculateArea();
        rectangle.calculateArea();
    }
}

