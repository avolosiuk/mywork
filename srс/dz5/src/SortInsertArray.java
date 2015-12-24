


public class SortInsertArray {
    public static void main(String[] args) {
        int[] Array = {10, 5, -6, 14, 15, 4, 4, 47, 8};

        for (int i = 1; i < Array.length; i++) {
            int x = Array[i];
            while (i > 0 && Array[i - 1] > x) {
                Array[i] = Array[i - 1];
                i--;
            }
            Array[i] = x;
        }
        for (int element : Array) {
            System.out.print("  " + element);

        }
    }
}