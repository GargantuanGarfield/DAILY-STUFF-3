import java.util.Scanner;

class Stairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ONE of any character... ANNYYY character. The possibilities are endless... to the extent of one character.. ONLY ONE BY THE WAY any more than one and I will explode in real time... just the one... IM watching you -- ");
        String character = input.nextLine();
        System.out.println("Enter the EXACT specific number of stairs that you want to be put into the console in a staircase pattern made of the character you entered previously To be out into a staircase that has the same number of stairs made up of the charatceer previously in the number you enter now -- ");
        int number = input.nextInt();
        for (int i = number; i > 0; --i) {
            String output = "";
            output += " ".repeat(i);
            output += character;
            for (int l = output.length(); l <= number; l++){
                output += character;
            }
            System.out.println(output);
        }
        
    }
}
