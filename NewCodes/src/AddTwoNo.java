import java.util.ArrayList;
import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[3];
        int[] arr2=new int[3];

            System.out.println("Enter the values for array 1 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
            System.out.println("Enter the values for array 2 : ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j]=input.nextInt();
        }
ArrayList<Integer> arr3=Add(arr, arr2);
        System.out.println(arr3);
    }

    public static ArrayList<Integer> Add(int[] arr, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i] + arr2[i] + carry;
            result.add(sum % 10); // Store last digit
            carry = sum / 10;  // Carry forward
        }
        return result;
    }
}