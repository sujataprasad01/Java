import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TimeNeeded {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] arr=new int[3];
        System.out.println("Enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the index number of person : ");
        int index=input.nextInt();
        int ans=TimeTaken(arr, index);
        System.out.println(ans);
    }

    public static int TimeTaken(int[] arr, int index){

        Queue<Integer> arr2=new LinkedList<>();
        for (int j = 0; j < arr.length; j++) {
            arr2.add(j);
        }
        int ans=0;

        while(!arr2.isEmpty()){

            int person=arr2.poll();
            arr[person]--;

            ans++;

            if(arr[person]>0){
                arr2.add(person);
            }
            if (person == index && arr[person] == 0) {
                return ans; // Stop when the target person gets all tickets
            }
        }
        return ans;
    }
}
