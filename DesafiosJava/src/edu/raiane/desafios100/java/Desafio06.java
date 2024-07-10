package edu.raiane.desafios100.java;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite um número para ver a sua tabuada:");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for(int i = 1; i <=10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
