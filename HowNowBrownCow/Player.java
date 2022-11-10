package HowNowBrownCow;

import java.util.ArrayList;

import HowNowBrownCow.LanguageSkill.LanguageSkillAbstract;
import HowNowBrownCow.LanguageSkill.NoSkill;
import HowNowBrownCow.Map.Location;

public class Player {
    String name;
    Location currentLocation;
    ArrayList<Collectible> collectiblesFound;
    ArrayList<Collectible> collectiblesToDoList;
    int money = 100;
    LanguageSkillAbstract frenchSkill;
    LanguageSkillAbstract spanishSkill = new NoSkill();
    LanguageSkillAbstract portugueseSkill;
    LanguageSkillAbstract italianSkill;
    LanguageSkillAbstract germanSkill;

    public Player(
            String name, 
            Location currentLocation, 
            ArrayList<Collectible> collectiblesToDoList,
            int money, 
            LanguageSkillAbstract frenchSkill, 
            LanguageSkillAbstract spanishSkill,
            LanguageSkillAbstract portugueseSkill,
            LanguageSkillAbstract italianSkill,
            LanguageSkillAbstract germanSkill
            ){
        this.name = name;
        this.currentLocation = currentLocation;
        this.collectiblesFound = new ArrayList<Collectible>();
        this.collectiblesToDoList = collectiblesToDoList;
        this.money = money;
        this.frenchSkill = frenchSkill;
        this.spanishSkill = spanishSkill;
        this.portugueseSkill = portugueseSkill;
        this.italianSkill = italianSkill;
        this.germanSkill = germanSkill;
    }

    public void subtractMoney(int amount) {
        money = money - amount;
    }

    public void addMoney(int amount) {
        money = money + amount;
    }

    public LanguageSkillAbstract getLanguageSkill(String language){
        switch(language) {
            case "French":
                return frenchSkill;
            case "Spanish":
                return spanishSkill;
            case "Portuguese":
                return portugueseSkill;
            case "Italian":
                return italianSkill;
            case "German":
                return germanSkill;

            default:
                return frenchSkill;
        }
    }

    public void setLanguageSkill(String language, LanguageSkillAbstract languageSkill){
        switch(language) {
            case "French":
                frenchSkill = languageSkill;
            case "Spanish":
                spanishSkill = languageSkill;
            case "Portuguese":
                portugueseSkill = languageSkill;
            case "Italian":
                italianSkill = languageSkill;
            case "German":
                germanSkill = languageSkill;
        }
    }

    public void talkToLocals(Location location){
        String localLanguage = location.city.country.language;
        LanguageSkillAbstract languageSkill = getLanguageSkill(localLanguage);

    }

    public Collectible searchLandmark(){
        // Placeholder
        return new Collectible();
    }
}
