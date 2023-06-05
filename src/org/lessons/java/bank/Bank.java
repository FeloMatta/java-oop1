package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nome proprietario
        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scanner.nextLine();

        // creo numero random per il numero del conto
        int numeroConto = random.nextInt(1000) + 1;
        Conto conto = new Conto(numeroConto, nomeUtente);

        boolean esci = false;
        while (!esci) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1 -> {
                    System.out.print("Quanto vuoi versare? ");
                    double importoVersamento = scanner.nextDouble();
                    conto.versa(importoVersamento);
                }
                case 2 -> {
                    System.out.print("Quanto vuoi prelevare? ");
                    double importoPrelievo = scanner.nextDouble();
                    conto.preleva(importoPrelievo);
                }
                case 3 -> esci = true;
                default -> System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}
