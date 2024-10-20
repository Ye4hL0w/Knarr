package cartes;

import enums.CouleursEnum;
import enums.GainsEnum;
import gains.Gains;
public class TerreInfluence extends Terre {

    public TerreInfluence(CouleursEnum[] coutExploration, Gains gains, GainsEnum[] gainsImmediat) {
        super(coutExploration, gains, gainsImmediat);
    }
}
