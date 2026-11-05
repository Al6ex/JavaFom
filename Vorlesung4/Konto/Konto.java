public class Konto
{
   private Person person;
   private double kontostand;


   
   public Konto (String name, String vorname, double kontostand)
   {
      // Neues Person-Objekt mit den übergebenen Namensdaten erzeugen
      this.person = new Person(name, vorname);
      this.kontostand = kontostand;
   }

   public Person getPerson()
   {
      return person;
   }

   public double getKontostand()
   {
      return kontostand;
   }

   // Liefert Vorname und Nachname als formatierten String für die Ausgabe
   public String getPersonenInfos()
   {
      return person.getVorname() + " " + person.getName();
   }
}
