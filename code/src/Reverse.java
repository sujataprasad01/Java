import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numeric string : ");
        int num=in.nextInt();
        int b=3;
        int count=0;
        while(num!=0){
            int c=num%10;
            System.out.print(c);
            num=num/10;
        }
    }
}
