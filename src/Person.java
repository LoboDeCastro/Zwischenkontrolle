public class Person {

    private String vorname;
    private String nachname;
    public int koerpergroesse;
    public byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String rechneBMI(int gewicht) {
       double bmi = gewicht / ((koerpergroesse / 100.0) * (koerpergroesse / 100.0));

       if (gewicht > 30)
           return "Adipositas";
       if (gewicht >= 25)
           return "Übergewicht";
       if (gewicht >= 18.5)
           return "Normalgewicht";
       else
           return "Untergewicht";
    }

    public void printPerson(int gewicht) {
        String wert;
        switch (aktivitaetslevel) {
            case 1:
                wert = "Couch Potato";
                break;
            case 2:
                wert = "Gelegenheitssportler";
                break;
            case 3:
                wert = "Sportler";
                break;
            case 4:
                wert = "Profisportler";
                break;
            default:
                wert = "not allowed value";
        }

        System.out.println(vorname + " " + nachname + ", " + wert + ", " + rechneBMI(gewicht));
    }
}
