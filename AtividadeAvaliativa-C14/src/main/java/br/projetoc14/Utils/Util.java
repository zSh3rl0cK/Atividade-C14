package br.projetoc14.Utils;

import java.util.Scanner;

public class Util {
    public static int criarHPSeguro(String entrada) {
        //Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                entrada = entrada.trim();

                if (entrada.isEmpty()) {
                    System.out.println("Entrada vazia! Tente novamente.");
                    continue;
                }

                int numero = Integer.parseInt(entrada);

                if (numero <= 0) {
                    System.out.println("Digite apenas números inteiros positivos não nulos!");
                    continue;
                }

                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números!");
            }
        }
    }

    public static int lerHPSeguro(String entrada) {
        //Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                entrada = entrada.trim();

                if (entrada.isEmpty()) {
                    System.out.println("Entrada vazia! Tente novamente.");
                    continue;
                }

                int numero = Integer.parseInt(entrada);

                if (numero < 0) {
                    System.out.println("Digite apenas números inteiros positivos!");
                    continue;
                }

                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números!");
            }
        }
    }

}
