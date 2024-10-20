package cartes;

import enums.CouleursEnum;
import enums.GainsEnum;

public class Viking {

    private CouleursEnum couleur;
    private GainsEnum gain;

    public Viking(CouleursEnum couleur, GainsEnum gain) {
        this.couleur = couleur;
        this.gain = gain;
    }

    @Override
    public String toString() {
        return "Viking{" +
                "couleur=" + couleur +
                ", gain=" + gain +
                '}';
    }
}
