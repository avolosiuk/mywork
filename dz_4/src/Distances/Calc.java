package Distances;
import static java.lang.Math.*;

public class Calc {
    double D;

    Calc(float X1,float Y1,float X2,float Y2){

        D=sqrt(pow((X2-X1),2)+pow((Y2-Y1),2));
    }
}
