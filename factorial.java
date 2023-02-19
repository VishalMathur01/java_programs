import java.util.Scanner;
class factorial {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want the factorial: ");
        int a = sc.nextInt(), fact = 1;
        for(int i = a; i>0;i--)
            fact *= i;
        System.out.println(fact);
    }
}
