public class FahrzeugTest{

    public static void main (String args[]){

        // Einen PKW in Farbe grün erzeugen
        System.out.println ("Pkw");

        Pkw pkw = new Pkw("grün");

        System.out.println ("Motorrad");
        Motorrad motorrad = new Motorrad("gelb");

        pkw.print();
        motorrad.print();

    }
}
