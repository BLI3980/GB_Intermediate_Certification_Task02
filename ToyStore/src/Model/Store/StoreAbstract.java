package Model.Store;

import Model.Toys.Toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class StoreAbstract<T extends Toy> implements Iterable<Toy>{

    private String storeName;
    private List<Toy> toyStore;

    public StoreAbstract(String storeName) {
        this.storeName = storeName;
        this.toyStore = new ArrayList<>();
    }

    public StoreAbstract() {
    }

    public StoreAbstract<T> addToy(T newToy) {
        toyStore.add(newToy);
        return this;
    }

    public Iterator<Toy> iterator() {
        return toyStore.iterator();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return String.format("%s", getStoreName());
    }
}
