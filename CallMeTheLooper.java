import java.util.Scanner;


public class CallMeTheLooper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    
        while (true) {
            while (true) { 
                while (true) {
                    while (true) {
                        //Excersice #1 -- simple maths

                        //makin the two random numbers
                        int ran1 = (int)(Math.random() * 10);
                        int ran2 = (int)(Math.random() * 10);

                        while (true) {
                            //input statement you know the vibes? 
                            System.out.print("What is the answer to " + ran1 + " + " + ran2 + "?  --> ");
                            int answer = scanner.nextInt();

                            //if you are right, it moves on, otherwise it asks yo again.
                            if (answer == (ran1 + ran2)) {
                                System.out.println("YOU GOT IT YAYAAAYYY FINALLY THAT TOOK SO LONG YOU SUCK AT MATHS!!!!!");
                                break;
                            }
                        }
                        //moving onto the next excersice
                        break;
                    }

                    //Excersice #2 WHO WANTS TO BE A MILLIONARE

                    int MagicNumber = (int)(Math.random() * 101);

                    //intro
                    System.out.println("Hello my name is Howi Mandel, do you want money but no bacon? or infinite games but no games??");
                    do { 
                        //gathers user input -- and the answer for testin poirpose
                        System.out.println("I swear the number isnt : " + MagicNumber + " It isnt I swear it isnt PLSPSLP dont try itisnt the number I SWEAR");
                        System.out.print("Give me a number between 0 and 100 --> ");
                        int guess = scanner.nextInt();

                        //if guess is correct, then breaka; if guess is less, it tells you; same with too high...
                        if (guess == MagicNumber) {
                            System.out.println("YYOU're RIGHT YAYAYAAYYY.. The number was: " + MagicNumber);
                            break;
                        } else {
                            if (guess < MagicNumber) {
                                System.out.println("YOUR TOO..  LOWWW !!!!!! TRy again");
                            } else {
                                if (guess > MagicNumber) {
                                    System.out.println("YOUR SoOoOoOoOoOoooOOOOoo high !!!!!! TRy again");
                                }
                            }
                        }
                    } while (true);
                    break;
                }

                //Excersice #3 -- Cup half fulf

                do { 
                    //input statement
                    System.out.print("Give me a number -- POSITIVE ONLYYY I SWEAR ON MY HONOR I WILL DUEL YOU TO THE DEATH IF YOU ENTER A NEGATINV ENUMBERS\n\t");
                    int userInput = scanner.nextInt();

                    if (userInput > 0) {
                        System.out.println("You DID IT!!! YAY!!!! I really didn't want to duel you to the death");
                        break;
                    } else {
                        System.out.println("I'm gonna kill you Im so MAAADDD !!!!!! AAAAUUUUGHGHHGHGGGHH");
                    }
                } while (true);
                break;
            }

            //Excercise #4!!! YAYYY --> Multiples of 3
            
            int counter = 1;
            
            while (true) { 
                
                if (counter <= 20) {
                    if (counter % 3 == 0) {
                        ;
                    } else {
                        System.out.println(counter);
                    }
                    counter++;
                } else {
                    break;
                }
            }
            break;
        }
    
        scanner.close();
    }
}