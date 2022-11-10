package HowNowBrownCow.Map.LocationTypes;

import HowNowBrownCow.Collectible;
import HowNowBrownCow.Map.City;
import HowNowBrownCow.Map.Location;

class Landmark extends Location{
    Collectible collectible;

    public Landmark(String name, City city){
        super(name, city);
    }

    public void removeCollectible(){}
}
