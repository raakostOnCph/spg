public class Hund extends Command
{

   public String gø() {

       return "vov vov";
   }


   public String gåEnTur() {

       return "fedt det vil jeg gerne";
   }

    @Override
    public String command()
    {
        return gø();
    }
}
