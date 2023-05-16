public class runner implements Runnable {
    public void run() {
        System.out.println("Thread runner mfucker");
        for (int i = 1; i <= 10; i++)
            System.out.println(i + "*5 =" + i * 5);
        System.out.println("Thread completed mfucker");
    }
}