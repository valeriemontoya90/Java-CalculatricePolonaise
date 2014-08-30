import java.util.ArrayList;

public class Calculette implements CalculetteInterface {

    ArrayList<Double> Pile = new ArrayList<Double>();

    public static void main(String[] args) {
        Calculette ok = new Calculette();
        ok.empile(1);
        ok.empile(2);
        ok.empile(7);
        ok.afficherPile();
        ok.plus();
        System.out.println(ok.resultat());
        ok.afficherPile();
    }

    /*
     * Toutes les opérations s'effectuent sur les derniers chiffres de la Pile
     */

    @Override
    public void plus() throws RuntimeException {
        // TODO Auto-generated method stubs
        if (Pile.size() > 1) {
            double elt1 = Pile.remove(Pile.size() - 1);
            double elt2 = Pile.remove(Pile.size() - 1);
            Pile.add(elt1 + elt2);
            this.afficherPile();
        }
    }

    @Override
    public void mult() throws RuntimeException {
        // TODO Auto-generated method stub
        if (Pile.size() > 1) {
            double elt1 = this.Pile.remove(Pile.size() - 1);
            double elt2 = this.Pile.remove(Pile.size() - 1);
            this.Pile.add(elt1 * elt2);
            this.afficherPile();
        }
    }

    @Override
    public void moins() throws RuntimeException {
        // TODO Auto-generated method stub
        if (Pile.size() > 1) {
            double elt1 = this.Pile.remove(Pile.size() - 1);
            double elt2 = this.Pile.remove(Pile.size() - 1);
            this.Pile.add(elt2 - elt1);
            this.afficherPile();
        }
    }

    @Override
    public void div() {
        // TODO Auto-generated method stub
        if (Pile.size() > 1) {
            double elt1 = this.Pile.remove(Pile.size() - 1);
            double elt2 = this.Pile.remove(Pile.size() - 1);
            this.Pile.add(elt2 / elt1);
        }
    }

    @Override
    public void empile(double n) {
        // TODO Auto-generated method stub
        this.Pile.add(n);
        this.afficherPile();
    }

    @Override
    public double resultat() {
        // TODO Auto-generated method stub
        if (this.Pile.isEmpty()) {
            return 0.0;
        }
        return this.Pile.get(Pile.size() - 1);
    }

    public void afficherPile() {
        // for (int i = 0; i < this.Pile.size(); i++) {
        // System.out.println(Pile.get(i));
        // }
        System.out.println(Pile.toString());
    }
}
