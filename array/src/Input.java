import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        Array of primitives
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=33;
        arr[3]=423;
        arr[4]=325;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            System.out.print(arr[i]+" ");
        }

//        Alternative

            System.out.println();
        for(int num:arr){
            System.out.print(num+" "); // here num represents element in the array
        }

//        Array of objects
        String[] str=new String[4];
        for (int i=0; i<str.length; i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1]="sujata";
        System.out.println(Arrays.toString(str));
    }
}
