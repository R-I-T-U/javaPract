//armstrong or not

public class p8 {
    public static void main(String [] args){
        int n = 153;

        int temp = n;
        int sum =0;
        while(n!=0){
            int remainder = n%10;
            sum+= (remainder*remainder*remainder);
            n/=10;
        }
        if(sum==temp)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");
    }
}
