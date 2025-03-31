import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String sc=in.next();
        System.out.println(reverse(sc));
    }
    static boolean reverse(String sc){
        int end=sc.length()-1;
        int start=0;
        while (start < end) {
            if (sc.charAt(start) != sc.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}