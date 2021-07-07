import java.util.Scanner;
public class EnhancedAmendingVariables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter current salary: ");
        double income = keyboard.nextLong();
        System.out.println("Enter number of years: ");
        int year = keyboard.nextInt();
        double finalIncome = (income*(income*1.1))*year; // i think this math is wrong
        System.out.println("Your income after 5 years will be: " + finalIncome);



    }
}
