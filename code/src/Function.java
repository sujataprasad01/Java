import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("You've to perform addition of two number (Enter y if yes or n for no) : ");
        String yn=input.next();
        switch (yn){
            case "y":
                 sum();
                 break;
            case "n":
                break;
        }

        int ans=sum2(20, 30);
        System.out.println("Parameteric function sum ans : " +ans);


        String personalised=myGreet("Sujata");
        System.out.println(personalised);

        String greet=greet();
        System.out.println(greet);
    }

//     Simple function

    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=in.nextInt();
        System.out.println("Enter second number : ");
        int b=in.nextInt();

        int sum=a+b;
        System.out.println("The sum is : "+sum);
    }

// Parametric function

    static int sum2(int a, int b){
        int c=a+b;
        return c;
    }

//    String function
//1
    static String greet(){
        String greeting="How are you";
        return greeting;
    }
//2
    static String myGreet(String name){
        String message="Hello "+ name;
        return message;
    }
}
