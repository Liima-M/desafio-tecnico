package org.example;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um texto ou palavra para verificar a existência da letra A");

        String texto = sc.nextLine();

        int cont = 0;

        //Converte a string para minúscula
        texto = texto.toLowerCase();

        //Percorre os caracteres da String e verifica se contem a letra 'a'
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                cont++;
            }
        }

        if(cont > 0){
            System.out.println("A letra 'a' aparece " + cont + " vezes.");
        }else {
            System.out.println("Não foi possivel encontrar a letra 'a'");
        }
    }
}
