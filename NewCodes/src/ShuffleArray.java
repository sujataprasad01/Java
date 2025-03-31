import java.util.Scanner;

public class ShuffleArray {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the size of the x array: ");
            int n = input.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=input.nextInt();
            }
            System.out.println("Enter the number from where y array starts : ");
            int n2=input.nextInt();
            int[] ans=ShuffleArray(arr, n2);
            System.out.print("[");
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]);
                if (i< ans.length -1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
        static int[] ShuffleArray(int[] arr, int n2){
            int[] ans=new int[arr.length];
            for (int i = 0; i < n2; i++) {
                ans[i]=arr[i];
                for (int j = n2; j < arr.length; j++) {
                    ans[j]=arr[j];
                }
            }
            return ans;
        }
    }

