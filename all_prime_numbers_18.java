import java.util.Scanner;
public class all_prime_numbers_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a upper limit: ");
        int a = sc.nextInt();
        if (a <= 1)
            System.out.println("There are no prime numbers in the current range: ");
        else if (a == 2)
            System.out.println("prime numbers: " + '2');
        else if (a == 3)
            System.out.println("prime numbers: " + '3');
        else {
            System.out.println("prime numbers: ");
            for (int j = 4; j < a; j++) {
                int count = 0;
                for (int i = 2; i < j; i++) {
                    if ((j % i) == 0)
                        count++;
                }
                if (count == 0)
                    System.out.print(" "+j);
            }
        }
    }
}
