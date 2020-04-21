import java.util.Scanner;

public class StrAssi {
    public static void main (String [] args){

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter you name: ");
        name = sc.nextLine();

        System.out.println("Thank you " + name + " for filling out the form.");
    }
}
