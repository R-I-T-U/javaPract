import java.util.*;

public class p14 {

    public static void main(String [] args){
        System.out.println("enter no of row:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter columns: ");
        int b= sc.nextInt();
        System.out.println("enter elements:");
        int arr1[][]= new int [a][b];
        for(int i=0; i<a;i++){
            for(int j=0; j<b;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int sum ;
        for(int i=0; i<a;i++){
            sum=0;
            for(int j=0; j<b;j++){
                sum += arr1[i][j];
            }
            System.out.println("sum of row "+i+" is "+sum);
        }
  
    }
}
