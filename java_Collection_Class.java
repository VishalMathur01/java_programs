import java.util.*;
public class java_Collection_Class {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("alpha");
        list.add("beta");
        list.add("gamma");
        list.add("lambda");
        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}