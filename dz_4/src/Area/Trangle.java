package Area;
import static java.lang.Math.*;

public class Trangle {
    double S;
    float p;


    Trangle(float a, float b, float c) {
        p = (a + b + c) / 2;
        S = sqrt(p * (p - a) * (p - b) * (p - c));
    }

}

