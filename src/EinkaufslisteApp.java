import java.util.ArrayList;
import java.util.HashSet;

public class EinkaufslisteApp {

    public static double sum(ArrayList<Einkauf>einkaufsliste) {
        double sum = 0;
        for (Einkauf artikel : einkaufsliste) {
            sum += artikel.getPreis();
        }
        return sum;
    }

    public static double sum(HashSet<Einkauf>einkaufsliste) {
        double sum = 0;
        for (Einkauf artikel : einkaufsliste) {
            sum += artikel.getPreis();
        }
        return sum;
    }

    public static HashSet<Einkauf> unique(ArrayList<Einkauf>einkaufsliste) {
        HashSet<Einkauf> set = new HashSet<>();
        set.addAll(einkaufsliste);
        return set;
    }

    public static void main(String[] args) {

        ArrayList<Einkauf> einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Banana", 1.5));
        einkaufsliste.add(new Einkauf("Apfel", 0.7));
        einkaufsliste.add(new Einkauf("Schokolade", 2.5));
        einkaufsliste.add(new Einkauf("Schokolade", 2.5));
        einkaufsliste.add(new Einkauf("Brot", 3.5));
        einkaufsliste.add(new Einkauf("Brot", 3.5));
        einkaufsliste.add(new Einkauf("Kartoffeln", 3.2));
        einkaufsliste.add(new Einkauf("Käse", 2.6));


        System.out.println("sum(einkaufsliste) = " + sum(einkaufsliste));
        HashSet<Einkauf> unique = unique(einkaufsliste);
        System.out.println("unique = " + unique);
        System.out.println("sum(unique) = " + sum(unique));


    }
}
