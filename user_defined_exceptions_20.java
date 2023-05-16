import java.util.Scanner;
class user_defined_exceptions_20 extends Exception{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            if (a > 20)
                throw new USEREXCEPTION();
            else
                System.out.println("a: " + a);
        }
        catch(USEREXCEPTION e){
            System.out.println("Caught a user defined exception");
        }
    }
}
class USEREXCEPTION extends Exception{}
