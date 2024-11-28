// 3*3 matrix
import java.util.*;
public class p11{
    public static void main(String [] args){
        System.out.println("Enter no. of rows:");
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter columns:");
        int c = sc.nextInt();
        int arr[][]= new int[r][c];
        System.out.println("enter elements");
        for(int i =0; i<r; i++){
            for(int j=0; j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("dsiaplaying");
        for(int i =0; i<r; i++){
            for(int j=0; j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}