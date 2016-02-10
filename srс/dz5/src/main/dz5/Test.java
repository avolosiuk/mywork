package dz5;
public class Test {
    public static void main(String[] args) {
        int[] Array = {10, 15, -6, 14, 15, 4, 6, 47, 8};
        FindMinMax M = new FindMinMax();
        SortInsert SI = new SortInsert();

        Array = SI.sortInsert(Array);

        System.out.println("макс элемент = " + M.findMax(Array));
        System.out.println("мин элемент = " + M.findMin(Array));
        for (int element : Array) {
            System.out.print("  " + element);


        }
    }
}


