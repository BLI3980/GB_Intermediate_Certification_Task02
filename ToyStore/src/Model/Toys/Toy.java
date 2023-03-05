package Model.Toys;

import java.util.UUID;

public abstract class Toy {
    private String id;
    private String name;

    private int qty;

    private double w_factor;

    public Toy(String name, int qty, double w_factor) {
        String rand_id = UUID.randomUUID().toString().substring(0,6);
        this.id = String.format("id_%s",rand_id);
        this.name = name;
        this.qty = qty;
        this.w_factor = w_factor;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getW_factor() {
        return w_factor;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setW_factor(double w_factor) {
        this.w_factor = w_factor;
    }

    // To String
    @Override
    public String toString() {
//        return String.format("ID: %s;\nName: %s;\nQuantity: %d;\n" +
//                "Weighting Factor: %.2f\n", getId(), getName(), getQty(), getW_factor()) ;
        return String.format("%14s %15s %8d %15.2f", getId(), getName(), getQty(), getW_factor()) ;
    }

}
