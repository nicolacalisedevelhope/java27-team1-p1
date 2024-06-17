package com.company;
import java.util.Scanner;
public class Main {

    public static void main( String[] args ) {
        //Dichiaro e istazio lo Scanner
        Scanner sc = new Scanner(System.in);

        //Dichiaro e istazio variabile booleana che permette di fermare o continuare il programma
        boolean acceso = true;

        // Ciclo While dove utilizzo la variabile accesso come parametro
        while ( acceso ) {

            //Chiedo all'utente di scegliere il tipo di operazione
            System.out.println("Seleziona l'operazione da svolgere: ");

            //Salvo l'input dell'utente in una variabile String
            String operazione = sc.nextLine();

            //Invoco il metodo che permette il riconoscimento dell'operazione inserita dall'utente e l'accesso ai vari metodi
            riconosciOperazione(operazione, sc);

            //Invoco il metodo per chiedere all'utente se vuole continuare a svolgere operazioni o uscire
            acceso = continuaUtilizzo(sc, acceso);
        }
        sc.close();
    }

    /**
     * @param operazione Input inserito dall'utente per scegliere l'operazione
     * @param sc         Scanner per poter accedere ad input dell'utente
     */
    public static void riconosciOperazione( String operazione, Scanner sc ) {
        float risultato;
        switch ( operazione ) {

            case "+":
                risultato = somma(sc);
                System.out.println("Il risultato è " + risultato);
                break;

            case "-":
                risultato = sottrazione(sc);
                System.out.println("Il risultato è " + risultato);
                break;

            case "*":
                risultato = moltiplicazione(sc);
                System.out.println("Il risultato è " + risultato);
                break;

            case "/":
                risultato = divisione(sc);
                System.out.println("Il risultato è " + risultato);
                break;

            case "%":
                boolean res = controlloPari(sc);
                if(res){
                    System.out.println("Il numero è pari");
                }else System.out.println("Il numero è dispari");
                break;

            case "^":
                risultato =potenza(sc);
                System.out.println("Il risultato è " + risultato);
                break;

            default:
                System.out.println("Carattere non riconosciuto!");

        }
    }

    /**
     * @param sc           Scanner per accedere all'input dell'utente
     * @param interruttore variabile che determina se il programma deve continuare o chiudersi
     * @return boolean per risposta utente per continuare o chiudere il programma
     */

    public static boolean continuaUtilizzo( Scanner sc, boolean interruttore ) {
        System.out.println("Vuoi eseguire altre operazioni? Premi 0 per uscire");
        sc.nextLine();
        String valore = sc.nextLine();
        if ( valore.equalsIgnoreCase("0") ) {
            interruttore = false;
        }
        return interruttore;
    }

    public static float sottrazione( Scanner sc ) {
        System.out.println("Inserisci il primo numero: ");
        float num1 = sc.nextFloat();
        System.out.println("Inserisci il secondo numero: ");
        float num2 = sc.nextFloat();
        return num1 - num2;
    }

    public static float potenza( Scanner sc ) {
        System.out.println("inserisci base");
        float base = sc.nextFloat();
        System.out.println("inserisci esponente");
        int esponente = sc.nextInt();
        float risultato = base;
        for ( int i = 1; i < esponente; i++ ) {
            risultato = risultato * base;
        }
        return risultato;
    }


        public static boolean controlloPari ( Scanner sc){
            System.out.println("Inserisci il numero da controllare");
            float num = sc.nextFloat();
	        return num % 2 == 0;
        }

        public static float somma ( Scanner sc) {
            System.out.println("Inserisci il primo numero: ");
            float num1 = sc.nextFloat();
            System.out.println("Inserisci il secondo numero: ");
            float num2 = sc.nextFloat();
            return num1 + num2;

        }

        public static float divisione ( Scanner sc){

            System.out.println("Inserisci il primo numero: ");
            float num1 = sc.nextFloat();
            System.out.println("Inserisci il secondo numero: ");
            float num2 = sc.nextFloat();
            if ( num2 != 0 ) {
                return num1 / num2;
            } else return 0;
    }

            public static float moltiplicazione ( Scanner sc){
                System.out.println("Inserisci il primo numero: ");
                float num1 = sc.nextFloat();
                System.out.println("Inserisci il secondo numero: ");
                float num2 = sc.nextFloat();
                return num1 * num2;

            }



}

