package AllTask;

import java.util.Scanner;

public class E6Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a number");
        int primeNumbers = sc.nextInt();

        for (int i = 2; i <= primeNumbers; i++) {
            if (primeNumbers % 2 == 0 && primeNumbers != i) {
                System.out.println(primeNumbers+"not prime");
                break;
            } else if (primeNumbers == i) {

                System.out.println(primeNumbers+"not prime");
            }

        }
    }
}



   // Write a java program to check whether a given number is prime or not?