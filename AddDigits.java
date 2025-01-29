import java.util.Scanner;
 
 
class Main {
    public static void AddDigits() {
        //make scanner or iinput taking
        Scanner input = new Scanner(System.in);
        
        //Our prompt for number
        System.out.println("what?...");
        System.out.println("... ..   ....  ..");
        System.out.println("what?...");
        System.out.println("Give me a number to add up ig");
        String number = input.nextLine();
        
        //turning  number into the individual digits
        String[] digits = number.split("");
        
        //our counter
        int count = 0;
 
 
 
        for (int i = 0; i < digits.length; i++) {
 
 
            //adds every digit to the counter
            count += Integer.parseInt(digits[i]);
        }
        //displays the counter
        System.out.println(count);
 
 
        input.close();
    }
    public static void main(String[] args) {
        AddDigits();
    }
}
