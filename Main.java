import java.util.Scanner;

public class Main {
    public static int sum(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }
    public static int max(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    public static int min(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    public static double avg(int num1, int num2, int num3, int sum){
        double average = sum / 3.0;
        return average;
    }
    public static boolean pos(int num1, int num2, int num3){
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
    public static void prnt(int num1, int num2, int num3, int sum, int max, int min, double avg, boolean allPositive){
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }

    public static void processNumbers(int num1, int num2, int num3) {
        // Calculate sum
        int sum = sum(num1, num2, num3);
 
        // Find max
        int max = max(num1, num2, num3);
 
        // Find min
        int min = min(num1, num2, num3);
 
        // Calculate average
        double average = avg(num1, num2, num3, sum);
 
        // Check if all numbers are positive
        boolean allPositive = pos(num1, num2, num3);
 
        // Print results
        prnt(num1, num2, num3, sum, max, min, average, allPositive);
    }
    public static void getUserinput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("PLSSSSSS plsplsplspls give me a widdle integer pls or three...");
            System.out.print("NUMBER ONE NUMBER : ");
            int num1 = scanner.nextInt();
            System.out.print("\nNUMBER TWO NUMER TWOOO!!!! : ");
            int num2 = scanner.nextInt();
            System.out.print("\nNUMBER THEREEEEEEEEEE : ");
            int num3 = scanner.nextInt();
            
            processNumbers(num1, num2, num3);
        } catch (Exception e) {
            System.out.println("NOOOOO!!!!! NOT THAAATTTT!!!!  I NEED AN INTEGER!!! STOOOPPPP!!!!\n\tTRY AGAIN ANOTHER DAY PLS IM ALLERGIC TO NON INT VALUES!!!!!!!\n\n");
            main(null);
        }
        
        scanner.close();
    }
 
    public static void main(String[] args) {
        getUserinput();
    }
}