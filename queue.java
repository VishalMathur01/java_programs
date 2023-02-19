import java.util.Scanner;
class queue {
    static int f =0, r=0, a[]=new int[5];
    void display(){
        if( r <= 0 || r==f )
            System.out.println("The queue is empty !!");
        else{
            int f1 = f;
            System.out.println("The queue is :: ");
            while(f1 < r){
                System.out.print(a[f1]+" ");
                f1++;
            }
            System.out.println();
        }
    }
    void insert()
    {
        if(r >= 5)
            System.out.println("The queue is full !!");
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value you want to add in the queue");
            int value = sc.nextInt();
            a[r++] = value;
        }
    }
    void delete()
    {
        if( r <= 0 || r==f )
            System.out.println("The queue is empty !!");
        else{
            f++;
        }
    }
    public static void main(String [] args){
        queue q = new queue();
        q.insert();
        q.insert();
        q.insert();
        q.display();
        q.delete();
        q.display();
    }
}