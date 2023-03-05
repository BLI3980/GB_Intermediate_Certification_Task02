import Model.Store.PreSchoolStore;
import Model.Store.Store;
import Model.Store.TeenStore;
import Model.Toys.*;
import View.ViewMethods;

public class Main {
    public static void main(String[] args) {
        Store toyStore = new Store("Main Toy Store");

        PreSchoolStore<PreSchool> psToys = new PreSchoolStore<>("PreSchool Toys Store");
        PreSchool toy1 = new PreSchool<>( "Teddy Bear",
                10, 0.1, new StuffedToy(),new OneYearPlus());
        psToys.addToy(toy1);
        TeenStore<Teenager> teenToys = new TeenStore<>("Teen Toys Store");
        Teenager toy2 = new Teenager<>( "Marvel Puzzle",
                5, 0.2, new Puzzle(), new TenYearPlus());
        teenToys.addToy(toy2);
        teenToys.addToy(new Teenager<>( "Constructor", 5,
                0.3, new Constructor(), new TenYearPlus()));

        ViewMethods print1 = new ViewMethods();
        print1.printStoreItems(teenToys);

        ViewMethods printPsToysStore = new ViewMethods();
        printPsToysStore.printStoreItems(psToys);

        toyStore.addSubStore(psToys);
        toyStore.addSubStore(teenToys);

        toyStore.forEach(item -> System.out.println(item));


    }
}
