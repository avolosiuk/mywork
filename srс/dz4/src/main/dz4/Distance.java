package dz4;
import static java.lang.Math.*;
public class Distance {
    float X1;
    float Y1;
    float X2;
    float Y2;


      double distance(float x1,float y1, float x2,float y2){
        this.X1=x1;
        this.Y1=y1;
        this.X2=x2;
        this.Y2=y2;
       double  D=sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        return D;

    }

}
