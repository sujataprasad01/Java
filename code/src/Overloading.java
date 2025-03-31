import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
    fun(76);
    fun("sujata");
//    demo();  Error
        demo(2,34,4,6);
        demo("sujata", "prasad");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
