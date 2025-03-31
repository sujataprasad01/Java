import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Please a string : ");
        Scanner sc=new Scanner(System.in);
        String result=sc.nextLine();
        System.out.println(result);

        System.out.println("Please enter your roll no : ");
        int roll_no=sc.nextInt();

        System.out.println("Your Roll no is : "+ roll_no);

        System.out.println("Enter the value of a : ");

        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();

        int sum=a+b;

        System.out.println("Sum is : " +sum);
    }
}