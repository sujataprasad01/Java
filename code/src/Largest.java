import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>b && a>c){
            System.out.println("The number : " + a + " is largest");
        } else if (b>a && b>c){
            System.out.println("The number : " + b + " is largest");
        }
        else{
            System.out.println("The number : " + c + " is largest");
        }

//        Alternate
        int max=Math.max(c, Math.max(a,b));
        System.out.println(max);

//        max function
    }
}
