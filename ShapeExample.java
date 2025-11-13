public class ShapeExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.displayShape();
        c.calculateArea(5); 
        r.calculateArea(6, 4);
    }
}
class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
