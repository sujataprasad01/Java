import java.net.Inet4Address;

public class MaxIn2DArray {
        public static void main(String[] args) {
            int[][] arr={
                    {34,53,23,6},
                    {2,6,87,5},
                    {87,6,432,32}
            };
            System.out.println(max(arr));
        }
        static int max(int[][] arr){
            int max= Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j]>max) {
                        max = arr[i][j];
                    }
                    }
                }
            return max;
        }
    }

