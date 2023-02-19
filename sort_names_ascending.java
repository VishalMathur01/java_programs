import java.util.Scanner;
import java.lang.String;
class sort_names_ascending {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the list: ");
        int n = sc.nextInt();
        String [] a= new String[n];
        for (int i = 0; i<n; i++)
            a[i] = sc.nextLine();
        for(int i= 0; i<n-1; i++)
        {
            for(int j=0; j<a[i].length()-1-i; j++)
            {
                int c = a[i].charAt(0);
                int d = a[i+1].charAt(0);
                if (c > d)
                {
                    String temp = a[i];
                    a[i] =a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for(int i = 0; i< n; i++)
            System.out.println(a[i]);
    }
}
