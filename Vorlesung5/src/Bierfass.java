public class Bierfass {
    // Private Instanzvariablen (gehören zu jedem einzelnen Fass)
    private String sorte;
    private int liter;
    private int fassId;

    // Private Klassenvariablen (werden von allen Fässern geteilt)
    private static int anzahlFaesser = 0;
    private static int literGesamt = 0;

    // Konstruktor
    public Bierfass(String sorte, int liter) {
        this.sorte = sorte;
        this.liter = liter;

        // Anzhal Fässer inkrementieren und als fassId zuweisen
        anzahlFaesser++;
        this.fassId = anzahlFaesser;

        // Gesamte Literanzahl aller Fässer aktualisieren
        literGesamt += liter;
    }

    // Methode zum Zapfen von Bier
    public void zapfen(int liter) {
        if (liter <= this.liter) {
            this.liter -= liter;
            literGesamt -= liter;
        }
        else {
            System.out.println("Nicht genügend Bier im Fass! (Verfügbar: " + this.liter + " Liter)");
        }
        
    }

    // Methode zur Ausgabe aller Informationen des Fasses
    public void print() {
        System.out.println("Fass-ID: " + fassId + " | Sorte: " + sorte + " | Inhalt: " + liter + " Liter");
    }

    // Getter für die statischen Klassenvariablen
    public static int getAnzahlFaesser() {
        return anzahlFaesser;
    }

    public static int getLiterGesamt() {
        return literGesamt;
    }
}
