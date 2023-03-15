import java.util.Scanner;

public class miinus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku: ");
        int i = lukija.nextInt();
        System.out.println("Syötä toinen luku: ");
        int a = lukija.nextInt();
        
        System.out.println("Ensimmäinen luku miinustettuna toisesta on: " + i + " - " + a + " = ");
        System.out.println(i-a);
    }
}
