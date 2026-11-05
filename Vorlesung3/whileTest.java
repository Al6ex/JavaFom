public class whileTest extends Tools{
    public static void main(String[] args) {
        
        //5.09
        int i = 0;

        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }





        //5.10
        int groesse = 10;

        // Äußere Schleife für die Zeilen
        for (int k = 0; k < groesse; k++) {
            // Innere Schleife für die Spalten (Zeichen pro Zeile)
            for (int j = 0; j < groesse; j++) {
                System.out.print("*");
            }
            // Zeilenumbruch nach jeder vollständigen Zeile
            System.out.println();
        }



        //5.11
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int anzahl = 0;

        System.out.println("Geben Sie Zahlen ein (0 zum Beenden):");

        while (true) {
            // Nutzt deine statische Methode aus Tools.java
            int zahl = Tools.intEingabe();

            // Abbruchbedingung
            if (zahl == 0) {
                break;
            }

            // Min und Max aktualisieren
            if (zahl < min) {
                min = zahl;
            }
            if (zahl > max) {
                max = zahl;
            }

            anzahl++;
        }

        // Ergebnis ausgeben
        if (anzahl == 0) {
            System.out.println("Es wurden keine gültigen Zahlen (außer 0) eingegeben.");
        } else {
            System.out.println("Kleinste Zahl: " + min);
            System.out.println("Größte Zahl: " + max);
        }

    }
}
