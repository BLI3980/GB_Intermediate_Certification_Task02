package Controller;

import Model.Ops.StoreOpsImplement;
import Model.Store.Raffle.Raffle;
import Model.Store.Store;
import Model.Store.Toys.Toy;
import Model.Store.Toys.ToyManager;
import View.Views;

public class Controller {
    private final Views view = new Views();
    private final StoreOpsImplement storeOps;
    private Raffle toyRaffle;

    public Controller(StoreOpsImplement storeOps, Raffle toyRaffle) {
        this.storeOps = storeOps;
        this.toyRaffle = toyRaffle;
    }

    public void run(){
        Store<Toy> storeStock = storeOps.storeStock();
        toyRaffle = new Raffle<>(storeStock);
        System.out.println("\nWELCOME TO THE TOY STORE!");
        while (true) {
            String command = view.mainMenu();
            if (command.equals("7")) return;

//            try {
                switch (command) {
                    case "1":
                        view.printStoreItems(storeStock);
                        break;
                    case "2":
                        String name = view.prompt("Enter the name of the toy: ");
                        int qty = Integer.parseInt(view.prompt("Enter the quantity: "));
                        double w_factor = Double.parseDouble(view.prompt("Enter the weight factor: "));
                        String category = view.prompt("Enter the category of the toy: ");
                        Toy newToy = new ToyManager().getToy(category);
                        newToy.setName(name);
                        newToy.setQty(qty);
                        newToy.setW_factor(w_factor);
                        newToy.setCategory(category);
                        storeStock.addToy(newToy);
                        break;
                    case "3":
                        String idSearch = view.prompt("Enter id to search: ");
                        Store<Toy> toyFound = storeOps.findToy(idSearch);
                        view.printStoreItems(toyFound);
//                        String id = prompt("Enter id of note: ");
//                        Record record = controller.readNote(id);
//                        System.out.println("\n==========================" +
//                                "\n" + record +"\n" +
//                                "==========================");
                        break;
                    case "4":
                        System.out.println("\n                " +
                                "Editing option is not implemented yet. ");
                        break;
                    case "5":
                        System.out.println("\n                " +
                                "Deleting option is not implemented yet. ");
                        break;
                    case "6":
                        String prize = toyRaffle.draw();
                        System.out.println(prize);
                        if (prize.equals("None")) {
                            view.stockEmptyPhrase();
                        }else {
                            Store<Toy> rafflePrizeList = toyRaffle.rafflePrizeList();

                            System.out.println("\tCurrent Prize List: ");
                            toyRaffle.addToPrizeList(prize, rafflePrizeList);
                            for (Toy item : rafflePrizeList) {
                                System.out.println(item);
                            }
                        }


                        break;
                }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());;
//            }
        }
    }
}
