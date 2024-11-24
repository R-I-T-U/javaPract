// method overloading
public class p15 {
    public int add(int a , int b){
        return a+b;
    }
    public double add (double a, double b){
        return a+b;
    }
    public int add( int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        p15 addition = new p15();
        System.out.println("sum of 2 int is "+addition.add(2,3));
        System.out.println("sum of 2 double is "+addition.add(0, 0));
        System.out.println("sum of 3 int is "+addition.add(0, 0, 0));
    }
}
