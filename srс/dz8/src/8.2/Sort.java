package files;

import java.util.Map;
import java.util.TreeMap;

public class Sort {

    public static void main(String[] args) {



        final Map sortTreemap=new TreeMap<>();
        sortTreemap.put("Story",1);
        sortTreemap.put("Misic",2);
        sortTreemap.put("Picture",3);


        System.out.println("Keys of tree map: " + sortTreemap.keySet());

    }


}
