public class StringArray {
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Java"};
        
        String teilString = stringArray[0].substring(0, 1);
        System.out.println(teilString + "."); // Teilaufgabe 1 

        System.out.println("Die Anzahl der Zeichen ist: " + stringArray[1].length()); // Teilaufgabe 2
        
        System.out.println("Die Zeichenkette ist: " + stringArray[2].toUpperCase()); // Teilaufgabe 3

        //System.out.println("Die Zeichenkette ist: " + stringArray[0].toLowerCase() + " " + stringArray[1].toLowerCase() + " " + stringArray[2].toLowerCase()); // Teilaufgabe 4
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].toLowerCase();
        }
        System.out.println("Die Zeichenkette ist: " + String.join(" ", stringArray)); // Teilaufgabe 4

        
    }
}
