package abstraction;

// Define an interface named Shape
interface ShapeI {
    double calculateArea(); // Abstract method for
    // calculating the area
}

// Implement the interface in a class named Circle
class CircleI implements ShapeI {
    private double radius;

    // Constructor for Circle
    public CircleI(double radius) { this.radius = radius; }

    // Implementing the abstract method from the Shape
    // interface
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

// Implement the interface in a class named Rectangle
class RectangleI implements ShapeI {
    private double length;
    private double width;

    // Constructor for Rectangle
    public RectangleI(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method from the Shape
    // interface
    public double calculateArea() { return length * width; }
}

// Main class to test the program
public class InterfaceExample {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        CircleI myCircle = new CircleI(5.0);
        RectangleI myRectangle = new RectangleI(4.0, 6.0);

        // Calculating and printing the areas
        System.out.println("Area of Circle: "
                + myCircle.calculateArea());
        System.out.println("Area of Rectangle: "
                + myRectangle.calculateArea());
    }
}