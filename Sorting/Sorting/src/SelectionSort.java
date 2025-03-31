import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {

//        run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
//            swapped = false;
//           find the max item in the remaining array and swap with correct index

            int last = arr.length - i - 1;
            int start = 0;
            int maxIndex = getMaxIndex(arr, start, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int start, int end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]) {
                max = i;
            }
//
        }
        return max;
    }



}


