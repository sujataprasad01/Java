import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isArm(n));
    for(int i=100; i<1000; i++){
        if(isArm(i)){
            System.out.println(i+" ");
        }
    }
    }

    static boolean isArm(int a){
        int original=a;
        int sum=0;

        while(a>0){
            int rem=a%10;
            a=a/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
