import java.util.Scanner;
public class beta {
    public static  void Vielvaches(int zahl){
        Scanner scanner = new Scanner(System.in);
        System.out.println("zahl eingeben");
        String userinput2 = scanner.nextLine();
        double zahl1 = Double.parseDouble(userinput2);
        double zahl2 = 3 * zahl1;
        double zahl3 = 5 * zahl1;
        System.out.println(zahl2 + zahl3);



    }
}