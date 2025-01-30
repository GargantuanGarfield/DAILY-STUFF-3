// Online Java Compiler
import java.util.Scanner;


//"The factorial of {x} is {factorial}."
class Factorial {
    public static long factorial(int num) {
        long result = 1;
        
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial of plsplpslpplpslpslpslp DO ITTT... DO IT NOWWWWWWW PLSPLSPSPL GOOOOOO ENTE RNUMNEBBERBERRRRR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        int userNum = input.nextInt();
        
        long result = factorial(userNum);
        System.out.println("The factorial of " + userNum + " is " + result);

        input.close();
    }
}