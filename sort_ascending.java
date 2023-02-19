import java.util.Scanner;
class sort_ascending {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int a[]= new int[10], i, sort, j=0;
        System.out.println("Enter the array of ten: ");
        for(i =0; i<10; i++)
            a[i]=sc.nextInt();
        for(i =0; i<9; i++)
        {
            for(j=0; j<9-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    sort = a[j+1];
                    a[j+1] = a[j];
                    a[j] = sort;
                }
            }
        }
        for(j =0; j<10; j++)
            System.out.print(a[j] +" ");
    }
}
