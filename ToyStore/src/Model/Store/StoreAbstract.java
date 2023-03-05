package Model.Store;

import Model.Toys.Toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class StoreAbstract<T extends Toy> implements Iterable<T>{

    private String storeName;
    private List<T> toyStore;

    public StoreAbstract(String storeName) {
        this.storeName = storeName;
        this.toyStore = new ArrayList<>();
    }

    public StoreAbstract() {
    }

    public void addToy(T newToy) {
        toyStore.add(newToy);
    }

    public Iterator<T> iterator() {
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
