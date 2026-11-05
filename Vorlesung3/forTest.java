public class forTest {
    public static void main(String[] args) {
        //5.12
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            }
        }

        //5.13 

        int groesse = 10;

        // Äußere for-Schleife für die Zeilen
        for (int k = 0; k < groesse; k++) {
            // Innere for-Schleife für die Spalten (Zeichen pro Zeile)
            for (int j = 0; j < groesse; j++) {
                System.out.print("*");
            }
            // Zeilenumbruch nach jeder vollständigen Zeile
            System.out.println();
        }
    }



