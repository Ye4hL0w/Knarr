package cartes;

import enums.CouleursEnum;
import enums.GainsEnum;
import gains.Gains;

public class Terre {

    private CouleursEnum[] coutExploration;
    private Gains gains;
    private GainsEnum[] gainsImmediat;

    public Terre(CouleursEnum[] coutExploration, Gains gains, GainsEnum[] gainsImmediat) {
        this.coutExploration = coutExploration;
        this.gains = gains;
        this.gainsImmediat = gainsImmediat;
    }

}
