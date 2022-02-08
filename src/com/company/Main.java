package com.company;

import java.util.Scanner;

public class Main {
//Criar um programa em java que tenha as seguintes fncionalidaes
    // 1. preencher um vetor 5 posições com números inteiros.
    // 2. iimprimir o maior valor armazenado no vetor
    // 3. imprimir o menor valor armanezado no velor
    public static void main(String[] args) {

       int[] v = new int[5]; // Variavel local
       preencher(v); // Argumento do Método --> Variável que verá enviada
        int maior = maiorValor(v);
        int menor = menorValor(v);
        System.out.println("maior valor = " + maior );
        System.out.println("menor valor = " + menor);
    }
    public static int maiorValor(int[] v){
        int aux = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] > aux){
                aux = v[i];
            }
        }
        return aux;
    }

    public static int menorValor(int[] v){
        int aux = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] < aux){
                aux = v[i];
            }
        }
        return aux;
    }

    public static void preencher(int[] v){ // v é um parâmetro do metodo
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < v.length; i++){
            System.out.println("Valor: " );
            v[i] = teclado.nextInt();
        }
        teclado.close();

    }
}
