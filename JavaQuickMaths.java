import java.util.Scanner;

public class JavaQuickMaths {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        for (double i = 1; i <= 5.0; i += 0.5) {
            System.out.print("Number: " + i);
            System.out.print("  Ceil: " + Math.ceil(i));
            System.out.print("  Floor: " + Math.floor(i));
            System.out.print("  Rint: " + Math.rint(i));
            System.out.print("  Round: " + Math.round(i) + "\n");
            
        }
        
        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("\n\nEnter a DECIMAL NUMBER!!!!! THE NUMBER IN THE DECIMAL FORMAT!!! NOT THE STUPID LOOKING DOT THING NEXT THE  NUMBERS BUT THE ACTAUL NUNBERS PLSPLSPLSPLSPSL !!! NOT THAT PUTTING A DOT IS UNWELCOME OR IT WONT WORK I JUST HATE NUMBERS THAT DO THAT !!!! : ");
        double userNum = scanner.nextDouble();
        System.out.print("Number: " + userNum);
        System.out.print("  Ceil: " + Math.ceil(userNum));
        System.out.print("  Floor: " + Math.floor(userNum));
        System.out.print("  Rint: " + Math.rint(userNum));
        System.out.print("  Round: " + Math.round(userNum) + "\n");
        
        // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.print("\nENTER A NOTHERNUMBER!!!! BUT PLSPSLPLSP NO DECIMALS I NEDD A  INTEGER PLSPLSPLSPL(that means whole number) 😵😵😵🤣🤣🤣🤣😂😂🤣🙈🙈yj : ");
        int userInt = scanner.nextInt();
        String buffer = scanner.nextLine();
        System.out.print("\nPLSPLPPSL ENTER A WOOOORRRDDDD it can be any word I need a word plsplsplspls 🥺🥺🥺🥺🥺🥺🥺🥺🥺🥺 : ");
        String userString = scanner.nextLine();
        System.out.println("\nYOu entered thge  INTEEGERRR : " + userInt);
        System.out.println("YOu entered thge  sttrting : " + userString);


        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        double userdoubleNow = userInt;
        System.out.println("\nYour inout but now a double (im[licit casting])  :    " + userdoubleNow);
        userNum = (int)userNum;
        System.out.println("Rember when I asked for that deximal ununmber??? well here it is agian explicit casyed!!! (explicit casting) --> ::->->->->->->:: ---->:   " + userNum);
        char userChar = (char)userInt;
        System.out.println("This is the inter but in a SUPER COOL letter/sy,bol/number/other ASCII thing I am unaware of !!! (char typeacst) :: ->->-.-..->_.-.-->->-.->->-.--;_.:::: ;OVER HERE --->: ; -> " + userChar);
        
        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.println("\n\nHEY!!!!! HEY !!!! HEYHEYHEYHEYHEYHEY!!!!!......... HEY !!!!!! LOOK OVE RHERE!!!!!!!!                Give me a character (JUST ONE!!!!!! OR I SWEAR TO F&#*!^$&^# IM GONNA DEVOUR YOU!!!): ");
        char userInputChar = scanner.nextLine().charAt(0);
        int userChartoInt = (int)userInputChar;
        System.out.println("THis is yourcharacter but in SUPER COOL number format -->_>>>>>> ::::: ----------------------->>>> DRUMROLL PLSPSLPSLPLS ________----___> :: " + userChartoInt);


        
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        String s1 = "peeenar.........  💔💔💔💔";
        String s2 = "peeenar.........  💔💔💔💔";

        String s3 = new String("peeenar.........  💔💔💔💔");

        System.out.println("\nTHis is the s1 and s2 they the same you know the vibes.... no string constructor I mean ----- (s11 == s2) ---- " + (s1 == s2));
        System.out.println("THIS is the s1 and -->>->--->(((s3))))<-IMPORTANT<---<---<-- they the -->>->--->(((different))))<-IMPORTANT<---<---<-- you know the vibes.... string constructor I mean ----- (s11 == s3) ---- " + (s1 == s3));

        System.out.println("This is the .equals crap between s3 and s1 :3:3:3:3:3;3:3;33;3;3;33l;;::#33:3:3;3 --> (s1.equals(s3)) :3 :3" + (s1.equals(s3)));

        
        // Close the Scanner object
        scanner.close();

    }
}
