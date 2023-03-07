package Model.Toys;

public class ThreeYearPlus implements Ageable{
    @Override
    public String ageGroup() {
        return "+3 year";
    }

    @Override
    public String toString() {
        return String.format("%15s",ageGroup());
    }
}
