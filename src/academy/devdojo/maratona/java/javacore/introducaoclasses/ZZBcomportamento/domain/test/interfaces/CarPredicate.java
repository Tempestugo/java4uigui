package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.interfaces;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZBcomportamento.domain.test.Car;

public interface CarPredicate {
    // anonimas, funções, conciso
    boolean test(Car car);
    //(parametro) -> <expressão>
     //(Car car) -> car.getColor().equals("")
    // esse método precisa dizer como el vai se comportar (boolean e recebe um carro)
}
