import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {23,454,-3},
                {43,1,-2,-5}
        };
        System.out.println(search(arr));
    }

    static int search(int[][] arr){
            int ans=arr[0][0];
//            int max=Integer.MIN_VALUE;
//        MIN_VALUE=-25356237
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if(ans<arr[i][j]){
                ans=arr[i][j];
            }
            }
        }
        return ans;
    }
}
