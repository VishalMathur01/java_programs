class threader extends Thread{
    public void run(){
        System.out.println("The thread is running ");
    }
}
class thread_21
{
    public static void main(String[] args){
        threader o = new threader();
        o.start();
    }
}