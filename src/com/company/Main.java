
package com.company;
import java.util.Scanner;
public class Main {

    public static void main( String[] args ) {
        //Dichiaro e istazio lo Scanner
        Scanner sc = new Scanner(System.in);

        //Invoco il metodo  per selezionare l'input
        sceltaInput(sc);
        sc.close();
    }

    public static void sceltaInput( Scanner sc){

        boolean acceso = true;

        while ( acceso ) { //ciclo while che permette di rieffettuare una scelta dopo il completamento dell'operazione inserita
            System.out.println("Inserisci 0 per uscire o 1 per inserire un'espressione o 2 per inserire una potenza");
            int op = sc.nextInt();
            sc.nextLine();
            //sceglie l'operazione de eseguire in base al valore immesso
            switch ( op ) {
                case 0:
                    acceso = false;
                    break;
                case 2:
                    //richiama il metodo potenza e ne stampa il risultato
                    System.out.println("Il risultato della potenza è: " + potenza(sc));
	                break;
                case 1:
                    //richiama il metodo per la scelta dell'operazione
                    sceltaOperazione(sc);
	                break;
            }
        }

    }

    public static void sceltaOperazione(Scanner sc){

        System.out.println("Inserisci l'espressione");
        String espressione = sc.nextLine();

        // Rimuovi spazi bianchi e trimma l'espressione
        espressione = espressione.replaceAll("\s+", "");

        // Divide l'espressione in base agli operatori +, -,, /, %
        String[] elementi = espressione.split("(?<=[-+/%*])|(?=[-+/%*])");

        //inizializza la variabile risultato al valore del primo elemento dell'array
        float risultato = Float.parseFloat(elementi[0]);

        //Invoca la funzione per calcolare l'espressione e ne stampa il risultato
        System.out.println(calcolaEspressioneMatematica(risultato, elementi));
    }


    public static float calcolaEspressioneMatematica( float risultato, String[] elementi ) {

        //esegue l'operazione corretta per ogni valore inseito
        for ( int i = 1; i < elementi.length; i += 2 ) {
            //rileva l'operatore da utilizzare
            String operatore = elementi[i];

            //rileva il numero da inserire nell'operazione
            float numero = Float.parseFloat(elementi[i + 1]);

            //sceglie quale operazione effettuare
            switch ( operatore ) {
                case "+":
                    risultato =somma (numero, risultato);
                    break;
                case "-":
                    risultato = sottrazione (numero, risultato);
                    break;
                case "*":
                    risultato = moltiplicazione (numero, risultato);
                    break;
                case "/":
                    risultato =  divisione (numero, risultato);
                    break;
                case "%":
                    controlloPari(numero);
                    break;
                default:
                    System.out.println("Operatore non riconosciuto: " + operatore);
            }
        }
        return risultato;
    }


        public static float sottrazione ( float numero, float res ){
            res -= numero;
            return res;
        }


        public static float potenza ( Scanner sc ){
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


        public static void controlloPari ( float numero){

                if ( numero % 2 == 0 ) {
                    System.out.println("il numero " + numero + " è pari");
                } else {
                    System.out.println("il numero " + numero + " è dispari");
                }
        }


        public static float somma ( float numero, float res){
            res += numero;
            return res;
        }


        public static float divisione ( float numeri, float res){

            if ( numeri == 0 ) {
                System.out.println("Impossibile eseguire divisione per zero");
                return Float.NaN;
            } else {
                res /= numeri;
            }
            return res;
        }


        public static float moltiplicazione ( float numero, float res ){
            res *= numero;
            return res;
        }

    }


