import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<De> listDe = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++){
            listDe.add(new De());
        }
        // Gobelet gobelet = new Gobelet( listDe);
        // Joueur joueur = new Joueur("Steph");
        // joueur.jouer(gobelet);
        // joueur.afficher_score();

        Partie partie = new Partie(4, listDe);
        partie.initialiser();
        partie.lancer();
    }
}
