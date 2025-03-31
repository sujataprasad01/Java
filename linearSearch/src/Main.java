public class Main {
    public static void main(String[] args) {
   int[] nums={23,45,3,2,5,6,3,2,-4,-34};
//   int target=1;
        int target=6;
   boolean ans=linearSearch(nums, target);
        System.out.println(ans);
    }
//    Search in the array: return the index if the item found
//    otherwise if item not found return -1
    static boolean linearSearch(int[] arr, int target){
        if(arr.length==0){
         return false;
        }
//        run a for loop
        for (int index = 0; index < arr.length; index++) {
//            check for element at every index if it is=target
            int element=arr[index];
            if(element==target){
//                return index;
//                return element;
                return true;
            }
        }
//        this line will execute if none of the return statements above have executed
//        hence the target not found
//        return -1;
        return false;
    }
}