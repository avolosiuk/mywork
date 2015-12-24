
public class FindMinMaxArray {
    public static void main(String[] args){
        int [] Array = {10,15,-6,14,15,4,6,47,8};
        int max=Array[0];
        int min=Array[0];


        for (int element :Array){
            if (max<element){
                max=element;
            }
            else if (min>element){
                min=element;
            }
        }

        System.out.println("Максимальное  значение массива "+max);
        System.out.println("Минимальное   значение массива "+min);
    }
}
