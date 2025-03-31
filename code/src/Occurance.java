import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numeric string : ");
        int num=in.nextInt();
int b=3;
int count=0;
        while(num!=0){
            int c=num%10;
            if(c==b){
                count++;
            }
            num=num/10;
        }
                System.out.println(count);

    }
}
