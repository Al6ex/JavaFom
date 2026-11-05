public class ZooTest {
    public static void main(String[] args) {
        // Zebra und Pinguin erzeugen
        Zebra zebra = new Zebra("Marty", 220, 80);
        Pinguin pinguin = new Pinguin("Kowalski", 15, true);

        // polymorphe Methode aufrufen
        polymorpheMethode(zebra);
        polymorpheMethode(pinguin);
    }

    public static void polymorpheMethode(ZooTier t) {
        // Ausgabe von Name und Gewicht über die Getter der Basisklasse
        System.out.println("Name   : " + t.getName());
        System.out.println("Gewicht: " + t.getGewicht() + " kg");
        System.out.println("-------------------------");
    }
}