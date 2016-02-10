package dz5;
public class SortInsert {

    int[] sortInsert(int[] Array) {
        for (int i = 1; i < Array.length; i++) {
            int x = Array[i];
            while (i > 0 && Array[i - 1] > x) {
                Array[i] = Array[i - 1];
                i--;
            }
            Array[i] = x;

        }
        return Array;

    }


}


