package classes;

import abstracts.Obj;
import interfaces.Belongable;

public class Item extends Obj implements Belongable {
    private final String name;
    Obj owner = new Place("World");

    public Item(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void belongs(Obj owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return super.toString() + "[owner=" + owner + "]";
    }

    @Override
    public String getName() {
        return name;
    }
}
