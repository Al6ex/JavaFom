import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte den Radius eingeben: ");
        double radius = scanner.nextDouble();
        double flaeche = 2 * Math.PI * radius;
        System.out.printf("Fläche eines Kreises mit Radius %.2f beträgt %.2f",flaeche);
        scanner.close();

    }
        

        
    }
