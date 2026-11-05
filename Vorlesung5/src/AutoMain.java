public class AutoMain {
    public static void main(String[] args) {
        // Erstes Auto-Objekt erzeugen und anzahl um 1 erhöhen
        Auto auto1 = new Auto(150, "BMW");
        Auto.anzahl++;

        // Zweites Auto-Objekt erzeugen und anzahl um 1 erhöhen
        Auto auto2 = new Auto(90, "Mazda");
        Auto.anzahl++;

        // Ausgaben der Instanzvariablen von auto1
        System.out.println("Auto 1:");
        System.out.println("Hersteller: " + auto1.getHersteller());
        System.out.println("PS: " + auto1.getPs());
        System.out.println();

        // Ausgaben der Instanzvariablen von auto2
        System.out.println("Auto 2:");
        System.out.println("Hersteller: " + auto2.getHersteller());
        System.out.println("PS: " + auto2.getPs());
        System.out.println();

        // Ausgabe der Klassenvariablen anzahl
        System.out.println("Gesamtzahl der erzeugten Autos: " + Auto.anzahl);
    }
}
