package jeu;

import cartes.Bateau;
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
        this.main = new ArrayList<>();
        this.equipage = new ArrayList<>();
    }

    public String getPseudo(){
        return this.pseudo;
    }

    public Bateau getBateau(){
        return this.bateau;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "pseudo='" + pseudo + '\'' +
                ", bateau=" + bateau +
                ", pointsVictoire=" + pointsVictoire +
                ", pointsReputation=" + pointsReputation +
                ", main=" + main +
                ", equipage=" + equipage +
                '}';
    }
}
