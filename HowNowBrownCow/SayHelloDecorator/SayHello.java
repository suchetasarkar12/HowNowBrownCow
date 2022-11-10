package HowNowBrownCow.SayHelloDecorator;

import HowNowBrownCow.LanguageSkill.LanguageSkillAbstract;

public class SayHello extends SayHelloDecorator{
    LanguageSkillAbstract languageSkill;
    
    public SayHello(LanguageSkillAbstract languageSkill) {
        this.languageSkill = languageSkill;
    }

    public void talkToLocals(){}
}
