package Search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {90,87,76,73,70,65,55,52,43,22,4,2,1};
        int target =22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc=arr[start]<arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}