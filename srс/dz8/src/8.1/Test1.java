package files;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {


    public static void main(String[] args) {
        Directory directory = new Directory();
        int number[] ={0,1,2,3,4,5,6,7,8,9};
        System.out.printf("%-20s%-10s%n", "Номер", "Имя ");
        System.out.println("-----------------------------------------------------");
        Iterator i=directory.collection().iterator();


        directory.collection().forEach(p -> System.out.printf("%-20s%-10s%n",++number[0], p));

    }


}



