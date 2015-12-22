import static java.lang.Math.*;
public class Areas {
    double TriangleA;
    double TriangleB;
    double TriangleC;
    double KectangleA;
    double KectangleB;
    double RadiusR;


    public double areasTrangl(double a, double b, double c) {
        this.TriangleA = a;
        this.TriangleB = b;
        this.TriangleC = c;
        double p = (a + b + c) / 2;
        double S = sqrt(p * (p - a) * (p - b) * (p - c));
        return S;

    }

    public double areasKectangle(float a, float b) {
        this.KectangleA = a;
        this.KectangleB = b;
        double S = a * b;
        return S;

    }

    public double areasCircle(float r) {
        this.RadiusR = r;
        double S = PI * pow(r, 2);
        return S;
    }


}