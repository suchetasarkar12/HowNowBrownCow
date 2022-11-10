package HowNowBrownCow.Map.LocationTypes;

import java.util.ArrayList;

import HowNowBrownCow.Map.City;
import HowNowBrownCow.Map.Location;
import HowNowBrownCow.Transport.Transport;

public class TravelCenter extends Location{
    ArrayList<Transport> transportOptions;

    public TravelCenter(String name, City city){
        super(name, city);
    }
    
    public void setTransportOptions(ArrayList<Transport> transportOptions) {
        this.transportOptions = transportOptions;
    }
}
