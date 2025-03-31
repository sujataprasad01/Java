import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];

            System.out.println("Enter the values for array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

       Reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void Reverse(int[] arr){

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
