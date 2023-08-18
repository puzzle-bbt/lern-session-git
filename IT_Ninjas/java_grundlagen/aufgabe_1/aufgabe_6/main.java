package aufgabe_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String eingabe");
        String userinput = scanner.nextLine();
        StringBuilder builder = new StringBuilder(userinput);
        builder.reverse();
        System.out.println(builder);
        int shu = userinput.indexOf(".");
        System.out.println(shu + " Zeichen lang.");

    }
}
