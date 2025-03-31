public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {3,4,1}
        };
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arrayy){
        int ans=0;
        for (int i = 0; i < arrayy.length; i++) {
            int sum=0;
            for (int j = 0; j < arrayy[i].length; j++) {
                sum=arrayy[i][j]+sum;
            }
            if(sum>ans){
                ans=sum;
            }
        }
    return ans;
    };
}
