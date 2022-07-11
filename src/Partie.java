import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {
    // Attributs
    private List<Joueur> joueurs = new ArrayList<>();
    private int nb_tours;
    private Gobelet gobelet;

    // Constructeur
    public Partie(int nb_tours, Gobelet gobelet) {
        this.nb_tours = nb_tours;
        this.gobelet = gobelet;
    }

    // Méthodes

    /**
     * La méthode initialiser permet d'entrer le nombre de joueurs participant à la partie, ainsi que
     * leurs noms.
     */
    public List<Joueur> initialiser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de joueurs : ");
        int nb_joueurs = scanner.nextInt();
        for (int i = 0; i < nb_joueurs; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Veuillez entrer le nom du joueur n°" + (i + 1));
            String nom = scanner1.next();
            Joueur joueur = new Joueur(nom);
            this.joueurs.add(joueur);
        }
        return this.joueurs;
    }

    /**
     * La méthode lancer simule le fait que chaque joueur joue à tour de rôle pendant n tours.
     */
    public void lancer() {
        Joueur gagnant = this.joueurs.get(0);
        for (int i = 0; i < this.nb_tours; i++) {
            for (Joueur joueur : joueurs) {
                joueur.jouer(this.gobelet);
                joueur.afficher_score();
                if (joueur.get_score() > gagnant.get_score()) {
                    gagnant = joueur;
                }
            }
        }
        this.afficher_gagnant(gagnant);
    }

    public void afficher_gagnant(Joueur gagnant){
        System.out.println("Le gagnant est " + gagnant.get_nom() + "avec un score de " + gagnant.getScore());
    }

}

