
public class Negative extends Exception {
    private int ageValue;

    public Negative(int ageValue) {

        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}



