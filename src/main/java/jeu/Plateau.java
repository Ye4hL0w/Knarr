package jeu;

import cartes.Bateau;
import cartes.TerreEchange;
import cartes.TerreInfluence;
import cartes.Viking;
import gains.Gains;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private List<Joueur> joueurs;

    private List<Bateau> bateaux;
    private List<TerreEchange> terresEchange;
    private List<TerreEchange> piocheTerreEchange;

    private List<TerreInfluence> terreInfluence;
    private List<TerreInfluence> piocheTerreInfluence;

    private List<Viking> vikings;
    private List<Viking> piocheVikings;
    private List<Viking> defausseVikings;

    public Plateau(){
        this.joueurs = new ArrayList<>();
        this.bateaux = new ArrayList<>();
        this.defausseVikings = new ArrayList<>();
    }

    public void initialiserJoueur(int nbJoueurs){
        int i = 0;
        while(i < nbJoueurs){
            Joueur joueur = new Joueur("BOT" + (i+1), bateaux.get(i));
            this.joueurs.add(joueur);
            i++;
        }
    }

    public void initialiserBateau(int nbJoueurs, boolean normal){
        Gains gains;
        gains = normal ? new Gains(-1, 1, -1): new Gains(0, -1, 2);
        while (bateaux.size() < nbJoueurs){
            Bateau bateau = new Bateau(1,1, gains);
            bateaux.add(bateau);
        }
    }


    public void initialiserJeu(int nbJoueurs, boolean mode){
        initialiserBateau(nbJoueurs, mode);
        //initialiserTerreEchange();
        //initialiserTerreInfluence();
        //initialiserVikings();
        initialiserJoueur(nbJoueurs);
    }

    public ArrayList<Joueur> getJoueurs(){
        return (ArrayList<Joueur>) this.joueurs;
    }





}
