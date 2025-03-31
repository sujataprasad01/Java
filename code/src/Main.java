public class Main {
    public static void main(String[] args) {
        int salary=5000;
        if(salary<5000){
            System.out.println("Your salary is less , you'll get bonus");
            salary=salary+2000;
            System.out.println(salary);
        }
        else{
            System.out.println("Your salary is good , you'll get less bonus");
            salary=salary+1000;
            System.out.println(salary);
        }
    }
}