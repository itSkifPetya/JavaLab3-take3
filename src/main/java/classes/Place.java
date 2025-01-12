package classes;

import abstracts.Obj;
import interfaces.Location;

public class Place extends Obj implements Location {
    private final String name;

    public Place(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Obj place() {
        return null;
    }
}
