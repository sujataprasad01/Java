import java.util.Scanner;

public class RunningSum {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = input.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=input.nextInt();
            }

            int[] ans=runningsum(arr);
            System.out.print("[");
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]);
                if (i< ans.length -1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
        static int[] runningsum(int[] arr){
            int[] ans=new int[arr.length];
            int start=0;
            for (int i = 0; i < arr.length; i++) {
                ans[i]=start+arr[i];
                start=ans[i];
            }
            return ans;
        }
    }
