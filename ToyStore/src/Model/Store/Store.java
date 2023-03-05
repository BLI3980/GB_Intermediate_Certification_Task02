package Model.Store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store /*<S extends StoreAbstract>*/ extends StoreAbstract implements Iterable/*,Iterator*/ {

    private String storeName;
    private List<StoreAbstract> substore;

    public Store(String storeName) {
        super(storeName);
        this.substore = new ArrayList<>();
    }

    public void addSubStore(StoreAbstract newSubStore) {
        this.substore.add(newSubStore);
    }

//    @Override
//    public Iterator iterator() {
//        return substore.iterator();
//    }
    @Override
    public Iterator<StoreAbstract> iterator(){
        return new Iterator<StoreAbstract>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < substore.size();
            }

            @Override
            public StoreAbstract next() {
                return substore.get(index++);
            }
        };
    }
}
