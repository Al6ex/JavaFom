public class ZooTier {
    private int gewicht;
    private String name;

    public ZooTier(String name, int gewicht){
        this.name = name;
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
