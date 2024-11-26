//factorial and fiboacci using recursion

//Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
public class p16 {
    public int fact(int n){
        if(n==1)
        return 1;
        else
        return n*fact(n-1);
    }
    public int fibo(int n){
        if(n<=1)
        return n;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
        p16 result = new p16();
        System.out.println("factorial of 5 is "+ result.fact(5));
        System.out.println("fibonacci series are :");
        for(int i =0; i<6; i++){
            System.out.println(result.fibo(i)+" ");
        }
    }
}
