//perfect number or not
import java.util.Scanner;
public class p9 {
    public static void main(String [] args){
        System.out.println("enter an no:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i =1; i<n;i++){
            if(n%i==0)
            sum+=i;
        }
        if(sum== n){
            System.out.println("perfect number!");
        } else
        System.out.println("not perfect");
    }
}
