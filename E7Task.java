package AllTask;

public class E7Task {
    public static void main(String[] args) {

        int n=10;
        int first=0;
        int second=1;

        for (int i=0;i<n;i++){
            System.out.println(first+" ");
            int next=first+second;
             first=second;
            second=next;


        }


    }
}
//Write a Java Program to print the first 10 numbers of Fibonacci series.