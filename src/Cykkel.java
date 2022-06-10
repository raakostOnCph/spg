public class Cykkel extends Command
{

    public String klokke() {

        return "ring ring";

    }

    @Override
    public String command()
    {
        return klokke();
    }
}
