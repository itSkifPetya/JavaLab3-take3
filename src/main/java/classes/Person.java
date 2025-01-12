package classes;

import abstracts.Obj;
import interfaces.Locationable;
import interfaces.Reasonable;

public class Person extends Obj implements Reasonable, Locationable {
    private final String name;
    private final float luck;


    public Person(String name) {
        super(name);
        this.name = name;
        this.luck = 0.75F;
    }

    public Person(String name, float luck) {
        super(name);
        this.name = name;
        this.luck = (0 < luck && luck < 1) ? luck : 0.75F;
    }


    public String getName() {
        return name;
    }

    public float getLuck() {
        return luck;
    }

    @Override
    public String toString() {
        return super.toString() + "[luck=" + luck + "]";
    }

    @Override
    public String toThink(Obj obj) {
        return "";
    }

    @Override
    public void locate(Place place) {

    }
}
