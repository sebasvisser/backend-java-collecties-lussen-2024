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


        while(play) {
            System.out.println("Type 'x' om te stoppen \n Type 'v' om te vertalen");
            String input = scanner.nextLine();

            if(input.equals("x") ){
                play = false;
                System.out.println("Bedankt en tot ziens.");
            } else if(input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int numberInput = scanner.nextInt();
                scanner.nextLine();
                if (numberInput < 10){
                    String result = translator.translate(numberInput);
                    System.out.println("De vertaling van " + numberInput + " is " + result);
                } else {
                    System.out.println("ongeldig");
                }
            } else {
                System.out.println("ongeldig");
            }
        }


    }


}
