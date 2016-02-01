package files;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Directory {

    Text text;
    Image image;
    Audio audio;

    public ArrayList collection() {

        final List directoryList = new ArrayList<>();
        directoryList.add(new Text("Story"));
        directoryList.add(new Audio("Misic"));
        directoryList.add(new Image("Picture"));


        return (ArrayList) directoryList;
    }


}

