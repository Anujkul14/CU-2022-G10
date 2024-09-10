interface GeometricObject
{
    int x = 10;
    double getPerimeter();
    double getArea();
    void print();
    static void fun1()
    {
        System.out.println("Static method in Geometric Interface");
    }

    default void fun2()
    {
        System.out.println("default method in interface,may or may not be override");
        fun3();
    }

    default void fun4()
    {
        System.out.println("default method 2 in interface,may or may not be override");
        fun3();
    }

    private void fun3()
    {
        System.out.println("Used to avoid code duplication");
    }

}

interface Resizable
{
            void resize(int percent);
            void print();
}

class Circle implements GeometricObject,Resizable
{
    double radius;
    // Default constructor initializing the radius to 0
    public Circle() {
        this.radius = 0;
    }

    // Parameterized constructor to initialize the radius with a given value
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to return the radius of the circle
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    @Override
    public void resize(int percent)
    {
        this.radius = radius + (radius * percent/100.0);
    }
    @Override
    public void print()
    {
        System.out.println("Print method present in both interface");
    }
}
public class Main {
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        System.out.println("Radius:"+obj.radius);
        System.out.println("Perimeter:"+obj.getPerimeter());
        System.out.println("Area:"+obj.getArea());

        GeometricObject.fun1();
    }
}