package Leetcode;

/**
 * You are given an array of unique integers salary where salary[i] is the
 * salary of the ith employee.
 * <p>
 * Return the average salary of employees excluding the minimum and maximum salary.
 * Answers within 10^(-5) of the actual answer will be accepted.
 */
public class LeetCode1491 {
    public double averageBruteForce(int[] salary) {
        int denominator = salary.length - 2;
        int numerator = 0;
        int minSalary = salary[0];
        int maxSalary = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > maxSalary)
                maxSalary = salary[i];

            if (salary[i] < minSalary)
                minSalary = salary[i];
        }

        for (int s : salary) {
            if (s != minSalary && s != maxSalary)
                numerator += s;
        }

        return (double) numerator / (double) denominator;
    }

    public double average(int[] salary) {
        int sum = 0;
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;

        for (int i = 1; i < salary.length; i++) {
            sum += salary[i];
            maxSalary = Math.max(salary[i], maxSalary);
            minSalary = Math.min(salary[i], minSalary);
        }

        return ((double) (sum - minSalary - maxSalary) / (salary.length - 2));
    }
}
