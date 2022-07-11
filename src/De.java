public class De {
    // Attributs
    private int valeur;

    // Constructeur
    public De(){
        this.valeur = 0;
    }

    // Méthodes

    /**
     * La méthode get_valeur() renvoie la valeur initiale du dé.
     * @return valeur
     */
    public int get_valeur(){
        return this.valeur;
    }

    /**
     * La méthode lancer() renvoie une valeur aléatoire comprise entre 1 et 6 pour simuler la lancé du dé.
     * @return valeur aléatoire entre 1 et 6.
     */
    public int lancer(){
        int max = 6;
        int min = 1 ;
        int range = max-min+1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
}
