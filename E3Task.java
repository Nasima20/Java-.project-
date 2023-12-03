package AllTask;

public class E3Task {
    public static void main(String[] args) {
        int[][] OddandEven = {
                {1, 23, 45, 10},
                {4, 3, 12, 21},
                {34, 9, 6, 44}
        };
        for (int i=0; i<OddandEven.length;i++){
            for (int j=0;j<OddandEven[i].length;j++){
                if (OddandEven[i][j]%2==0)
                System.out.print(OddandEven[i][j]+" ");
            }



        }
    }
}
//Create a 2D array or integer type where you will store odd and even
//numbers. Develop a program which will identify/print the even numbers
//only.