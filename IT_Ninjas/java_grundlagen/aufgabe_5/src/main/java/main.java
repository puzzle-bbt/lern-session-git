import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String poem = """
     Ein Ninja leise wie der Wind, Seine Waffen stets geschwind. "Shurikens" fliegen, scharf und schnell, Klingen funkeln, furchterregend hell. "Nunchakus" wirbeln im Tanz, Mit jedem Schlag, im Vorteil er ganz. Seine Waffen, geheim und klug, Begleiten ihn bei jedem Zug.""";

        var items = poem.split(" ");

        System.out.println("This receipt has " + items.length );
        for (String item : items);
        String CAPS = poem.toUpperCase();
        System.out.println(CAPS);
        String Punkt = poem.replace(" ",".");
        System.out.println(Punkt);
        int shu = poem.indexOf("\"");
        System.out.println(shu + " Zeichen lang.");
        StringBuilder builder = new StringBuilder(poem);
        for (int i = 62; i <=72; i++) {
            builder.deleteCharAt(i);
        }
        System.out.println(builder);

    }
}
