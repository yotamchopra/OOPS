package abstraction;

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling abstraction.Shape constructor
        super(color);
        System.out.println("abstraction.Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "abstraction.Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}
