import java.util.Scanner;

public class ReverseNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int reverseNumber = 0;

    while (number > 0) {
      int lastDigit = number % 10;
      reverseNumber = (reverseNumber * 10) + lastDigit;
      number = number / 10;
    }

    System.out.print(reverseNumber);

    sc.close();
  }

}
