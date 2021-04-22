package RegularExpression;

import java.util.function.Predicate;

public class Expression {

    private final String DAMAGE = "damage";
    private final String MINORDAMAGES = "minor damage";
    private final String HEAVYDAMAGES = "heavy damage";
    private final String NODAMAGE = "no damage";

    public Expression(){}

    public String checkExpression(String value){
        if(value.toLowerCase().contains(NODAMAGE))
            return NODAMAGE;
        if(value.toLowerCase().contains(MINORDAMAGES))
            return MINORDAMAGES;
        if(value.toLowerCase().contains(HEAVYDAMAGES))
            return HEAVYDAMAGES;
        if(value.toLowerCase().contains(DAMAGE))
            return DAMAGE;
        return NODAMAGE;
    }

}
