import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 33, 8, 191};
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}