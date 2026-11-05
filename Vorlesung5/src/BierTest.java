public class BierTest {

    public static void main(String[] args) {
        // Erzeugen von drei Bierfässern
        Bierfass fass1 = new Bierfass("Pils", 50);
        Bierfass fass2 = new Bierfass("Weizen", 30);
        Bierfass fass3 = new Bierfass("Dunkel", 50);

        System.out.println("--- Initaler Zustand der Fässer ---");
        fass1.print();
        fass2.print();
        fass3.print();

        System.out.println("\nGesamtzahl Fässer: " + Bierfass.getAnzahlFaesser());
        System.out.println("Gesamtmenge Bier: " + Bierfass.getLiterGesamt() + " Liter");

        System.out.println("\n--- Zapfvorgänge ---");
        System.out.println("Zapfe 10 Liter aus Fass 1 (Pils)...");
        fass1.zapfen(10);

        System.out.println("Zapfe 5 Liter aus Fass 2 (Weizen)...");
        fass2.zapfen(5);

        System.out.println("\n--- Zustand nach dem Zapfen ---");
        fass1.print();
        fass2.print();
        fass3.print();

        System.out.println("\nGesamtmenge Bier verbleibend: " + Bierfass.getLiterGesamt() + " Liter");
    }
}
