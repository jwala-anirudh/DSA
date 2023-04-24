package Patterns;

import java.util.Scanner;

/**
 * How to solve Pattern problems?
 * <p>
 * 1) For the outer loop, count no of Lines
 * <p>
 * 2) For the inner loop, focus on the columns,
 * & connect them somehow to the rows
 * <p>
 * 3) Print the "*" inside the inner for loop
 * <p>
 * 4) Observe symmetry [optional]
 */
public class PatternsProblem {

    /*
     * P1) Grid of all stars
     */
    static void printPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * P2) Left aligned triangle of all stars
     */
    static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * P3) Left aligned triangle of 1-5 numbers
     */
    static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * P4) Left aligned triangle of same numbers
     */
    static void printPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*
     * P5) Left aligned inversed triangle of stars
     */
    static void printPattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * P6) Left aligned inversed triangle of numbers
     */
    static void printPattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * P7) Top part of Half-diamond triangle of stars
     */
    static void printPattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    /*
     * P8) Bottom part of Half-diamond triangle of stars
     */
    static void printPattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    /*
     * P9) Diamond triangle of stars
     */
    static void printPattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    /*
     * P10) Right angled stars triangle with flip
     * The point of flip should not have repetitions
     */
    static void printPattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;

            if (i > n) {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * P11) Right angled triangle with binary 1,0 switching
     */
    static void printPattern11(int n) {
        for (int i = 0; i < n; i++) {
            int start = 1;

            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void printPattern12(int n) {
        for (int i = 1; i <= n; i++) {
            int space = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }

    static void printPattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                ++num;
            }
            System.out.println();
        }
    }

    static void printPattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printPattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printPattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (char j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void printPattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void printPattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        printPattern1(n);
        printPattern2(n);
        printPattern3(n);
        printPattern4(n);
        printPattern5(n);
        printPattern6(n);
        printPattern7(n);
        printPattern8(n);

        // Can also call printPattern7() & printPattern8() together
        printPattern9(n);

        printPattern10(n);
        printPattern11(n);
        printPattern12(n);
        printPattern13(n);
        printPattern14(n);
        printPattern15(n);
        printPattern16(n);
        printPattern17(n);
        printPattern18(n);

        sc.close();
    }
}