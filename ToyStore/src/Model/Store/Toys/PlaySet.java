package Model.Store.Toys;

import java.util.UUID;

public class PlaySet extends Toy{
    String id;
    String category;

    public PlaySet(String name, int qty, double w_factor) {
        super(name, qty, w_factor);
        this.category = "PlaySet";
    }
    public PlaySet() {
        super();
        String rand_id = UUID.randomUUID().toString().substring(0,6);
        this.id = String.format("id_%s",rand_id);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%18s", getCategory());
    }
}
