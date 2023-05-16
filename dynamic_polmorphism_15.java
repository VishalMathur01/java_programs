import java.util.Scanner;
interface hello_world{
   public void runner(int a, int b);
}
class poly implements hello_world{
    public void runner(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
}

class morphism implements hello_world{
    public void runner(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
}
public class dynamic_polmorphism_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        poly o = new poly();
        morphism ob = new morphism();
        o.runner(a, b);
        ob.runner(a, b);

    }
}