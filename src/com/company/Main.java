package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
}
