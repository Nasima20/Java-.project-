package AllTask;

public class E4task {
    public static void main(String[] args) {
        int[][] array = {
                {1, 23, 45, 10},
                {4, 3, 12, 21},
                {34, 9, 6, 44}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sumEven += array[i][j];
                } else {
                    sumOdd += array[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}








//Create a 2D array of integers. Develop a program which will calculate the
//sum of even and odd numbers for that array.