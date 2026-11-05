class Pkw extends Fahrzeug{

    private String modellBezeichnung;

    public Pkw(String farbe){
        super(farbe);
        System.out.print("Geben Sie die Modellbezeichnung ein: ");
        modellBezeichnung = Tools.stringEingabe();



    }

    public void print(){

        super.print();
        System.out.println("Modell bezeichnung: " + modellBezeichnung);
    }
}
