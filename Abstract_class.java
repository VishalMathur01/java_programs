import java.util.Scanner;
abstract class Shape{
    static int a , b;
    abstract int printArea();
}

class Rectangle extends Shape{
    int printArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of a rectangle");
        super.a = sc.nextInt();
        super.b = sc.nextInt();
        return (a*b);
    }
}
class Circle extends Shape{
    int printArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        super.a = sc.nextInt();
        return (int) (3.14*a*a);
    }
}
class Triangle extends Shape{
    int printArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of a triangle: ");
        super.a = sc.nextInt();
        super.b = sc.nextInt();
        return (int)(0.5*a*b);
    }
}
class Abstract_class {
    public static void main(String [] args){
        Shape o;
        o = new Rectangle();
        System.out.println("Area: "+ o.printArea());
        o = new Circle();
        System.out.println("Area: "+ o.printArea());
        o = new Triangle();
        System.out.println("Area: "+ o.printArea());
    }
}