package Model.Store;

import Model.Toys.Teenager;
import Model.Toys.Toy;

public class Store<T extends Toy> extends StoreAbstract<T>{


    public Store(String storeName) {
        super(storeName);
    }

    public Store() {
        super();
    }

    @Override
    public Store<T> addToy(T newToy) {
        super.addToy(newToy);
        return this;
    }

    @Override
    public String toString() {
        return "SubStore: " +super.toString();
    }
}
