import java.util.Scanner;
class first extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
}
class second extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
class third extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
public class thread_three_22 {
    public static void main(String[] args)throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        first r = new first();
        second u = new second();
        third h = new third();
            r.start();
            r.join();
            Thread.sleep(1000);
            u.start();
            u.join();
            Thread.sleep(2000);
            h.start();
            h.join();
            Thread.sleep(3000);
        }
    }