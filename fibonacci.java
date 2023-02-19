//0, 1, 1, 2, 3, 5, 8 ,...
import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, temp = 0, i = 1, l = 0;
        System.out.println("Enter the length upto which you want the series to be printed: ");
        l = sc.nextInt();
        if (l <= 0)
            System.out.println("Enter a valid length!!!!");
        else {
            for (; i <= l; i++) {
                if ( i == 1 )
                    System.out.print("0" + " ");
                else if ( i == 2 )
                    System.out.print('1'+ " ");
                else {
                    System.out.print((a+b) +" ");
                    temp = a+b;
                    a = b;
                    b = temp;
                }
            }
        }
    }
}