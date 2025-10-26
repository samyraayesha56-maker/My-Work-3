import java.util.*;
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
    void area() {
        double a = 0.5 * base * height;
        System.out.println("Area of Triangle: " + a);
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void area() {
        double a = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height for Triangle:");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle t = new Triangle(b, h);
        t.area();

        System.out.println("Enter length and width for Rectangle:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle r = new Rectangle(l, w);
        r.area();

        System.out.println("Enter radius for Circle:");
        double rad = sc.nextDouble();
        Circle c = new Circle(rad);
        c.area();
    }
}
