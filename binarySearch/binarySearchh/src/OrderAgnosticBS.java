public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={-18,-3,-2,2,3,4,5,16,38,43,56,80};
        int[] arr2={99,80,75,22,11,10,5,4,-3,-18};
        int target=38;
        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans);
    };

    //    return the index
//    return -1 if it does not exist
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

//        find whether the array is sorted in ascending or descending

        boolean isAsc;
//        boolean isAsc=arr[start]<arr[end];
        if(arr[start]<arr[end]){
            isAsc=true;
        }else{
         isAsc=false;
        }

        while(start<=end) {
//            find the middle element
//            int mid=(start+end)/2;  // might be possible that (start+end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    };
}
