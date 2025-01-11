package classes;

import abstracts.Obj;

public class Place extends Obj {
    private final String name;

    public Place(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
