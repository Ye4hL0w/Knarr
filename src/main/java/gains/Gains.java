package gains;

import enums.GainsEnum;

public class Gains {

    private GainsEnum gain1;
    private GainsEnum gain2;
    private GainsEnum gain3;

    public Gains(GainsEnum gain1, GainsEnum gain2, GainsEnum gain3) {
        this.gain1 = gain1;
        this.gain2 = gain2;
        this.gain3 = gain3;
    }

    public GainsEnum[] recupererGains(int nbPointsBracelet) {
        GainsEnum[] gains = new GainsEnum[nbPointsBracelet];
        if (nbPointsBracelet>=1) {
            gains[0] = gain1;
        }
        if (nbPointsBracelet>=2) {
            gains[1] = gain2;
        }
        if (nbPointsBracelet==3) {
            gains[2] = gain3;
        }
        return gains;
    }

    @Override
    public String toString() {
        return "Gains{gain1="+gain1+", gain2="+gain2+", gain3="+gain3+"}";
    }

}
