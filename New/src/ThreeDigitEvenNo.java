import java.util.ArrayList;
import java.util.Scanner;

public class ThreeDigitEvenNo {

    public static ArrayList<String> findEvenNumbers(ArrayList<Integer> digits) {
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < digits.size(); i++) {
//            System.out.print("i" + digits.get(i));
//            System.out.println();
            for (int j = 0; j < digits.size(); j++) {
//                System.out.print("j" + digits.get(j));
//                System.out.println();

                for (int k = 0; k < digits.size(); k++) {
//                    System.out.print("k" + digits.get(k));
//                    System.out.println();

                    if (i != j && j != k && i != k) {
                        String num = digits.get(i) + " "+  digits.get(j) + " "+ digits.get(k);
                        arr.add(num);
                    }
                }
            }

        }
          return arr;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter digits (enter -1 to stop) :");
        while(true){
            int num=input.nextInt();
            if(num==-1){
                break;
            }
            arr.add(num);
        }
        System.out.println(findEvenNumbers(arr));
    }

}
