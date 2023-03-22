package Model.Store;

import Model.Store.Toys.Toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class StoreAbstract<Toy> implements Iterable<Toy>{

    private String storeName;
    private List<Toy> toyStore = new ArrayList<>();

    public StoreAbstract(String storeName) {
        this.storeName = storeName;
        this.toyStore = new ArrayList<>();
    }

    public StoreAbstract() {
    }

    public StoreAbstract<Toy> addToy(Toy newToy) {
        toyStore.add(newToy);
        return this;
    }

    public void removeToy(Toy removeToy) {
        toyStore.remove(removeToy);
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
