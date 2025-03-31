public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,2,3,47,-4,65,-44};
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
