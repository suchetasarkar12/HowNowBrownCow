package HowNowBrownCow.Map.LocationTypes;

import HowNowBrownCow.Player;
import HowNowBrownCow.LanguageSkill.FluentSkill;
import HowNowBrownCow.LanguageSkill.LanguageSkillAbstract;
import HowNowBrownCow.LanguageSkill.ModerateSkill;
import HowNowBrownCow.LanguageSkill.NoSkill;
import HowNowBrownCow.Map.City;
import HowNowBrownCow.Map.Location;

public class LanguageCenter extends Location {
    String language;

    public LanguageCenter(String name, City city, String language){
        super(name, city);
        this.language = language;
    }

    public void improveLanguageSkill(Player player){
        LanguageSkillAbstract languageSkill = player.getLanguageSkill(language);

        if (languageSkill instanceof NoSkill) {
            player.subtractMoney(10);
            player.setLanguageSkill(language, new ModerateSkill());
        }
        else if (languageSkill instanceof ModerateSkill) {
            player.subtractMoney(10);
            player.setLanguageSkill(language, new FluentSkill());
        }
        else {
            // User can't train anymore, at max skill level
        }
    }
}
