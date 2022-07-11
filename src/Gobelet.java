import java.util.List;

public class Gobelet {
    // La classe Gobelet représente le gobelet utilisé dans la partie.
    //Celui-ci a :
    //Deux attributs :
    //- Valeur : nombre représentant la valeur d'un lancer du gobelet
    //- Des : tableau de dés qui contient un certain nombre de dés
    //Un constructeur
    //- Avec un argument
    //o constructor(nb_des) : initialise la valeur du gobelet à 0, génère le nombre de
    //dés nécessaires à la partie et les ajoute au tableau des
    //Ainsi que 3 méthodes :
    //- get_valeur() : renvoie la valeur du gobelet
    //- lancer() : change la valeur des dés du gobelet ; met à jour la valeur du gobelet
    //- afficher_score() : affiche en console le score du dernier lancé de gobelet

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
    //- lancer() : change la valeur des dés du gobelet ; met à jour la valeur du gobelet
    public int lancer(){



        return 3;
    }

    //- afficher_score() : affiche en console le score du dernier lancé de gobelet

    public void afficher_score(){
        System.out.println("Le dernier score est : " + this.lancer());
    }

}
