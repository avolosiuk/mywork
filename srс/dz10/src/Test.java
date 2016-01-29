

public class Test {
    public static void main(String[] args) {
        SaveAndLoadFile saveAndLoadFile=new SaveAndLoadFile();
        String file = "d:\\12.txt";
        saveAndLoadFile.saveCodFile(file);
        saveAndLoadFile.loadCodFile(file);

    }
}
