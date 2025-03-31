public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {34,53,23,6},
                {2,6,87,5},
                {87,6,432,32}
        };
        int target=32;
        System.out.println(search(arr, target));
    }
    static int search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return 0;
                }
            }
        }
        return -1;
    }
}
