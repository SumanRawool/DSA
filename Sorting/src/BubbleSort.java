import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swpped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swpped=true;
                }
            }
            if (!swpped){ //!false==true
                break;
            }

        }
    }
}
