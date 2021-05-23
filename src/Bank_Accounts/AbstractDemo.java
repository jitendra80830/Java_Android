package Bank_Accounts;

abstract class Shape {
    String color;

    abstract double area();

    public abstract String toString();

    public String getColor(){
        return color;
    }


    public Shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;

    }
}
class Circle extends Shape{
    double redius;

    public Circle(String color,double redius) {
        super(color);
        System.out.println("Circle constructor called");
        this.redius = redius;
    }

    @Override
    double area() {
        return (Math.PI*redius*redius);
    }

    @Override
    public String toString() {
        return "Circle Color = "+super.getColor()+", Area of Circle = "+area();
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color,double length,double width){
        super(color);
        System.out.println("Rectangle constructor called ");
        System.out.println("");
        this.length = length;
        this.width = width;

    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color = "+super.getColor()+", Rectangle area = "+area();
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        Shape s1 = new Circle("Blue",2.4);
        Shape s2 = new Rectangle("Red",5,8);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
