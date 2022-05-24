/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CalculateShape;

import java.util.Scanner;

class Triangle {
    int base;
    int height;

    public Triangle(int baseParam, int heightParam) {
        base = baseParam;
        height = heightParam;
    }

    public double getArea() {
        return base * height / 2;
    }
}

class Square {
    int side;

    public Square(int sideParam) {
        side = sideParam;
    }

    public double getArea() {
        return side * side;
    }
}

class Circle {
    int radius;

    public Circle(int radiusParam) {
        radius = radiusParam;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangular {
    int lengthSide;
    int widthSide;
    
//    Varargs Method Overload ( Java Optional Parameter Constructor )
    public Rectangular(Integer... sides) {
        System.out.println(sides.length);
        
        lengthSide = sides[0] != null ? sides[0] : 10;
        widthSide = sides[1] != null ? sides[1] : 10;
    }
    
    public double getArea() {
        return lengthSide * widthSide;
    }
}

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Triangle firstTriangle = new Triangle(10, 20);
        
        System.out.println("First Triangle");
        System.out.println("Area = " + firstTriangle.base + " Height = " + firstTriangle.height);
        System.out.println("First Triangle Area: " + firstTriangle.getArea());
        
        Square firstSquare = new Square(10);
        
        System.out.println("First Square");
        System.out.println("Side = " + firstSquare.side);
        System.out.println("First Square Area: " + firstSquare.getArea());
        
        System.out.println("Following line will ask you input, typing 0 will converted to 10 to prevent program error");
        System.out.println("Rectangle Calculator (Finding Area of Rectangle)");
        System.out.println("Rectangle Length Side: ");
        int firstRectangularLength = scanner.nextInt();
        System.out.println("Rectangle Width Side: ");
        int firstRectangularWidth = scanner.nextInt();
        Rectangular firstRectangular = new Rectangular(firstRectangularLength != 0 ? firstRectangularLength : null, firstRectangularWidth != 0 ? firstRectangularWidth : null);
        
        System.out.println("Length = " + firstRectangular.lengthSide + " Width = " + firstRectangular.widthSide);
        System.out.println("First Rectangle Area: " + firstRectangular.getArea());
    }
}
