import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array1: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the size of the array2: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }
        int[] ans =concateantion(arr, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(",");
            }
        }
    }

    static int[] concateantion(int[] arr, int[] arr2){
        int[] ans=new int[arr.length+ arr2.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            ans[arr.length+i]=arr2[i];
        }
        return ans;
    }
}