import java.util.*;

//Software objects are conceptually similar to real-world objects: they too consist of state and related behavior. An object stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages). 
public class p1 {
    public static void main(String[] args) {
        System.out.println("insert a sentance:");
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while(sc.hasNext()){// hasNext method is used to check if there is another input available
            System.out.println(x+" "+sc.nextLine()); // nextLine() is used to read a sentance
            x++;
        }
        sc.close();
    }
}