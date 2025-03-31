public class IPAddress {
    public static String defangIPaddr(String address) {
        if(address.contains(".")){
            return address.replace(".", "[.]");
        }
        return address;
    }
    public static void main(String[] args){
        String address="1.1.1.1";
        String Result=defangIPaddr(address);
        System.out.println(Result);
    }
}
