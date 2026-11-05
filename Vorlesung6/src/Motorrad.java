class Motorrad extends Fahrzeug{

    private int spassFaktor;

    public Motorrad(String farbe){
        super(farbe);
        System.out.print("Geben Sie den Spassfaktor ein: ");
        spassFaktor = Tools.intEingabe();
    }

    public void print(){

        super.print();
        System.out.println("Spassfaktor: " + spassFaktor);
    }
}
