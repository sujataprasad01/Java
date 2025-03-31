import java.util.Scanner;

public class Array2n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        int[] ans=array2n(arr);
        System.out.print("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i< ans.length -1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    static int[] array2n(int[] arr){
        int[] ans=new int[arr.length+arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
            ans[i+arr.length]=arr[i];
        }
        return ans;
    }
}
