
import java.util.Arrays;
import java.util.Scanner;

public class Swap2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        ArrayList<Integer> arr=new ArrayList<>();
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the two index that you have to swap : ");
        int i= input.nextInt();
        int j= input.nextInt();
        swap(arr, i, j);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
