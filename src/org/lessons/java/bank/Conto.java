package org.lessons.java.bank;

public class Conto {
    private final int numeroConto;
    private String proprietario;
    private double saldo;

    public Conto(int numeroConto, String proprietario) {
        this.numeroConto = numeroConto;
        this.proprietario = proprietario;
        this.saldo = 0;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    // Versamento
    public void versa(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Hai versato " + importo + "€. Saldo attuale: " + saldo + "€");
        } else {
            System.out.println("L'importo da versare deve essere maggiore di zero.");
        }
    }

    // Prelievo
    public void preleva(double importo) {
        if (importo > 0) {
            if (saldo >= importo) {
                saldo -= importo;
                System.out.println("Hai prelevato " + importo + "€. Saldo attuale: " + saldo + "€");
            } else {
                System.out.println("Saldo insufficente. Impossibile prelevare " + importo + "€");
            }
        } else {
            System.out.println("L'importo da prelevare deve essere maggiore di zero.");
        }
    }

    public String getInformazioniConto() {
        return "Conto: " + numeroConto + "\nProprietario: " + proprietario;
    }

    public String getSaldoFormattato() {
        return String.format("%.2f€", saldo);
    }
}
