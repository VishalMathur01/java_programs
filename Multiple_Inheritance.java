import java.util.Scanner;
import java.lang.String;

interface Hello{
    public void world();
}
interface Ruhtam{
    public void Lahsiv();
}
class implementation implements Hello,Ruhtam {
    public void world(){
        System.out.println("hello world it's me");
    }
    public void Lahsiv(){
        System.out.println("Hello Ruhtam Lahsiv");
    }
}
class Multiple_Inheritance {
    public static void main(String [] args){
        implementation o = new implementation();
        o.world();
        o.Lahsiv();
    }
}