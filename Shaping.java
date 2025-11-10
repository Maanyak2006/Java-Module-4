// Shape.java
class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Circle.java
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

// Main.java
public class Shaping {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle:");
        circle.displayShape();
        System.out.println("Area of Circle: " + circle.area());

        System.out.println("\nRectangle:");
        rectangle.displayShape();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
