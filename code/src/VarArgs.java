import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun(2,3,4,56,7,78,66,5);
      multiple(2,3, "sujata", "rahul", "piyush");
    }
    static void fun(int ...v){  // String ...a, char ...b
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a+b+Arrays.toString(v));
    }
}
