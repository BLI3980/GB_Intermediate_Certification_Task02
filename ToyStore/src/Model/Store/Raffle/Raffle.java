package Model.Store.Raffle;

import Model.Store.Store;
import Model.Store.Toys.Toy;
import View.Views;

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

    private List<RaffleToy> fillList () {  // Create a list of objects (a pair of Toy and accWeight
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
            if(item.accWeight >= random && item.toy.getQty() > 0) {
//                System.out.println("\nTHE PRIZE IS: ");
                return item.toy.getId();
            }
            if(item.accWeight >= random && item.toy.getQty() == 0) {
                return "None";
            }
        }

//        System.out.println("\naccumulatedWeight "+accumulatedWeight);
        return null;
    }


    public Store<Toy> rafflePrizeList() {
        Store<Toy> prizeList = new Store<>();
        for (Toy toy: store) {
            prizeList.addToy(toy);
        }
        for (Toy toy: prizeList) {
            toy.setQty(0);
        }
        return prizeList;
    }
    public void addToPrizeList(String toyId, Store<Toy> prizeList) {
        for (Toy toy: prizeList) {
            if (toy.getId().equals(toyId)) {
                toy.setQty(toy.getQty()+1);
            }
        }
    }

    public void removeFromStoreList(String toyId, Store<Toy> storeList) {
        for (Toy toy: storeList) {
            if (toy.getId().equals(toyId) && toy.getQty() > 0) {
                toy.setQty(toy.getQty()-1);
            }
            if (toy.getId().equals(toyId) && toy.getQty() == 0) {
                toy.setQty(toy.getQty()-1);
            }
        }
    }



}
