public class Parser {
    public static void main(String[] args) {
        String pfad = "C:\\Eigene Dateien\\Javatest\\Beispiel.java";

        
        int letzterBackslash = pfad.lastIndexOf('\\');
        int letzterPunkt = pfad.lastIndexOf('.');

        String extension = pfad.substring(letzterPunkt + 1);
        
        String dateiname = pfad.substring(letzterBackslash + 1, letzterPunkt);
        
        String verzeichnis = pfad.substring(0, letzterBackslash);

        System.out.println("Extension: " + extension);
        System.out.println("Dateiname: " + dateiname);
        System.out.println("Verzeichnis: " + verzeichnis);
        
        System.out.println(1 - --5);

    }
}


