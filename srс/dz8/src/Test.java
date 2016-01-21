package files;

public class Test {
    public static void main(String[] args) {
        Directory directory=new Directory();


        directory.collection()
                .stream().
                forEach(p ->System.out.println(p));



    }
}
