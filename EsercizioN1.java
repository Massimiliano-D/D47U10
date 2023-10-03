public class EsercizioN1 {
    public static void main(String[] args) {
        // Test della funzione stringaPariDispari
        String inputString1 = "quattro";
        String inputString2 = "otto";

        boolean isEvenLength1 = stringaPariDispari(inputString1);
        boolean isEvenLength2 = stringaPariDispari(inputString2);

        System.out.println(inputString1 + " è una stringa di lunghezza pari? " + isEvenLength1);
        System.out.println(inputString2 + " è una stringa di lunghezza pari? " + isEvenLength2);


        // Test della funzione anno Bisestile
        int year1 = 1996;
        int year2 = 2001;

        boolean isLeapYear1 = annoBisestile(year1);
        boolean isLeapYear2 = annoBisestile(year2);

        System.out.println(year1 + " è un anno bisestile? " + isLeapYear1);
        System.out.println(year2 + " è un anno bisestile? " + isLeapYear2);
    }


    /*public static boolean stringaPariDispari(String str) {
        int lunghezza = str.length();
        return lunghezza % 2 == 0;
    }*/
    public static boolean stringaPariDispari(String str) {
        int lunghezza = str.length();
        if (lunghezza % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
