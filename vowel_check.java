import java.util.Scanner;
class vowel_check {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        String s = "aeiou";
        if ( s.indexOf(ch) == -1 )
            System.out.println("It's a consonant");
        else
            System.out.println("It's a vowel");
    }
}