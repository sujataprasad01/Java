// ceiling - smallest no in an array greater  or equals to target=celing no

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int target=34;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        boolean asec;
        if(arr[start]<arr[end]){
            asec=true;
        }else{
            asec=false;
        }

//        but what if the target is greater than the greatest no in the array
        if(target>arr[arr.length]-1){
            return -1;
        }

        while(start<=end){
        int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(asec){
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return arr[start];
    }
}
