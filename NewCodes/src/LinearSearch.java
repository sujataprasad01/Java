public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 43, 6, 2, 64, 3, 67, 4 ,- 2, -4};
        int target = 4;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        int r1 = 1;
        int r2 = 4;
        int ans2 = linearSearchRange(nums, target, r1, r2);
        System.out.println(ans2);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearchRange(int[] arr, int target, int r1, int r2) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = r1; i < r2; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}