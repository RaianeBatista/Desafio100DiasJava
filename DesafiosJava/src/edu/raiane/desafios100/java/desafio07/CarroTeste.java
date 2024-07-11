package edu.raiane.desafios100.java.desafio07;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();//variavel de referêncai do carro1
        Carro carro2 = new Carro();//variável de referência do carro2

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT500";
        carro2.ano = 1968;

        System.out.println("Carro 01");
        System.out.println("Nome do veículo: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno de fabricação: " + carro1.ano);

        System.out.println("\nCarro 02");
        System.out.println("Nome do veículo: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno de fabricação: " + carro2.ano);



    }
}
