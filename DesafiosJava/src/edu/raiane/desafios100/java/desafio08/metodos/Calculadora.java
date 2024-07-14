package edu.raiane.desafios100.java.desafio08.metodos;
    //Método pt01
    public class Calculadora {

        public void somarDoisNumeros() {
            System.out.println(10 + 10);
        }

        public void subtraiDoisNumeros() {
            System.out.println(21 - 2);
        }

        //Nesse caso, para executar esse método, precisa-se passar 2 valores inteiros
        //(int num1, int num2) são chamados de parâmetros
        public void multiplicaDoisNumeros(int num1, float num2) {
            System.out.println(num1 * num2);
        }

        public double divideDoisNumeros(double num1, double num2) {
            if (num2 == 0) {
                return 0;
            }
            return num1 / num2;
        }

        public double divideDoisNumeros02(double num1, double num2) {
            // if (num2 == 0)
            if (num2 != 0) {
                return num1 / num2;
            }
            // System.out.println("Não existe divisão por zero");
            return 0;
        }


        public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
            if (num2 == 0) {
                System.out.println("Não existe divisão por zero");
                // } else {
                return;
            }
            System.out.println(num1 / num2);
        }

        public void alteraDoisNumeros(int numero1, int numero2) {

            numero1 = 99;
            numero2 = 33;
            System.out.println("Dentro do alteraDoisNumeros");
            System.out.println("Num1=" + numero1);
            System.out.println("Num2=" + numero2);

        }

        public void somaArray(int[] numeros) {
            int soma = 0;
            for (int num : numeros) {
                soma += num;
            }
            System.out.println(soma);
        }

        public void somaVarArgs(int... numeros) {
            int soma = 0;
            for (int num : numeros) {
                soma += num;
            }
            System.out.println(soma);
        }
    }


