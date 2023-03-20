package Model.Ops;

import Model.Toys.Ageable;
import Model.Toys.Category;
import Model.Toys.Teenager;
import Model.Toys.Toy;

public class Mapper {
    public String map(Toy toy) {
        return String.format("%s;%s;%s", toy.getId(), toy.getName(), toy.getQty(), toy.getW_factor());
    }

    public Toy map(String line) {
        String[] lines = line.split(";");
        Teenager<Category, Ageable> toy = new Teenager<>();
        toy.setName(lines[0]);
        toy.setId(lines[1]);
        toy.setQty(Integer.parseInt(lines[2]));
        toy.setCategory(lines[3]);
        return new Teenager<>(lines[0], (int) lines[1], lines[2], lines[3], lines[5]);
    }
}
