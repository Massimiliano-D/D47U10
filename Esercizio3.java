import java.util.Scanner;

public class Esercizio3 {
    /*public static void main(String[] args) {
        int numeroIniziale = 10;
        System.out.println("Conto alla rovescia");
        while (numeroIniziale >= 0) {
            System.out.println(numeroIniziale);
            numeroIniziale--;
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = input.nextInt();
        input.close();
        if (numero == 0) {
            System.out.println("Il numero deve essere maggiore di zero.");
        } else {
            System.out.println("Conto alla rovescia:");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}
