public class Main {
  static void FizzBuzz(int number) {
    if (number % 15 == 0) {
      System.out.println("FIZZBUZZ");
    } else if (number % 5 == 0) {
      System.out.println("BUZZ");
    } else if (number % 3 == 0) {
      System.out.println("FIZZ");
    } else {
      System.out.println("NOTHING... I swear theres nothing.. no fizz and no buzz... and DEFINITILY no fizzbuzz");
    }
  }

  public static void main(String[] args) {
    int three = 3;
    int five = 5;
    int fifteen = 15;
    int otherNumber = 69;

    FizzBuzz(three);
    FizzBuzz(five);
    FizzBuzz(fifteen);
    FizzBuzz(otherNumber);
  }
}
