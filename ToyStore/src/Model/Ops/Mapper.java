package Model.Ops;

import Model.Store.Toys.Toy;
import Model.Store.Toys.ToyManager;

public class Mapper {
    public String toyToString(Toy toy) {
        return String.format("%s;%s;%s;%s;%s", toy.getId(), toy.getName(),
                            toy.getQty(), toy.getW_factor(), toy.getCategory());
    }

    public Toy stringToToy(String line) {
        String[] lines = line.split(";");
//        System.out.println(lines[0]);
//        for (String item: lines) {
//            System.out.println(item);
//        }
//        System.out.println(lines[0]);
//        System.out.println(lines[4]);
        Toy toy = new ToyManager().getToy(lines[4]);
//        System.out.println(toy.getCategory());
//        System.out.println(toy.getId());
        toy.setId(lines[0]);
//        System.out.println(toy.getId());
        toy.setName(lines[1]);
        toy.setQty(Integer.parseInt(lines[2]));
        toy.setW_factor(Double.parseDouble(lines[3]));
        toy.setCategory(lines[4]);
//        System.out.println(toy.getCategory());
        return toy;
    }
}
