package AllTask;

public class E8TAsk {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};
        int maxN=array[0];
        int ManN=array[0];
        for (int i=0; i<array.length;i++){
            if (array[i]<ManN){
                ManN=array[i];
            }
            if (array[i]>maxN){
                maxN=array[i];
            }

        }
        System.out.println("Manim number "+" "+ManN);
        System.out.println("Max number "+" "+maxN);

    }
}
//Maximum and minimum number in the array?