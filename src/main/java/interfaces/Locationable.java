package interfaces;

import classes.Place;
import records.UniverseBase;

public interface Locationable {
    Place location = UniverseBase.getBasePlace();
    void locate(Place location);
}
