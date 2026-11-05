public class switch_case extends Tools {
    public static void main(String[] args) {
        System.out.println("Bitte eine Punktzahl eingeben (max. 10): ");
        int punkte = Tools.intEingabe();

        String bewertung;

        switch (punkte) {
            case 10:
                bewertung = "sehr gut";
                break; 
            case 9:
                bewertung = "gut";
                break;
            case 8:
                bewertung = "befriedigend";
                break;
            case 7:
                bewertung = "ausreichend";
                break;
            case 6:
                bewertung = "mangelhaft";
                break;
                
            case 5: 
            case 4: 
            case 3: 
            case 2: 
            case 1: 
            case 0:
                bewertung = "ungenügend";
                break;
                
            default:
                bewertung = "Ungültige Punktzahl";
        }

        System.out.println("Die Bewertung ist: " + bewertung);

    }
}