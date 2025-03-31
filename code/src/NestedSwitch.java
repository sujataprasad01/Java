import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int empNo=in.nextInt();
        String department=in.next();

        switch(empNo){
            case 1:
                System.out.println("Sujata Prasad");
                break;
            case 2:
                System.out.println("Pranay Keche");
                break;
            case 3:
                System.out.println("empNO num 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default:
                System.out.println("Enter correct empNo");
        }

// Advanced switch

        switch (empNo) {
            case 1 -> System.out.println("Sujata Prasad");
            case 2 -> System.out.println("Pranay Keche");
            case 3 -> {
                System.out.println("empNO num 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter correct empNo");
        }
    }
}
