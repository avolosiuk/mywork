package files;

public class Test {
    public static void main(String[] args) {
        Directory directory=new Directory();
        CodirovkaRazcodirovkaCezarya encryption= new CodirovkaRazcodirovkaCezarya();

        String textCollections=directory.collection().toString();
        String codeTextCollections=encryption.codCezarya(textCollections);
        System.out.println(codeTextCollections);
        String decodeTextCollections=encryption.razcodCezarya(codeTextCollections);
        System.out.println(decodeTextCollections);






    }
}
