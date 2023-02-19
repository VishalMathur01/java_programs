import java.util.Scanner;
class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        System.out.println("Enter the elements of the arrays one by one: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[j][i]+" ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(b[j][i]+" ");
            System.out.println();
        }

        }
    }
