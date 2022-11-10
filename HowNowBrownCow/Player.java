package HowNowBrownCow;

import java.util.ArrayList;
import java.util.Random;

import HowNowBrownCow.LanguageSkill.LanguageSkillAbstract;
import HowNowBrownCow.LanguageSkill.ModerateSkill;
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

    public String[] generateGibberishArray(String[] gibberishArray) {
        Random rnd = new Random();

        for(int i = 0; i < gibberishArray.length; i++) {
            String word = gibberishArray[i];
            char[] charArray = word.toCharArray();
            for(int j = 0; j < charArray.length; j++) {
                charArray[j] = (char) (rnd.nextInt(26) + 'A');
            }
            gibberishArray[i] = new String(charArray);
        }
        return gibberishArray;
    }

    public String talkToLocals(){
        setLanguageSkill("Spanish", new ModerateSkill());
        String localLanguage = currentLocation.city.country.language;
        LanguageSkillAbstract languageSkill = getLanguageSkill(localLanguage);

        Collectible collectible = new Collectible("Mona Lisa", "This is a test hint to see how translation works");
        String[] hintArray = collectible.hint.split("\\s+");
        String[] gibberishArray = generateGibberishArray(collectible.hint.split("\\s+"));
        String finalHint = "";

        double translationRate;
        if (languageSkill instanceof NoSkill) {
            translationRate = 0;
        }
        else if (languageSkill instanceof ModerateSkill) {
            translationRate = 0.5;
        }
        else {
            translationRate = 1;
        }

        for(int i = 0; i < hintArray.length; i++) {
            if (Math.random() <= translationRate) {
                finalHint = finalHint + hintArray[i] + " ";
            } else {
                finalHint = finalHint + gibberishArray[i] + " ";
            }
        }
        
        return finalHint;
    }

    public Collectible searchLandmark(){
        // Placeholder
        return new Collectible("Test", "Test");
    }
}
