package Area;
import static java.lang.Math.*;

public class Areas {
    public static void main(String[] args){

        Trangle Abc= new Trangle(2,3,3);

        Kectangle Kectanglab=new Kectangle(5,4);

        Circle CirleR=new Circle(2);

        System.out.println("Площадь треугольника "+Abc.S);
        System.out.println("Площадь прямоугольника  "+Kectanglab.S);
        System.out.println("Площадь круга  "+CirleR.S);
    }
}