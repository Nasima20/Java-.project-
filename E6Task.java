package AllTask;

import java.util.Scanner;

public class E6Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("type a number");
        int primeNumbers=sc.nextInt();
        boolean isprime=true;
        for (int i=0; i<primeNumbers; i++){
            if (primeNumbers%2==0) {
                isprime = false;
                break;
            }

            }
            if (isprime) {
                System.out.println(primeNumbers + " is a prime number.");
            } else {
                System.out.println(primeNumbers + " is not a prime number.");
            }
        }
    }





   // Write a java program to check whether a given number is prime or not?