import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(substring(S, start, end));
    }
    static String substring(String s, int start, int end){
        String ans=s.substring(start, end);
        return ans;
    }
}
