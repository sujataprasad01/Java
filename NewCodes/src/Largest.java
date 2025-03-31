import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = input.nextInt();
        System.out.print("Enter the value of b : ");

        int b = input.nextInt();
        System.out.print("Enter the value of b : ");

        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater : " + a);
        } else if (b>a && b>c) {
            System.out.println("b is greater : " + b);
        }
        else{
            System.out.println("c is greater : "+ c);
        }

        int max=Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
