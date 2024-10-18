import jeu.Joueur;
import jeu.Plateau;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {

        affichageDebutJeu();
        int nbJoueurs = demanderNombreJoueurs();
        Plateau plateau = initialiserPlateau(nbJoueurs);
        afficherJoueurs(plateau.getJoueurs());

    }

    private static void affichageDebutJeu() {
        System.out.println("=====================================");
        System.out.println("          Bienvenue sur KNARR!       ");
        System.out.println("=====================================");
    }

    private static int demanderNombreJoueurs() {
        Scanner sc = new Scanner(System.in);
        int nbJoueurs;

        do {
            System.out.print("Entrez le nombre de joueurs (entre 2 et 4) : ");
            nbJoueurs = sc.nextInt();

            if (nbJoueurs < 2 || nbJoueurs > 4) {
                System.out.println("Erreur : Le nombre de joueurs doit être compris entre 2 et 4.");
            }
        } while (nbJoueurs < 2 || nbJoueurs > 4);

        sc.close();
        return nbJoueurs;
    }

    private static Plateau initialiserPlateau(int nbJoueurs) {
        Plateau plateau = new Plateau();
        plateau.initialiserJoueur(nbJoueurs);
        return plateau;
    }

    private static void afficherJoueurs(ArrayList<Joueur> joueurs) {
        System.out.print("Les joueurs sont : ");
        for (Joueur joueur : joueurs) {
            System.out.print(joueur.getPseudo()+ " ");
        }
    }
}
