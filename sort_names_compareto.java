import java.util.Scanner;
import java.lang.String;
class sort_names_compareto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int n = sc.nextInt();
        String a[] = new String[n];
        System.out.println("Enter the list of names: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextLine();
        for (int i = 0; i < n-1; i++) {
            if (a[i].compareToIgnoreCase(a[i + 1]) > 0) {
                String temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}