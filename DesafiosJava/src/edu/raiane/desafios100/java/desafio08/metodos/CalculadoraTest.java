package edu.raiane.desafios100.java.desafio08.metodos;
 import edu.raiane.desafios100.java.desafio08.metodos.Calculadora;


    public class CalculadoraTest {
        public static void main(String[] args) {

            Calculadora calculadora = new Calculadora();
          //  array de 5 posições com indice de 0 a 4
            int[] numeros = {1, 2, 3, 4, 5};
            calculadora.somaArray(new int[]{1, 2, 3, 4, 5});
            // calculadora.somaArray(numeros);
            calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);

        }
    }





 /*  Calculadora calculadora = new Calculadora();
    //array de 5 posições com indice de 0 a 4
    int[] numeros = {1, 2, 3, 4, 5};
            calculadora.somaArray(new int[]{1, 2, 3, 4, 5});
            // calculadora.somaArray(numeros);
            calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);*/
