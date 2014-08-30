import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class CalcInterp implements CalcInterpInterface {

    ArrayList<String> Arraychiffre = new ArrayList<String>();
    ArrayList<Character> chiffre = new ArrayList<Character>();
    ArrayList<Character> operateur = new ArrayList<Character>();
    Calculette maCalculette = new Calculette();
    boolean QueDesOperandesSansChiffres;

    public CalcInterp() {
    }

    /*
     * @param f Le reader Ã  lire (par exemple un FileReader).
     * 
     * @return le sommet de la pile de la calculette aprÃ¨s interprÃ©tation de
     * tout le fichier
     * 
     * @throws IOException Si une erreur d'entrÃ©e sortie a lieu.
     */
    /*
     * 234 45
     * 
     * + 11 31 + /
     */

    @Override
    public double calcule(Reader f) throws IOException {
        if (f == null) {
            return 0.0;
        } else {
            int c = f.read();
            String chaine;
            while (c != -1) { // Tant qu'on arrive pas à la fin du
                              // fichier
                if ((c >= 48) && (c <= 57)) {
                    chiffre.add((char) c);
                }
                // if ((c == 32) || (c == 42) || (c == 43) || (c == 45) || (c ==
                // 47) || (c == 92))
                if ((c < 48) || (c > 57)) {
                    // On constitue ici un chiffre/un nombre si avant
                    // l'opérateur il
                    // y a un ou plus chiffres. Sinon on ne fait rien.
                    chaine = "";
                    for (int i = 0; i < chiffre.size(); i++) {
                        chaine = chaine + chiffre.get(i);
                    }
                    if (!chaine.isEmpty()) {
                        maCalculette.empile(Double.parseDouble(chaine));
                    }
                    chiffre.clear();
                }
                if (c == 42) {
                    maCalculette.mult();
                }
                if (c == 43) {
                    maCalculette.plus();
                }
                if (c == 45) {
                    maCalculette.moins();
                }
                if (c == 47) {
                    maCalculette.div();
                }
                c = f.read();
            }
            if (!chiffre.isEmpty()) { // Si le dernier caractère est un chiffre
                chaine = "";
                for (int i = 0; i < chiffre.size(); i++) {
                    chaine = chaine + chiffre.get(i);
                }
                if (!chaine.isEmpty()) {
                    maCalculette.empile(Double.parseDouble(chaine));
                }
                chiffre.clear();
            }
            return maCalculette.resultat();
        }
    }

    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("OperationsCalculette26.txt");
        CalcInterp fr01 = new CalcInterp();
        System.out.println(fr01.calcule(f));
    }
}