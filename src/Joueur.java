public class Joueur {

    // Attributs
    private String nom;
    private int score;

    // Constructeurs
    public Joueur(){

    }

    public Joueur(String nom){
        this.nom = nom;
        this.score = 0;
    }

    // Getters et Setters
    public String getNom(){
        return this.nom;
    }

    public int getScore() {
        return score;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Méthodes
    public String get_nom(){
        return this.nom;
    }

    public int get_score(){
        return this.score;
    }

    //- afficher_score() : affiche en console le score du joueur

    /**
     * La méthode jouer() prend en paramètre un objet de type Gobelet et renvoie la mise à jour du score du jouer
     * @param gobelet de type Gobelet.
     * @return score
     */
    public int jouer(Gobelet gobelet){
       int score = gobelet.lancer();
       return this.setScore(score);
    }

    public void afficher_score(){
        System.out.println("Le score du joueur " + this.get_nom() + " est : " + this.get_score());
    }
}
