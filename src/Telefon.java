public class Telefon
{

    Brug specefikTelefon;

    public Telefon(Brug specefikTelefon)
    {
        this.specefikTelefon = specefikTelefon;
    }

    public String anvend () {

     return specefikTelefon.ring();
   }
}
