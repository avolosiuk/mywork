
public class Test {
    public static void main(String[] args){
        Areas S=new Areas();
        СonvertingTemperature T=new СonvertingTemperature();
        Distance D=new Distance();
Integral M=new Integral();

        System.out.println("Площадь треугольника = "+S.areasTrangl(2,5,6));
        System.out.println("Площадь прямоугольника = "+S.areasKectangle(5,6));
        System.out.println("Площадь круга = "+S.areasCircle(4));

        System.out.println("Температура по фаренгейту = "+T.celcToFar(100));
        System.out.println("Температура по цельсию = " +T.farToCelc(100));

        System.out.println("Расстояния между двумя точками = " + D.distance(1,2,3,4));
        System.out.println(M.metodMonteKarlo(1,10,200));

    }
}
