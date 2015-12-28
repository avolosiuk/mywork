
public class FindMinMax {


    int findMax(int[] Array) {
        int max = Array[0];
        for (int element : Array) {
            if (max < element) {
                max = element;
            }

        }
    return max;
    }
    int findMin(int[] Array) {
        int min = Array[0];
        for (int element : Array) {
            if (min > element) {
                min = element;
            }

        }
        return min;
    }


}