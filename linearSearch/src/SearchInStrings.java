import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="sujata";
        char target='u';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
    }

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char ch){
    if(str.length()==0){
        return false;
    }
        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
