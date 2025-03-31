public class CountDigits {

    public static void main(String[] args) {
         int[] nums={32,434,54,2,5445};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){

        int numberofDigits=digits(num);
        if(numberofDigits%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
