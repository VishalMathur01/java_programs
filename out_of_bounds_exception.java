import java.util.Scanner;
class out_of_bounds_exception {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        try{
            double marks = sc.nextDouble();
            if (marks <= 100)
                System.out.println("marks: "+marks);
            else
                throw new MarksOutOfBound();
        }
        catch (MarksOutOfBound e)
        {
            System.out.println("please enter a value that is not more than 100");
        }
    }
}
class MarksOutOfBound extends Exception {

}