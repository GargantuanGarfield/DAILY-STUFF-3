import java.util.Scanner;


class Stairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("thing :3:3:3 -- ");
        String character = input.nextLine();
        System.out.println("Number :3:3:3 -- ");
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
