package files;

public class Directory {

    Text text;
    Image image;
    Audio audio;

    public void security() {
        try {
            throw new SecurityException();
            //

        } catch (SecurityException SE) {
            //
        }
    }
}