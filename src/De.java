public class De {
    // Attributs
    private int valeur;

    // Constructeur
    public De(){
        this.valeur = 0;
    }

    // Méthodes
    public int get_valeur(){
        return this.valeur;
    }

    public int lancer(){
        int max = 6;
        int min = 1 ;
        int range = max-min+1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
}
