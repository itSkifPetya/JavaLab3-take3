package interfaces;

import abstracts.Obj;
import classes.Place;
import records.UniverseBase;

public interface Location {
    Place location = UniverseBase.getBasePlace();
    Obj place();
}
