import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(67);
        list.add(47);
        list.add(37);
        list.add(27);
        list.add(127);
        list.add(673);
        list.add(6733);

        System.out.println(list.contains(37));
        System.out.println(list);

        list.set(0,99);
        list.remove(2);
        System.out.println(list);

//        Input
        for (int i = 0; i < 5; i++) {
          list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
