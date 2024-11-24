import java.util.*;

public class p14 {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        
        jaggedArray[0] = new int[]{1, 2, 3};     
        jaggedArray[1] = new int[]{4, 5};        
        jaggedArray[2] = new int[]{6, 7, 8, 9};  

        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the sub-arrays to merge (0, 1, or 2): ");
        int idx1 = sc.nextInt();
        System.out.print("Enter the index of the second sub-array to merge: ");
        int idx2 = sc.nextInt();

        if (idx1 >= 0 && idx1 < jaggedArray.length && idx2 >= 0 && idx2 < jaggedArray.length) {
            int[] merged = mergeArrays(jaggedArray[idx1], jaggedArray[idx2]);
            System.out.println("Merged Array: " + Arrays.toString(merged));
        } else {
            System.out.println("Invalid indices. Please try again.");
        }
        
        sc.close();
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        return merged;
    }
}
