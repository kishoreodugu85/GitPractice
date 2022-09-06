import java.util.Scanner;

public class nestingif {
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Hi Enter your Age : ");
        int temp = input.nextInt();
        if (temp <= 15){
            System.out.println("Your a Kid, Have Fun in the Park and Ete");
        }else if( temp <= 50 ) {
            System.out.println("Come Enjoy this Devil Show");
        } else{
            System.out.println("Your too Old, Suggested to go and enjoy in Church");
        }
        input.close();
      
    }
}
