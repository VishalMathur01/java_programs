import java.util.Scanner;
class stack {
    static int top = 0;
    int a[] = new int[5];
    void display(){
        if (top <= 0)
            System.out.println("Stack underflow!!");
        else
        {
            System.out.print("The stack is :");
            for(int i = top-1; i >= 0; i--)
                System.out.println(a[i]);
            System.out.println();
        }
    }
    void push()
    {
        if (top >= 5)
            System.out.println("Stack overflow");
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value you want in the stack");
            int value = sc.nextInt();
            a[top++] = value;
        }
    }

    void pop(){
        if (top <= 0)
            System.out.println("Stack underflow !");
        else{
            top--;
        }
    }
    public static void main(String [] args){
        stack n = new stack();
        n.push();
        n.push();
        n.push();
        n.push();
        n.push();
        n.display();
        n.pop();
        n.display();
    }
}