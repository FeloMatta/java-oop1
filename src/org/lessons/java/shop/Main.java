package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // Creo un nuovo prodotto
        Prodotto prodotto = new Prodotto("Prodotto 1", "Descrizione prodotto 1", 10.0, 0.22);

        // Stampo i dati del prodotto
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("IVA: " + prodotto.getIva());

        // Modifica dei dati del prodotto
        prodotto.setNome("Nuovo nome");
        prodotto.setDescrizione("Nuova descrizione");
        prodotto.setPrezzo(20.0);
        prodotto.setIva(0.10);

        // I dati del prodotto aggiornati
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("IVA: " + prodotto.getIva());

        // Metodi aggiuntivi
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo IVA inclusa: " + prodotto.getPrezzoIvaInclusa());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
    }
}
