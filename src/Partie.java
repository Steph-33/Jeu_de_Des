import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {
    // Attributs
    private List<Joueur> joueurs = new ArrayList<>();
    private int nb_tours;
    private Gobelet gobelet;

    // Constructeur
    public Partie (int nb_tours, List<De> nb_des){
        this.nb_tours = nb_tours;
        this.gobelet = new Gobelet(nb_des);
    }

    // Méthodes

    /**
     * La méthode initialiser permet d'entrer le nombre de joueurs participant à la partie, ainsi que
     * leurs noms.
     */
    public List<Joueur> initialiser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de joueurs : ");
        int nb_joueurs = scanner.nextInt();
        for(int i = 0 ; i < nb_joueurs ; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Veuillez entrer le nom du joueur n°" + (i+1));
            String nom = scanner1.next();
            Joueur joueur = new Joueur(nom);
            this.joueurs.add(joueur);
        }
        return this.joueurs;
    }

    /**
     * La méthode lancer simule le fait que chaque joueur joue à tour de rôle pendant n tours.
     */
    public void lancer(){
        for(int i = 0 ; i < this.joueurs.size(); i++){
            int score = 0;
            // for(int j = 0 ; j < this.nb_tours ; j++){
                this.joueurs.get(0).jouer(this.gobelet);
                score = this.joueurs.get(0).get_score();
                System.out.println("Le score de " + this.joueurs.get(i).get_nom() + " est : " + score);
                // this.joueurs.get(i).afficher_score();
            // }
        }
    }

}
