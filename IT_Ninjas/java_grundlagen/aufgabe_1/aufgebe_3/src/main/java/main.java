import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Gib eine nummer ein");
        String zahl = sc.nextLine();
       int zahl1 = Integer.parseInt(zahl);
//        int fakultaet = 1;
  //              for (int i = 1 ; i <= zahl; i++) {
 //                   fakultaet*= i;
//                    System.out.println(fakultaet);
        int number = 0;
        int zahl2 = zahl1;
        for (int i = 1 ; i <= 100; i++){
            if (i %zahl2 == 0){

                number+=i;





            }
                }

        System.out.println(number);

    }
}
