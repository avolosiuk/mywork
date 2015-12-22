import static java.lang.Math.*;
public class CelciousToFarangeit {
    float Farengeit;
    float Celcious;


    public double farangeit(float C) {
        this.Celcious = C;
        double F = (C * 9) / 5 + 32;
        return F;
    }
    public double celcious(float f){
        this.Farengeit=f;
        double C= (f-32)*5/9;
        return C;

    }
}