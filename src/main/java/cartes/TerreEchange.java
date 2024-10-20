package cartes;

import enums.CouleursEnum;
import enums.GainsEnum;
import gains.Gains;
public class TerreEchange extends Terre {

    public TerreEchange(CouleursEnum[] coutExploration, Gains gains, GainsEnum[] gainsImmediat) {
        super(coutExploration, gains, gainsImmediat);
    }
}
