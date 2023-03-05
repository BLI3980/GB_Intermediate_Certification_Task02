package Model.Toys;

public class TenYearPlus implements Ageable{
    @Override
    public String ageGroup() {
        return "+10 years";
    }
    @Override
    public String toString() {
        return String.format("%15s",ageGroup());
    }
}
