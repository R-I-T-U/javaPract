//max and min
import java.util.*;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of elements:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int min = arr[0];
        int max= arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max= arr[i];
            } else if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("min is "+min+" max is "+max);

    }
}
