public class SearchInRange {
    public static void main(String[] args) {
        String name="sujata";
        char target='s';
        int start=1;
        int end=4;
        System.out.println(search(name, target, start, end));
//        System.out.println(search2(name.toCharArray());
    }
// for each loop
//    static boolean search2(String name, char target) {
//        if (name.length() == 0) {
//            return false;
//        }
//        for (char ch : name.toCharArray()) {   // to use for each loop we have to convert it into collection or array that why i used here toCharArray()
//            if (ch == target) {
//                return true;
//            }
//        }
//        return false;
//    }

    static boolean search(String name, char ch, int start, int end){
        if(name.length()==0){
            return false;
        }
        for (int i = start; i <=end; i++) {
            if(ch==name.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
