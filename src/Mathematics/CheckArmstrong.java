package Mathematics;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int numberFreq = 0;
        int sum = 0;

        while (temp > 0) {
            ++numberFreq;
            temp = temp / 10;
        }

        temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = sum + (int) (Math.pow(lastDigit, numberFreq));
            temp = temp / 10;
        }

        if (number == sum) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

        sc.close();
    }

}
