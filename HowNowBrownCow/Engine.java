package HowNowBrownCow;

import java.util.ArrayList;

import HowNowBrownCow.LanguageSkill.NoSkill;
import HowNowBrownCow.Map.City;
import HowNowBrownCow.Map.Country;
import HowNowBrownCow.Map.Location;
import HowNowBrownCow.Map.LocationTypes.LanguageCenter;

class Engine {
    public ArrayList<Location> createSampleMap(){
        Country spain = new Country("Spain", "Spanish");
        City sevilla = new City("Sevilla", spain);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new LanguageCenter("ISA", sevilla, "Spanish"));
        return locations;
    }

    // This will be changed to handle character creation in our actual game window
    // this logic is just to be able to get a player created to be able to do stuff with
    public Player characterCreation(Location startingLocation){
        // placeholder starting location
        // placeholder player
        Player player = new Player("Pingus", startingLocation, new ArrayList<Collectible>(), 100, new NoSkill(), new NoSkill(), new NoSkill(), new NoSkill(), new NoSkill());

        return player;
    }

    public void game(){
        ArrayList<Location> locations = createSampleMap();
        Player player = characterCreation(locations.get(0));
    }

    public void initialize(){
        game();
    }
}
