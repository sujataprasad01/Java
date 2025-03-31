public class FindMin {
    public static void main(String[] args) {
        int[] arr={18,23,5,-3,4,32,6,78,-54,3};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
            ans=arr[i];
            }
        }
        return ans;
    }
}
