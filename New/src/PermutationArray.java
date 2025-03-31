import java.util.Scanner;

public class PermutationArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        int[] ans=permutation(arr);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i< ans.length -1){
                System.out.print(",");
            }
        }
            System.out.print("]");
    }
    static int[] permutation(int[] arr){
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}
