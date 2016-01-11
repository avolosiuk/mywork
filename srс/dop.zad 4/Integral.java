
public class Integral {
    private double a;
    private double b;
    private double n;

    double metodMonteKarlo(double a,double b,double n){
        this.a=a;
        this.b=b;
        this.n=n;

        double shag=(b-a)/n;
        double x=a;
        double sum=0;
        double s;
        for (int i=1;i<=n;i++){
            double f=Math.sin(x);
            sum =sum+f;
          x+=shag;

        }
        s=shag*sum;
        return s;

    }




}
