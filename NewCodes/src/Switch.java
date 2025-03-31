import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String fruit=input.next();

        switch (fruit){
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            default:
                System.out.println("This is a valid fruit");
        }


        int day=input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
