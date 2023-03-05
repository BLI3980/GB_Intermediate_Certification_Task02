package Model.Toys;

public abstract class Category {
    public abstract String category();

    @Override
    public String toString() {
//        return String.format("The toy is from %s category", category());
        return String.format("%20s", category());

    }
}
