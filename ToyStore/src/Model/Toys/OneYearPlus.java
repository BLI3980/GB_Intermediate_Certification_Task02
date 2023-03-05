package Model.Toys;

public class OneYearPlus implements Ageable{
    @Override
    public String ageGroup() {
        return "+1 year";
    }

    @Override
    public String toString() {
        return String.format("%15s",ageGroup());
    }
}
