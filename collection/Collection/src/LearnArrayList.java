import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

//        simple array
        String[] students = new String[3];

        students[0] = "Rahul";
        students[1] = "Raj";
        students[2] = "Ram";


//        ArrayList

        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Ram");


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.add(5);
        list.add(1, 50);
        System.out.println(list);

        List<Integer> lst = new ArrayList<>();

        lst.add(231);
        lst.add(234);
        lst.add(331);

        list.addAll(lst);
        System.out.println(list);


        System.out.println(list.get(1));
        System.out.println(list.remove(5));
        System.out.println(list.remove(Integer.valueOf(231)));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Integer ele:list){
            System.out.println(ele);
        }


//        Iterator

        Iterator<Integer> it= list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}