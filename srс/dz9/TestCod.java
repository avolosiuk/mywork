package files;
import java.util.Scanner;

public class TestCod {
    public static void main(String[] args) {
        CodirovkaRazcodirovkaCezarya encryption= new CodirovkaRazcodirovkaCezarya();
        final Scanner scanner=new Scanner(System.in);
        System.out.println("Enter text");
        final String textInput=scanner.nextLine();
        System.out.println("Enter 1 for encode or 2 for decode");
        final int k=scanner.nextInt();
        if (k==1) {
            System.out.println(encryption.codCezarya(textInput));
        }
        else if(k==2) {
            System.out.println(encryption.razcodCezarya(textInput));
        }




    }




}
