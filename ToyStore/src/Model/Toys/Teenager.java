package Model.Toys;

public class Teenager <C extends Category, A extends Ageable> extends Toy{

    private C category;
    private A ageGroup;

    public Teenager(String name, int qty, double w_factor, C category, A ageGroup) {
        super(name, qty, w_factor);
        this.category = category;
        this.ageGroup = ageGroup;

    }

    // Getters
    public C getCategory() {
        return category;
    }

    public A getAgeGroup() {
        return ageGroup;
    }

    // Setters
    public void setCategory(C category) {
        this.category = category;
    }

    public void setAgeGroup(A ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                "%s %s",getCategory(),getAgeGroup());
    }
}