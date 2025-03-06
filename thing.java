import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class thing {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        int size;
        do { 
            System.out.println("Erm..... size of array??? #Ad #Blessed #KILLALLTRAITORS");
            size = scanner.nextInt();
        } while (size < 5);

        int[] arauy = new int[size];
        Random rndom = new Random();

        for (int counter=0; counter<arauy.length; counter++){
            arauy[counter] = rndom.nextInt(50) + 1;
        }

        int[] newArray = Arrays.copyOf(arauy, size);
        for (int i = 0; i<(arauy.length/2); i++){
            int temp = newArray[i];
            newArray[i] = newArray[newArray.length - (i+1)];
            newArray[newArray.length - (i+1)] = temp;
        }

        System.out.println("FTHis be the first array :3 #Blessed : " + Arrays.toString(arauy));
        System.out.println("FTHis be the second array :3 #Blessed #Ad #BLM #HAIIII : " + Arrays.toString(newArray));

        scanner.close();
    }
}