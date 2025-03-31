public class Even {
    public static void main(String[] args) {
        int[] arr={45,87687,3,77,8,55,-44};
        System.out.println(findeven(arr));
    }
    static int findeven(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    };

    static boolean even(int num){
//        for negative numbers
        if(num<0){
            num=num*-1;
        }
//        for empty array
        if(num==0){
            return false;
        }
//     count the number of digits
        int count=0;
        boolean ans;
        while(num>0) {
            count++;
            num  = num / 10;
        }
        if(count%2==0){
            ans=true;
        }
        else{
            ans=false;
        }
    return ans;
    };

//    Alternative Method
    static int digit(int num){
        return (int)(Math.log10(num)+1);
    }
//    it returns the number of digits
}
