import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] ch=new char[3];
        char target='c';
        for (int i = 0; i < ch.length; i++) {
            ch[i]=in.next().charAt(0);
        }
        System.out.println(smallestLetter(ch, target));
    }
    static char smallestLetter(char[] ch, char target){
        int start=0;
        int end=ch.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<ch[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ch[start % ch.length];
    }
}
