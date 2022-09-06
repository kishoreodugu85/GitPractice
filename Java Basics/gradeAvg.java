import java.util.Scanner;

public class gradeAvg {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int total = 0; 
        int grade; 
        int average;
        int counter = 0;

        while (counter < 6){
            grade = input.nextInt();
            total += grade;
            counter++;
        }
        average = total / counter;
        System.out.println("Your Percentage of Marks :  "+ average);
        System.out.println("Your Total Marks Scored :  "+ total);
        input.close();
    }
}
