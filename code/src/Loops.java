import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Print numbers from 1 to 10
        for(int count=1; count<=10; count++){
            System.out.println(count);
        }

//        Print number 1 to n
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int n=1; n<=num; n++){
//            System.out.print(n + " ");
            System.out.println("Hello world");
        }


//        While loop
        int number=1;
        while(number<=num){
            System.out.println(number);
            number++;
        }

// Do While
        int abc=1;
        do{
            System.out.println(abc);
            abc++;
        } while(abc<=num);
    }
}
