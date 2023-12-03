package AllTask;

public class E10Task {
    public static void main(String[] args) {
        String[] array={"ab","ac","ab","ac","ad","af"};
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i].equals(array[j])){
                    System.out.println(array[i]);
                }
            }
        }

    }
}
//Write a program to print out duplicate elements from an Array of Strings?