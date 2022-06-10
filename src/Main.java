import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Command> ting = new ArrayList<>();


        ting.add(new Hund());
        ting.add(new Hund());
        ting.add(new Cykkel());
        ting.add(new Kaffemaskine());
        ting.add(new Hund());
        ting.add(new Cykkel());
        ting.add(new Kaffemaskine());


        Hund vaks = new Hund();

        Cykkel sco = new Cykkel();



        Command test;










//        for (Object o : ting) {
//
//            if (o instanceof Hund) {
//                System.out.println(((Hund) o).gø());
//            }
//            if (o instanceof Kaffemaskine) {
//                System.out.println(((Kaffemaskine) o).Bryg());
//
//            }
//            if (o instanceof Cykkel) {
//
//                System.out.println(((Cykkel) o).klokke());
//            }
//        }
//
//
//        System.out.println("\n\n");
//
//
//
//        List<Command> commands = ting;
//
//        for (Command command : ting) {
//            System.out.println(command.command());
//        }
//
//
//
//
//
//        Telefon nokiaTelefon = new Telefon(new Nokia());
//        Telefon AppleTelefon = new Telefon(new Iphone());
//        Telefon androidTelefon = new Telefon(new Android());
//
//
//        Telefon nickisTelefon = new Telefon(new Nokia());
//
//        System.out.println(nokiaTelefon.anvend());
//
//        nickisTelefon.specefikTelefon = new Android();
//
//        System.out.println(nickisTelefon.anvend());
//
//
//        List<Telefon> telefonList = new ArrayList<>();
//
//        telefonList.add(nickisTelefon);
//        telefonList.add(AppleTelefon);
//        telefonList.add(androidTelefon);
//
//        nickisTelefon.specefikTelefon = new Iphone();
//
//        for (Telefon telefon : telefonList) {
//
//            System.out.println(telefon.anvend());
//        }


        // her
        while (true) {
            String s = input("hvad vil du gå et tur med ?");

            Map<String, Command> commandMap = new HashMap<>();

            commandMap.put("hund", new Hund());
            commandMap.put("kaffemaskine", new Kaffemaskine());
            commandMap.put("cykkel", new Cykkel());

            Command command = commandMap.getOrDefault(s, new Hund());

            System.out.println(((Hund) command).gåEnTur());
        }


    }

    public static String input (String s) {

        System.out.println(s);

        Scanner scanner = new Scanner(System.in);

        String svar = scanner.nextLine();

       return svar;


    }

}
