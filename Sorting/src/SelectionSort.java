import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap it with the correct index
            int last= arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
     static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
         for (int i = start; i <=end ; i++) {
             if(arr[max]<arr[i]){
                 max=i;
             }
         }

        return max;
    }
}
