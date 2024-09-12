package org.example;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número a ser testado na sequência Fibonacci");
        int num = sc.nextInt();

        if(isFibonacci(num)){
            System.out.println("O número " + num + "pertence a sequência");
        }else{
            System.out.println("O número" + num + "nao pertence a sequência");
        }


    }

    public static boolean isFibonacci(int n) {
        if (n < 0) return false;
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n || a == n;
    }
}
