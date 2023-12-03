package AllTask;

public class E9Task {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int l=arr[0];
        int sl=arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if (arr[i]>sl&&arr[i]!=l){
                sl=arr[i];
            }
        }
        System.out.println("second large is "+" "+sl);
    }
}
//Write a java program to find the second largest number in the array?