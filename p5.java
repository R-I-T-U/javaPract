// wap to find factorial of given number. 
//input = 5, output = 5*4*3*2*1 i.e. 120
import java.util.*;
public class p5 {
    public static void main(String []args){
        System.out.print("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int fact= 1;
        for(int i=1; i<=n;i++){
            fact *=i;
        }
        if(n>=1)
        System.out.println("the factorial of "+n +" is "+fact);
        else if(n==1)
        System.out.println("the factorial of 0 is 1");
        else
        System.out.println("invalid number!");

        sc.close();
    }
    
}
