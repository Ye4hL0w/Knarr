import cartes.Viking;
import jeu.Joueur;
import jeu.Plateau;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        affichageDebutJeu();
        int nbJoueurs = demanderNombreJoueurs(sc);
        boolean modeJeu = demanderModeJeu(sc);
        Plateau plateau = initialiserPlateau(nbJoueurs, modeJeu);
        afficherJoueurs(plateau.getJoueurs());

        sc.close();

    }

    private static void affichageDebutJeu() {
        System.out.println("=====================================");
        System.out.println("          Bienvenue sur KNARR!       ");
        System.out.println("=====================================");
    }

    private static int demanderNombreJoueurs(Scanner sc) {
        int nbJoueurs;

        do {
            System.out.print("Entrez le nombre de joueurs (entre 2 et 4) : ");
            nbJoueurs = sc.nextInt();

            if (nbJoueurs < 2 || nbJoueurs > 4) {
                System.out.println("Erreur : Le nombre de joueurs doit être compris entre 2 et 4.");
            }
        } while (nbJoueurs < 2 || nbJoueurs > 4);

        sc.nextLine();

        return nbJoueurs;
    }

    private static boolean demanderModeJeu(Scanner sc) {
        String modeJeu;

        do {
            System.out.print("Entrez le mode de jeu (normal ou avance) : ");
            modeJeu = sc.nextLine();

            if (!modeJeu.equals("normal") && !modeJeu.equals("avance")) {
                System.out.println("Erreur : Le mode de jeu doit être normal ou avance.");
            }
        } while (!modeJeu.equals("normal") && !modeJeu.equals("avance"));

        System.out.println(modeJeu);
        return modeJeu.equals("normal");
    }

    private static Plateau initialiserPlateau(int nbJoueurs, boolean modeJeu) {
        Plateau plateau = new Plateau();
        plateau.initialiserJeu(nbJoueurs, modeJeu);
        return plateau;
    }

    private static void afficherJoueurs(ArrayList<Joueur> joueurs) {
        System.out.print("Les joueurs sont : ");
        for (Joueur joueur : joueurs) {
            System.out.print(joueur.getPseudo() + " ");
        }
        System.out.println();
    }
}
