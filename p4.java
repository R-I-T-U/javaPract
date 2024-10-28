// wap to find sum of first n natural number

import java.util.Scanner;

public class p4 {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int s = sum(n);
        if(s>1)
        System.out.println("sum is "+s);
        else
        System.out.println("invalid number!");
       sc.close();
    }
    
    //recursive 
    public static int sum(int n){
        if(n<1){
            return -1;
        }
        
        return n+(n-1);
    }
}
