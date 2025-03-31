import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int roll_no=input.nextInt();
        System.out.println("Your roll number is "+ roll_no);

        int a=234_000_000;
        System.out.println(a);

        Scanner s_input=new Scanner(System.in);
        System.out.print("Enter string : ");
        String name=s_input.nextLine();
        System.out.println(name);

        System.out.print("Enter string : ");
        String name2=s_input.next();
        System.out.println(name2);

        Scanner s2_input=new Scanner(System.in);
        System.out.print("Enter floating number : ");
        float name3=s2_input.nextFloat();
        System.out.println(name3);
    }
}
