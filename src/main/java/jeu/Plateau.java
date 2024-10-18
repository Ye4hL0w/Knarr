package jeu;

import cartes.TerreEchange;
import cartes.TerreInfluence;
import cartes.Viking;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private List<Joueur> joueurs;

    private List<TerreEchange> terresEchange;
    private List<TerreEchange> piocheTerreEchange;

    private List<TerreInfluence> terreInfluence;
    private List<TerreInfluence> piocheTerreInfluence;

    private List<Viking> vikings;
    private List<Viking> piocheVikings;
    private List<Viking> defausseVikings;

    public Plateau(){
        this.joueurs = new ArrayList<>();
        this.defausseVikings = new ArrayList<>();
    }

    //RAJOUTER LE BATEAU AU JOUEUR QUAND ON AURA FINI LA CLASSE BATEAU
    public void initialiserJoueur(int nbJoueurs){
        int i = 0;
        while(i < nbJoueurs){
            Joueur joueur = new Joueur("BOT" + i, null);
            this.joueurs.add(joueur);
            i++;
        }
    }

    public ArrayList<Joueur> getJoueurs(){
        return (ArrayList<Joueur>) this.joueurs;
    }





}
