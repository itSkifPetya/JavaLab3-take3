package classes;

import abstracts.Obj;
import interfaces.Belongable;
import interfaces.Locationable;
import records.UniverseBase;

public class Item extends Obj implements Belongable, Locationable {
    private final String name;
    private Place location = UniverseBase.getBasePlace();
    private Person owner = UniverseBase.getBaseOwner();

    public Item(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public String toString() {
        return super.toString() + "[location=" + location + ", owner=" + owner + "]";
    }

    @Override
    public String getName() {
        return name;
    }

    public Place getLocation() {
        return location;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public void belongs(Person owner) {
        this.owner = owner;
    }

    @Override
    public void locate(Place location) {
        this.location = location;
    }
}
