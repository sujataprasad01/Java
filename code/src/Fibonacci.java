import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=in.nextInt();

        int b=0;
        int c=1;

        while(b<=a){
            int d=b+c;
            System.out.println(d);
            b=c;
            c=d;
        }
    }
}
