package Sept.ex_25092024;

import java.util.Scanner;

public class primeNumberForLoop {
    //Prime Number from 1 to 100. (for loop)

    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter maximum number To Count prime number");
        int num = sc.nextInt();
            sc.close();
                System.out.println("Prime Numbers between 1 to 100 are:");

                for (int i = 2; i <= num; i++) { // Start from 2 since 1 is not prime
                    int count = 0; // Reset count for each number

                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++; // Increment count for each divisor
                        }
                    }

                    // Check if the number has exactly two divisors
                    if (count == 2) {
                        System.out.println(i + " is a prime number");
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid integer number");
            }
    }
}
