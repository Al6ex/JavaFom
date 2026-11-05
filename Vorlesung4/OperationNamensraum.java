
public class OperationNamensraum
{
   public static void main (String [] args)
   {
      Quadrat quad = new Quadrat();
      quad.setSeitenlaenge(4);
      Kreis kreis = new Kreis();
      kreis.setRadius(5);

      //Flaecheninhalt des Quadrats
      System.out.println ("Flaecheninhalt des Quadrats: " + quad.getSeitenlaenge() * quad.getSeitenlaenge());

      //Flaecheninhalt des Kreises
      System.out.println ("Flaecheninhalt des Kreises: " + 3.14159 * kreis.getRadius() * kreis.getRadius());
   }
}

class Quadrat
{
   private double seitenlaenge;
   public void setSeitenlaenge (double seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
   }
   public double getSeitenlaenge ()
   {
      return seitenlaenge;
   }
}

class Kreis
{
   private double radius;
   public void setRadius (double radius)
   {
      this.radius = radius;
   }
   public double getRadius ()
   {
      return radius;
   }
}
