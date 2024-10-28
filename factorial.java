import java.util.*;
public class factorial {
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
    }
}
