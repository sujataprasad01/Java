import java.util.Scanner;

public class EvenNumberCount {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
//            System.out.println(nums[i]);

            String numstr=Integer.toString(nums[i]);
            int counter=0;

            for(int j=0; j<numstr.length(); j++ ){
//                System.out.println(numstr.charAt(j));
                counter++;
            }
//            System.out.println(counter);
            if(counter%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int[] arr=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }

        int result=findNumbers(arr);
        System.out.println("The numbers of even digits are :" + result);
    }
}