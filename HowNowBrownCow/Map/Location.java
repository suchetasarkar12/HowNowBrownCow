package HowNowBrownCow.Map;

import java.util.ArrayList;

public class Location {
    public String name;
    public City city;
    public ArrayList<Location> connectingLocations;

    public Location(String name, City city){
        this.name = name;
        this.city = city;
    }

    public void setConnectingLocations(ArrayList<Location> connectingLocations) {
        this.connectingLocations = connectingLocations;
    }
}
