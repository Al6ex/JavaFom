public class Autos {
    private int ps;
    private String hersteller;

    public Autos(int ps, String hersteller) {
        this.ps = ps;
        this.hersteller = hersteller;

    }

    public int getPs() {
        return ps;
    }
    public String getHersteller() {
        return hersteller;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

}

public class AutoMain {
    public static void main(String[] args) {
        Autos a = new Autos();
        Autos b = new Autos();
        a.setPs(1000);
        a.setHersteller("Hersteller A");
        b.setPs(2000);
        b.setHersteller("Hersteller B");

        System.out.println(a.getPs() + a.getHersteller());
        System.out.println(b.getPs() + b.getHersteller());

    }
}