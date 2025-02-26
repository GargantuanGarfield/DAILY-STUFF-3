import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("how lon you wan???");
        int len = scanner.nextInt();
        while (len<0){
            System.out.println("Too small POSITIVE ONLY");
            System.out.println("how lon you wan???");
            len = scanner.nextInt();
        } 
        
        int[] bb = new int[len];

        for (int i=0; i<bb.length; i++){
            bb[i] = (int)(1 + Math.random()*1000);
        }

        System.out.println("ENeter you r  tatrget numbvr");
        int target =  scanner.nextInt();
        while (target<0){
            System.out.println(" I TOLD YOU TO ENTER POSIOTIVE NUMBERS EARLIER WJATST WRONG WITH TOUY");
            System.out.println("ENeter you r  tatrget numbvr");
            target =  scanner.nextInt();
        }

        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();
        
        System.out.println("Sorting the array...");

        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();

        boolean found = false;
        for (int i=0; i<bb.length; i++){
            if (target == bb[i]){
                System.out.println("FOund it -> " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("didn't find :( -> " + -1);
        }


        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");

        Arrays.sort(bb);

        found = false;
        int cool = Arrays.binarySearch(bb, target);
        if (cool >= 0){
            found = true;
        }
        if (found){
            System.out.println("FOund it -> " + cool);
        } else {
            System.out.println("yeah no.... -> " + -1);
        }

        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");

    }
}
