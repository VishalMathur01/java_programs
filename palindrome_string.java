import java.util.Scanner;
import java.lang.String;
public class palindrome_string {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String s = "";
        int a = 0;
        for (int i = str.length()-1; i>=0;i--)
        {
            s = s+ str.charAt(i);
            a++;
        }
        if (s.compareToIgnoreCase(str)!=0)
            System.out.println("it is not palindrome");
        else
            System.out.println("it is a palindrome string");
    }
}