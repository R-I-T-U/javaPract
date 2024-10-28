import java.util.*;

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