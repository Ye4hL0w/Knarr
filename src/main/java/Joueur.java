
import cartes.Viking;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private String pseudo;
    private Bateau bateau;
    private int pointsVictoire;
    private int pointsReputation;
    private List<Viking> main;
    private List<Viking> equipage;

    public Joueur(String pseudo, Bateau bateau) {
        this.pseudo = pseudo;
        this.bateau = bateau;
        this.pointsVictoire = 0;
        this.pointsReputation = 0;
        this.main = new ArrayList<Viking>();
        this.equipage = new ArrayList<Viking>();
    }

}
