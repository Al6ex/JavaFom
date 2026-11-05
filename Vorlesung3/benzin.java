import java.util.Scanner;

public class benzin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte den Benzinverbrauch in Litern eingeben: ");
        double liter = scanner.nextDouble();
        System.out.print("Bitte die gefahrenen Kilometer eingeben: ");
        double km = scanner.nextDouble();
        double verbrauch = (liter * 100) / km;
        System.out.printf("Der durchschnittliche Verbrauch beträgt %.2f Liter pro 100 km.%n", verbrauch);
        scanner.close();
    }
}