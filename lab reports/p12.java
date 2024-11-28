//multiplication of two 3*3 matrix

public class p12 {
    public static void main(String args[]){
        int arr1[][]= new int[][]{{1,2,3},{2,3,4},{4,5,6}};
        int arr2[][]= {{2,1,3},{1,2,1},{1,1,1}};
        int mul[][]= new int[3][3];
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
                mul[i][j]=0;
                for(int k=0; k<3;k++){
                    mul[i][j]+= arr1[i][k] * arr2[k][j];
                }
            }
        }
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(mul[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
