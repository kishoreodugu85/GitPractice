import java.util.Scanner;

public class wish {
    public static void main(String args[]) {

        Scanner inputvalue = new Scanner(System.in);
        
        simplemessage wishbuddy = new simplemessage();

        System.out.println("Enter your name Here: ");

        String name = inputvalue.nextLine();

        wishbuddy.simplewish(name);

        inputvalue.close();

    }
}
