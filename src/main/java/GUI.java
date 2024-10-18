import java.util.Scanner;

public class GUI {
    public static void main(String[] args) {
        //Plateau plateau = new Plateau();
        System.out.println("=====================================");
        System.out.println("          Bienvenue sur KNARR!       ");
        System.out.println("=====================================");

        System.out.print("Entrez le nombre de joueurs (entre 2 et 4) : ");

        Scanner sc = new Scanner(System.in);
        int nbJoueurs = sc.nextInt();

        // verification du nombre de joueurs entre
        while (nbJoueurs < 2 || nbJoueurs > 4) {
            System.out.println("Erreur : Le nombre de joueurs doit être compris entre 2 et 4.");
            System.out.print("Veuillez entrer un nombre valide : ");
            nbJoueurs = sc.nextInt();
        }

        System.out.println("Le nombre de joueurs est : " + nbJoueurs);

        sc.close();
    }
}
