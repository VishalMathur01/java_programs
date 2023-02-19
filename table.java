import java.util.Scanner;
class table {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner ( System.in );
        int a = 0, j[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the number you want the table of: ");
        a = sc.nextInt();
        for(int i : j)
            System.out.println( a + "*" + i +"= "+(a*i));
        sc.close();
    }
}
