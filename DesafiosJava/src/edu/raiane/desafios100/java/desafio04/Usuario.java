package edu.raiane.desafios100.java.desafio04;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();

        boolean ligada = false;
        do {
            System.out.println("Digite 1 para ligar a tv");
            int ligarTv = sc.nextInt();

            if (ligarTv == 1) {
                smartTv.ligada = true;
                ligada = true;
                System.out.println("Tv ligada!");
            } else {

                System.out.println("Opção inválida");
            }
        } while (!ligada);

        boolean canalSelecionado = false;
        do {
            System.out.println("Escolha um canal: \n(Opções de canal: 1,  2,  3)");
            int canal = sc.nextInt();

            if (canal == 1) {
                canalSelecionado = true;
                System.out.println("Canal 1");
            } else if (canal == 2) {
                canalSelecionado = true;
                System.out.println("Canal 2");
            } else if (canal == 3) {
                canalSelecionado = true;
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
        } while (!canalSelecionado);


        boolean volumeEscolhido = false;

        do {
            System.out.println("Digite o volume desejado na TV(0 a 100): ");
            int volume = sc.nextInt();
            if (volume >= 0 && volume <= 100) {
                smartTv.volume = volume;
                volumeEscolhido = true;
                System.out.println("Volume escolhido: " + volume);
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
        } while (!volumeEscolhido) ;

        do {
            System.out.println("Deseja aumenta ou diminuir o volume? \n" +
                    "(Digite 'a' para aumentar, 'd' para diminuir, 's' para sair) ");
            String escolha = sc.next();

            if (escolha.equalsIgnoreCase("a")) {
                if (smartTv.volume < 100) {
                    smartTv.volume++;
                    System.out.println("Volume aumentado para: " + smartTv.volume);
                } else {
                    System.out.println("Volume já está no máximo (100);");
                }
            } else if (escolha.equalsIgnoreCase("d")) {
                if (smartTv.volume > 0) {
                    smartTv.volume--;
                    System.out.println("Volume diminuído para: " + smartTv.volume);
                } else {
                    System.out.println("Volume já está no mínimo(0).");
                }
            } else if (escolha.equalsIgnoreCase("s")) {
                volumeEscolhido = false;
                System.out.println("Tv desligada");
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
        } while (volumeEscolhido);


    }
}



