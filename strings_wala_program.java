import java.util.Scanner;
import java.lang.String;

class strings_wala_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("lower case: "+ a.toLowerCase());
        System.out.println("UPPER case: "+ a.toUpperCase());
        char start = a.charAt(0);
        char end = a.charAt(a.length()-1);
        int n = a.length();
        System.out.print("String with replaced first and last element: "+end);
        for(int i = 1; i<n-1;i++)
            System.out.print(a.charAt(i));
        System.out.println(start);
        System.out.println("String with trimmed last element: "+a.substring(0, a.length()-1));
        System.out.println("The length of the string: "+ a.length());
        System.out.println("The character present at 3rd position : "+ a.charAt(4));
        System.out.println("The substring from the 5th position: "+ a.substring(5));
        System.out.println("index of third character in the string: "+ a.indexOf(a.charAt(2)));
        System.out.println("Enter the second string for the check of the equality: ");
        String b = sc.nextLine();
        if(a.equalsIgnoreCase(b))
            System.out.println("The strings are equal");
        else
       System.out.println("The strings are not equal!!");
    }
}