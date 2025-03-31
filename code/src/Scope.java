public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
//            a=78; already initialised outside the block in the same method, hence you cannot initialised again
//            but you can change the value. a=100;
            int c=99;
//            values initialised in this block, will remain in block
        }
//        System.out.println(c); // cannot use outside the block
    }
}
