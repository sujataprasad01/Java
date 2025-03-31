import java.util.Scanner;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[9];

        System.out.println("Enter the values for array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        System.out.println(maxSubArray(arr));
    }
        public static int maxSubArray(int[] nums) {
                int sum=Integer.MIN_VALUE;
                int currentSum=0;
                for(int i=0; i<nums.length; i++){
                    currentSum=nums[i]+currentSum;
                    sum=Math.max(sum, currentSum);

                    if (currentSum < 0) {
                        currentSum = 0;
                    }
                }
            return sum;
            }
    }

