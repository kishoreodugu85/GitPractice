import java.util.*;
public class mydice1{
    public static void main(String[] args) {
        
        Random dice = new Random();
        for(int count = 0; count <= 7; count++){
            int number;
            number = 1 + dice.nextInt(7);
            System.out.println("the Dice Value : " + number);

        }
    }
}