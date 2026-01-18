package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZG.dominio;

public class CurrencyFactor {
    public CurrencyFactor(Country country) {
    }

    public static Currency newCurrency(Country country){
        switch (country){
            case USA:return new UsDollar();
            case BRAZIL:return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
