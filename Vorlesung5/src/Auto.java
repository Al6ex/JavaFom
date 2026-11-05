public class Auto {
    // Instanzvariablen (gehören zu jedem einzelnen Objekt)
    private int ps;
    private String hersteller;


    public static int anzahl = 0;

    // Konstruktor
    public Auto(int ps, String hersteller) {
        this.ps = ps;
        this.hersteller = hersteller;
    }

    // Getter und Setter
    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
}
