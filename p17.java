//call by value 

// In call by value method of parameter passing, the values of actual parameters are copied to the function’s formal parameters.

// There are two copies of parameters stored in different memory locations.
// One is the original copy and the other is the function copy.
// Any changes made inside functions are not reflected in the actual parameters of the caller.
public class p17 {
    public static void swap(int a, int b){
        int temp = a;
         a=b;
         b= temp;
    }
    public static void main(String []args){
        int a = 3, b = 1;
        System.out.println("before swapping ;  a = "+a+" b= "+b);
        p17 afterswap = new p17();
        swap(a, b);
        System.out.println("after swapping ;  a = "+a+" b= "+b);
    }
}
