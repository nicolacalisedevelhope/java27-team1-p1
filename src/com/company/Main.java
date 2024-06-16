package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Dichiaro e istazio lo Scanner
        Scanner scanner = new Scanner(System.in);

        //Dichiaro e istazio variabile booleana che permette di fermare o continuare il programma
        boolean acceso = true;

        // Ciclo While dove utilizzo la variabile accesso come parametro
        while (acceso){

            //Chiedo all'utente di scegliere il tipo di operazione
            System.out.println("Seleziona l'operazione da svolgere: ");

            //Salvo l'input dell'utente in una variabile String
            String operazione = scanner.nextLine();

            //Invoco il metodo che permette il riconoscimento dell'operazione inserita dall'utente e l'accesso ai vari metodi
            riconosciOperazione(operazione, scanner);

            //Invoco il metodo per chiedere all'utente se vuole continuare a svolgere operazioni o uscire
            acceso = continuaUtilizzo(scanner , acceso);
        }
    scanner.close();
    }

    /**
     *
     * @param operazione Input inserito dall'utente per scegliere l'operazione
     * @param sc Scanner per poter accedere ad input dell'utente
     */
    public static void riconosciOperazione(String operazione, Scanner sc) {
        switch (operazione){
            case "+":
                //float risultatoSomma = somma(sc);
                //System.out.println("Il risultato è " + risultatoSomma);
                break;
            case "-":
               // sottrazione();
                break;
            case "*":
               // moltiplicazione();
                break;
            case "/":
               // divisiione();
                break;
            case "%":
               // controlloPari();
                break;
            case "^":
               // potenza();
                break;
            default:
                System.out.println("Carattere non riconosciuto!");

        }
    }

    /**
     *
     * @param sc Scanner per accedere all'input dell'utente
     * @param interruttore variabile che determina se il programma deve continuare o chiudersi
     * @return boolean per risposta utente per continuare o chiudere il programma
     */
    public static boolean continuaUtilizzo(Scanner sc, boolean interruttore){
        System.out.println("Vuoi eseguire altre operazioni? Premi 0 per uscire");
        sc.nextLine();
        String valore = sc.nextLine();

        if(valore.equalsIgnoreCase("0")){
            interruttore = false;
        }
        return interruttore;

    }
    public static float sottrazione( Scanner scan){
        System.out.println("Inserisci il primo numero: ");
        float num1 = scan.nextFloat();
        System.out.println("Inserisci il secondo numero: ");
        float num2 = scan.nextFloat();
        return num1 - num2;
    }
    public static float potenza(Scanner sc){
        System.out.println ("inserisci base");
        float base = sc.nextFloat();
        System.out.println ("inserisci esponente");
        int esponente = sc.nextInt();
        float risultato = base;

        for(int i = 1; i < esponente; i++){
            risultato = risultato * base;
        }
        return risultato;
    }




    public static float divisione( Scanner scan ){

        System.out.println("Inserisci il primo numero: ");
        float num1 = scan.nextFloat();
        System.out.println("Inserisci il secondo numero: ");
        float num2 = scan.nextFloat();
          if(num2 != 0){
            return num1 / num2;
        }else return 0;
}

      public static float moltiplicazione( Scanner scan){
        System.out.println("Inserisci il primo numero: ");
        float num1 = scan.nextFloat();
        System.out.println("Inserisci il secondo numero: ");
        float num2 = scan.nextFloat();
        return num1 * num2;


    }

}
