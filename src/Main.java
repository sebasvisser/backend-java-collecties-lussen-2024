import java.util.Scanner;


public class Main {
    static Translator translator;
    public static void main(String[] args) {
        Integer[] numeric = {0,1,2,3,4,5,6,7,8,9};
        String[] alphabetic = {"nul","een","twee","drie","vier","vijf","zes","zeven","acht","negen"};
        Boolean play = true;
        String ongeldig = "Ongeldige Invoer";
        Scanner scanner = new Scanner(System.in);
        translator = new Translator(alphabetic,numeric);

        // via scanner input vragen
        System.out.println("Voer een getal in");
        Integer numberToTranslate = scanner.nextInt();
        String translated = translator.translate(numberToTranslate);
        System.out.println(translated); // This should print "een"



    }


}
//aak in de main methode van de Main class een boolean variabele genaamd `play` met de waarde `true`. Maak een String variabele genaamd `ongeldig` waarin je de String "ongeldige invoer" zet. Als laatst maak je nog een nieuw Scanner object aan met `Scanner scanner = new Scanner(System.in)`.
//        13. Vervolgens maak je een while-loop die doorgaat zolang `play` true is.
//14. Print in de while-loop `"Type 'x' om te stoppen \nType 'v' om te vertalen"` en maak een String variabele genaamd `input` waarin je de waarde van `scanner.nextLine()` opslaat.