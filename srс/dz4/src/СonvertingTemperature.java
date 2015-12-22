import static java.lang.Math.*;


public class СonvertingTemperature {
    float Farengeit;
    float Celcious;


    public double celcToFar(float C) {
        this.Celcious = C;
        double F = (C * 9) / 5 + 32;
        return F;
    }
    public double farToCelc (float f){
        this.Farengeit=f;
        double C= (f-32)*5/9;
        return C;

    }

}
