// wap to read any single digit and display in word from 1 to 3

//here i have used user defined exception handling to throw error when digit is out of range
import java.util.Scanner;

public class p3 {
    public static void main(String [] args){
        try{
            System.out.println("enter a digit:");
            Scanner sc = new Scanner(System.in);
            
            int d= sc.nextInt();
            switch (d) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                throw(new DigitOutOfLengthException("Digit unreacheable!!"));
                    
            } 
        } catch(DigitOutOfLengthException ex){
            System.err.println(ex);
        }
        

    }
}
class DigitOutOfLengthException extends Exception{
    public DigitOutOfLengthException(String msg){
        super(msg); //calls the constructor of ParentClass (i.e. exception class ) with matching parameters
    }
}
