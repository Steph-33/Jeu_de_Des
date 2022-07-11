import java.util.List;

public class Gobelet {

    // Attributs
    private int valeur;
    private List<De> des;

    // Constructeurs
    public Gobelet(){

    }
    public Gobelet(List<De> nb_des){
        this.valeur = 0;
        this.des = nb_des;
    }

    // Méthodes

    /**
     * La méthode get_valeur() renvoie la valeur du gobelet
     * @return valeur
     */
    public double get_valeur(){
        return this.valeur;
    }

    /**
     * La méthode lancer met à jour la valeur obtenue après chaque lancer.
     * @return valeur du gobelet
     */
    public int lancer(){
        for(int i = 0 ; i < this.des.size(); i++){
            this.valeur += des.get(i).lancer();
        }
        return this.valeur;
    }

    /**
     * La méthode afficher_score affiche le score obtenu par le joueur.
     */
    public void afficher_score(){
        System.out.println("Le dernier score est : " + this.get_valeur());
    }
}
