import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while(sc.hasNext()){
            System.out.println(x+" "+sc.nextLine());
            x++;
        }
        sc.close();
    }
}