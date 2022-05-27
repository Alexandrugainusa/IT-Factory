import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema0 {
    public static void main(String[] args) {

        /**
        boolean = este un tip de data primitiv, care stocheaza valorile de adevar: true sau false;
                - valoarea default este false;

         String = este tip de data compus (o clasa), care reprezinta un sir de caractere;
                - valoarea default este null;
         **/

        // Declarare si Initializare a variabilelor: string, integer, float,boolean in compilator;

        Scanner input = new Scanner(System.in);
        System.out.println("Vrei sa vezi declararea si initializarea de variabila in JAVA?");
        System.out.println("Tasteaza DA sau NU: ");
        String raspuns = input.nextLine();
        boolean eroare;

        if (raspuns.equalsIgnoreCase("da")){
            System.out.println("Tasteaza o variabila de tip String:");
            String a = input.nextLine();
            System.out.println("String variabila = " + "\"" + a +"\"" + ";");

            int b = 0;
            do{
                eroare = false;
                try {
                    System.out.println("Tasteaza o variabila de tip integer:");
                     b = input.nextInt();
                    System.out.println("int variabila = " + b + ";");
                } catch (InputMismatchException e) {
                        System.out.println("Ai introdus un al tip de variabila!");
                        eroare = true;
                        input.nextLine();
                }
            }while (eroare);

            float c = 0;
            do{
                eroare = false;
                try {
                    System.out.println("Tasteaza o variabila de tip float:");
                     c = Float.parseFloat(input.next());
                    System.out.println("float variabila = " + c +"F" + ";");
                } catch (NumberFormatException e) {
                    System.out.println("Ai introdus un al tip de variabila!");
                    eroare = true;
                    input.nextLine();
                }
            }while (eroare);


            boolean d=true;
            do {
                eroare = false;
                try {
                    System.out.println("Tasteaza o variabila de tip boolean:");
                    d = input.nextBoolean();
                    System.out.println("boolean variabila = " + d + ";");
                } catch (InputMismatchException e){
                    System.out.println("Ai introdus un al tip de variabila!");
                    eroare = true;
                    input.nextLine();
                }
            }while (eroare);

            System.out.println("=======================================================");

            System.out.println("Ai declarat si initializat urmatoarele tipuri de date: ");
            System.out.println("String variabila = " + "\"" + a +"\"" + ";");
            System.out.println("int variabila = " + b + ";");
            System.out.println("float variabila = " + c +"F" + ";");
            System.out.println("boolean variabila = " + d + ";");

            System.out.println("=======================================================");

        }else if(raspuns.equalsIgnoreCase("nu")){
            System.out.println("Nu vrei sa vezi declararea si initializarea aici!");
        }else {
            System.out.println("Nu stiu cum inveti programare! :))");
        }
    }
}
