import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Dans le code ci-dessous, je vais demander aux joueurs avec combien de dés ils veulent jouer;
         * et combien de tours de jeu ils veulent faire.
         */
        System.out.println("Avec combien de dés voulez-vous jouer ? ");
        int nb_des = scanner.nextInt();
        System.out.println("Combien de tours voulez-vous faire au cours de la partie ? ");
        int nb_tours = scanner.nextInt();
        /**
         * Création de la liste de dés en fonction du nombre de dés entrés par l'utilisateur
         */
        List<De> listDe = new ArrayList<>();
        for(int i = 0 ; i < nb_des ; i++){
            listDe.add(new De());
        }

        /**
         * Initialisation et lancement de la partie
         */
        Partie partie = new Partie(nb_tours, listDe);
        partie.initialiser();
        partie.lancer();

        /**
         * Affichage du gagnant
         */
        partie.afficher_gagnant();
    }
}
