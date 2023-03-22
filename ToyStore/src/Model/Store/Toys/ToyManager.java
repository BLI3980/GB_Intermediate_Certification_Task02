package Model.Store.Toys;

public class ToyManager {
    Constructor constructor;
    PlaySet playset;
    Puzzle puzzle;
    StuffedToy stuffedToy;

    public Constructor getConstructor() {
        return new Constructor();
    }

    public PlaySet getPlayset() {
        return new PlaySet();
    }

    public Puzzle getPuzzle() {
        return new Puzzle();
    }

    public StuffedToy getStuffedToy() {
        return new StuffedToy();
    }

    public Toy getToy(String type) {

        switch(type.toLowerCase()) {
            case "constructor":
                return getConstructor();
            case "playset":
                return getPlayset();
            case "puzzle":
                return getPuzzle();
            case "stuffedtoy":
                return getStuffedToy();
        }
        return null;
    }
}



