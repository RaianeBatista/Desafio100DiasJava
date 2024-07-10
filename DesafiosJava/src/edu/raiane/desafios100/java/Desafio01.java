package edu.raiane.desafios100.java;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        int idadeAnos = sc.nextInt();

        int idadeEmDias = idadeAnos * 365;
        int idadeEmMeses = idadeAnos * 12;
        
        System.out.println("A idade em dias é: " + idadeEmDias + " dias");
        System.out.println("A idade em meses é: " + idadeEmMeses + " meses");

    }
}


