package jeu;
import enums.CouleursEnum;
import enums.GainsEnum;
import org.json.JSONArray;
import org.json.JSONObject;


import cartes.Bateau;
import cartes.TerreEchange;
import cartes.TerreInfluence;
import cartes.Viking;
import gains.Gains;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static enums.GainsEnum.*;

public class Plateau {

    private List<Joueur> joueurs;
    private boolean modeAvance;

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
        this.vikings = new ArrayList<>();
        this.defausseVikings = new ArrayList<>();
    }

    public void initialiserJoueur(int nbJoueurs){
        Gains gainsBateau;
        gainsBateau = modeAvance ? new Gains(VIDE, POINT_RECRUE, VIDE)
                : new Gains(POINT_VICTOIRE, VIDE, POINT_BRACELET);
        int i = 0;
        while(i < nbJoueurs){
            Joueur joueur = new Joueur("BOT" + (i+1), new Bateau(1,1, gainsBateau));
            this.joueurs.add(joueur);
            i++;
        }
    }

    public void initialiserVikings(int nbJoueurs){
        String fichier = "src/assets/vikings.json";

        try {
            String contenuJson = new String(Files.readAllBytes(Paths.get(fichier)));
            JSONObject jsonObj = new JSONObject(contenuJson);

            JSONObject vikingsObj = jsonObj.getJSONObject("vikings");

            JSONArray vikingsArray = vikingsObj.getJSONArray(String.valueOf(nbJoueurs));

            for (int i = 0; i < vikingsArray.length(); i++) {
                JSONObject vikingObj = vikingsArray.getJSONObject(i);
                String couleur = vikingObj.getString("couleur");
                String gain = vikingObj.getString("gain");
                int count = vikingObj.getInt("count");

                for (int j = 0; j < count; j++) {
                    vikings.add(new Viking(CouleursEnum.valueOf(couleur), GainsEnum.valueOf(gain)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialiserJeu(int nbJoueurs, boolean modeAvance){
        this.modeAvance = modeAvance;
        //initialiserTerreEchange();
        //initialiserTerreInfluence();
        initialiserVikings(nbJoueurs);
        initialiserJoueur(nbJoueurs);
    }

    public ArrayList<Joueur> getJoueurs(){
        return (ArrayList<Joueur>) this.joueurs;
    }





}
