import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;
        while (true) {
            System.out.println("Inserisci una stringa (:q per uscire): ");
            inputString = input.nextLine();
            if (inputString.equals(":q")) {
                System.out.println("Uscita dal programma");
                break;
            }
            for (int i = 0; i < inputString.length(); i++) {
                char lettere = inputString.charAt(i);
                System.out.println(lettere);
                if (i < inputString.length() - 1) {
                    System.out.println(",");
                }
            }
        }
    }
}
