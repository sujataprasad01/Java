import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the operation you've to perform (+,-,*,/,%) : ");
        char ope=in.next().trim().charAt(0);
        System.out.println("Enter the first number : ");
        int a=in.nextInt();
        int b=in.nextInt();
        if(ope=='+'){
            int c=a+b;
            System.out.println("The sum is : "+c);
        }
        else if(ope=='-'){
            int c=a-b;
            System.out.println("The subtraction is : "+c);
        }
        else if(ope=='*'){
            int c=a*b;
            System.out.println("The multiplication is : "+c);
        }
        else if(ope=='/'){
            int c=a/b;
            System.out.println("The division is : "+c);
        }
        else if(ope=='%'){
            int c=a%b;
            System.out.println("The remainder is : "+c);
        }
    }
}
