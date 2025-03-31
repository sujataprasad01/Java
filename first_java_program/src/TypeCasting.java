import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float number=input.nextFloat();
        System.out.println(number);

//        TypeCasting
        int num=(int)(33.3f);
        System.out.println(num);

//        Automatic Type Promotion in expression
        int a=257;
        byte b=(byte)(a);

        System.out.println(b); // 257%256=1

        byte c=40;
        byte d=50;
        byte e=100;
        int f=(c*d)/e;

        System.out.println(f);


        int number2='A';
        System.out.println(number2);


        byte g=42;
        char h='a';
        short i=1024;
        int j=50000;
        float k=5.67f;
        double l=0.3234;
        double result=(k*g)+(j/h)-(l*i);
//        float+int-double=double
        System.out.println((k*g)+" "+(j/h)+" "+(l-i));
        System.out.println(result);
    }
}
