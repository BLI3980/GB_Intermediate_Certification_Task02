package Model.Raffle;

import Model.Store.Store;
import Model.Toys.Toy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Raffle<T extends Toy> /*implements Iterable<Store<Toy>>*/{
    private Store<T> store;  // A list of toys
    private T toy;
    private double accumulatedWeight;
    public Raffle(Store<T> store) {
        this.store = store;
    }

    public class RaffleToy {  // An instance of a toy for a raffle
        T toy;
        double accWeight = 0;

    }

//    private List<RaffleToy> raffleToys = new ArrayList<>();

    public List<RaffleToy> fillList () {  // Create a list of objects (a pair of Toy and accWeight
        List<RaffleToy> raffleList = new ArrayList<>();
//        RaffleToy list = new RaffleToy();
        for (Toy item: store) {
            accumulatedWeight += item.getW_factor();
            RaffleToy raffleToy = new RaffleToy();
            raffleToy.toy = (T) item;
            raffleToy.accWeight = accumulatedWeight;
            raffleList.add(raffleToy);
//            System.out.println(accumulatedWeight);
//            System.out.println(raffleToy.toy);
        }
        return raffleList;
    }

    public T draw() {
        double random = new Random().nextDouble() /** accumulatedWeight*/;


        for (RaffleToy item: fillList()) {
            System.out.println(item.toy);
            System.out.println(random);
            System.out.println(item.accWeight);
//            if(item.accWeight >= random) {
//                return item.toy;
//            }
        }
        return null;
    }




//    @Override
//    public Iterator<Toy> iterator() {
//        return store.iterator();
//    }
}
