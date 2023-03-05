package Model.Store;

import Model.Toys.Teenager;
import Model.Toys.Toy;

public class TeenStore<E extends Teenager> extends StoreAbstract{


    public TeenStore(String storeName) {
        super(storeName);
    }

    public TeenStore() {
        super();
    }

    @Override
    public String toString() {
        return "SubStore: " +super.toString();
    }
}
