import java.io.*;
import java.util.Scanner;
public class file_handling_25 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String a = sc.nextLine();
        File f = new File(a);
        f.createNewFile();
        System.out.println("Does the file exits: "+ f.exists());
        if(f.exists())
        {
            System.out.println("Readable status: "+f.canRead());
            System.out.println("Writable status: "+f.canWrite());
            System.out.print("File type: ");
            int ab = f.getName().lastIndexOf('.');
            System.out.println(f.getName().substring(ab,f.getName().length()));
            System.out.println("Length of the file in bytes:"+f.length());
        }
        else System.out.println("Other operations cannot be performed because the file do not exists");
    }
}
