import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        int[][] arr=new int[3][3];
        System.out.println(arr.length);  // no of rows
        int[][] a={
                {1,2,3}, // 0th index
                {4,5},  // 1st index
                {7,8,3,9}  // 2nd index -> a[2]={7,8,3,9}, a[2][0]-> 6
                };
//        Input

        for (int row=0; row<arr.length; row++){
//            for each col in every row
            for (int col = 0; col <arr[row].length ; col++) {
            arr[row][col]=in.nextInt();
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
//        Alternate output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//         Alternate output  enhanced for loop
        for(int[] b:arr){
            System.out.println(Arrays.toString(b));
        }
    }
}
