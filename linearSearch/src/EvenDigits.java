public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={22,345,2,1,122,33,3};
        int answer=evenDigits(arr);
        System.out.println(answer);
    }
    static int evenDigits(int[] arr){
        int count=0;
        int finalcount=0;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                count=count+1;
                ans=count/2;
                if(ans==0){
                 finalcount=finalcount+1;
                }
            }
        }
        return finalcount;
    }
}
