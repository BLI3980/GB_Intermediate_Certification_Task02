package Model.Raffle;

import Model.Store.Store;
import Model.Toys.Toy;

import java.util.ArrayList;
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
//            System.out.println(accumulatedWeight);
            RaffleToy raffleToy = new RaffleToy();
            raffleToy.toy = (T) item;
            raffleToy.accWeight = accumulatedWeight;
            raffleList.add(raffleToy);
//            System.out.println(accumulatedWeight);
//            System.out.println(raffleToy.toy);
        }
        return raffleList;
    }

    public String draw() {
        accumulatedWeight = 0;
//        System.out.println("\naccumulatedWeight "+accumulatedWeight);
        List<RaffleToy> raffleList = fillList();
        double random = new Random().nextDouble()*accumulatedWeight;

        for (RaffleToy item: raffleList) {
//            System.out.println("\naccumulatedWeight "+accumulatedWeight);
//            System.out.println("toy "+item.toy);
//            System.out.println("toy weight "+item.accWeight);
//            System.out.println("random number "+random);
//            System.out.printf("random number %f + accumulatedWeight %f = %f\n",
//                    random, accumulatedWeight, random*accumulatedWeight);
            if(item.accWeight >= random) {
//                System.out.println("\nTHE PRIZE IS: ");
                return item.toy.getName();
            }
        }

//        System.out.println("\naccumulatedWeight "+accumulatedWeight);
        return null;
    }




//    @Override
//    public Iterator<Toy> iterator() {
//        return store.iterator();
//    }
}
