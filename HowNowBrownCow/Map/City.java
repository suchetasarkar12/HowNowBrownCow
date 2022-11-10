package HowNowBrownCow.Map;

import java.util.ArrayList;

public class City {
    public String name;
    public Country country;
    public ArrayList<Location> locations;

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
}
