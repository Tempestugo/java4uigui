package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.Country;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.Currency;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio.CurrencyFactor;

public class CurrencyFactorTest01 {
    static void main(String[] args) {
        Currency currency = CurrencyFactor.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}

