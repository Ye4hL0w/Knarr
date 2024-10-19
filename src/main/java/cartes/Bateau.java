package cartes;

import gains.Gains;

public class Bateau {

    private int pointsRecrue;
    private int pointsBracelet;
    private Gains gains;

    public Bateau(int pointsRecrue, int pointsBracelet, Gains gains) {
        this.pointsRecrue = pointsRecrue;
        this.pointsBracelet = pointsBracelet;
        this.gains = gains;
    }

    @Override
    public String toString() {
        return "Bateau{pointsRecrue=" + pointsRecrue + ", pointsBracelet=" + pointsBracelet + ", gains=" + gains.toString() + '}';
    }

}
