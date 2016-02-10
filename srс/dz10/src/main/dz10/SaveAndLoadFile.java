package dz10;

import java.io.*;
import java.util.Scanner;

public class SaveAndLoadFile {
    CodirovkaRazcodirovkaCezarya codirovkaRazcodirovkaCezarya = new CodirovkaRazcodirovkaCezarya();

    public void saveCodFile(String fileName) {
        CodirovkaRazcodirovkaCezarya codirovkaRazcodirovkaCezarya = new CodirovkaRazcodirovkaCezarya();
        File file = new File(fileName);
        System.out.println("Enter text to be encoded");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        try {
            if(!file.exists()){
                file.createNewFile();
            }


            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(codirovkaRazcodirovkaCezarya.codCezarya(text));
            } finally {

                out.close();
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File not founded ");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void loadCodFile(String fileName) {

        try  {
            FileInputStream fileInputStream=new FileInputStream(fileName);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader in= new BufferedReader(inputStreamReader);



            while (in.ready()) {
                System.out.println(codirovkaRazcodirovkaCezarya.razcodCezarya(in.readLine()));
            }


        } catch (FileNotFoundException e) {
            System.out.printf("File not founded ");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}

