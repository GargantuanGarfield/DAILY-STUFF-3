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
        
 
 
 
        boolean found = false;
        for (int i=0; i<bb.length; i++){
            if (target == bb[i]){
                System.out.println("FOund it -> " + i);
                found = true;
                break;
            }
        }

 
 
        long linearEndTime = System.nanoTime();
        long linearTIme = (linearEndTime - linearStartTime);
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");
 
        System.out.println("Sorting the array...");
        Arrays.sort(bb);
 
 
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();
        found = false;
        int cool = Arrays.binarySearch(bb, target);
        long binaryEndTime = System.nanoTime();
        if (cool >= 0){
            found = true;
        }
        if (found){
            System.out.println("FOund it -> " + cool);
        } else {
            System.out.println("yeah no.... -> " + -1);
        }
 
        long binaryTIme = (binaryEndTime - binaryStartTime);
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
        
        
        if (binaryTIme > linearTIme){
            System.out.println("\nlinear was faster.....");
        } else if (linearTIme > binaryTIme){
            System.out.println("\nbinary was faster.....");
        } else {
            System.out.println("\n THEY TOOK THE SAME AMOUNT OF TIME?!???!!??!?!?");
        }
    }
}