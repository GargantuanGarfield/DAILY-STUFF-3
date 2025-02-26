// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class THISISTHEARRAYLORD {
    public static void task1() {
        System.out.println("Task1");
        int[] numbers = new int[5];
        
        for (int i=0; i<numbers.length; i++){
            System.out.print("index " + i + ": ");
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task2() {
        System.out.println("Task2");
        int[] numbers = new int[5];
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        for (int i=0; i<numbers.length; i++){
            System.out.print("index " + i + ": ");
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Task3");
        int[] numbers = {21, 12, 22, 11, 2};
        
        for (int i=0; i<numbers.length; i++){
            System.out.print("index " + i + ": ");
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("Task4");
        int[] numbers = new int[5];
        for (int i=1; i< 6; i++){
            numbers[i-1] = 3*i;
        }

        for (int i=0; i<numbers.length; i++){
            System.out.print("index " + i + ": ");
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task5() {
        System.out.println("Task5");
        char[] chars = new char[5];
        chars[0] = 'A';
        for (int i = 1; i<=4;i++){
            chars[i] = (char)((int)chars[0] + i*2);
        }

        for (int i=0; i<chars.length; i++){
            System.out.print("index " + i + ": ");
            System.out.print(chars[i] + " ");
        }
        System.out.println("\n");
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task6");
        System.out.println("HOW LONG DO I LIST!?!?!?!? ENTER LIST NUMBER LENGTH!!!!!!!");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random()* 101);
        }

        for (int i=0; i<numbers.length; i++){
            System.out.print("index " + i + ": ");
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
        scanner.close();
    }

    public static void runtasks() {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void main(String[] args) {
        runtasks();
    }
}
