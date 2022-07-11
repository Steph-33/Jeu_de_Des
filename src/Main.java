import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<De> listDe = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++){
            listDe.add(new De());
        }
        Gobelet gobelet = new Gobelet( listDe);
        gobelet.lancer();
        gobelet.afficher_score();
    }
}
