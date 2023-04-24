package Mathematics;

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int temp = number;
    int reverseNumber = 0;

    while (temp > 0) {
      int lastDigit = temp % 10;
      reverseNumber = (reverseNumber * 10) + lastDigit;
      temp = temp / 10;
    }

    if (reverseNumber == number) {
      System.out.print("true");
    } else {
      System.out.print("false");
    }

    sc.close();
  }
}
