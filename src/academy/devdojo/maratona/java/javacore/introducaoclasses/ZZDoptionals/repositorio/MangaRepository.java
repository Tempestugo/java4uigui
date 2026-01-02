package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZDoptionals.repositorio;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZDoptionals.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> manga = List.of(new Manga(1234, "Sakurajima", 120),
            new Manga(2, "Overlord", 10));


    public static Optional<Manga> findByTitle(String title) {
        Manga found = null;
        for (Manga m : manga) {
            if (m.getTitle().equals(title)) {
                found = m; // Ele atribui o mangá encontrado à variável 'found'
            }
        }
        return Optional.ofNullable(found); // Retorna Optional.empty() ou Optional com o mangá
    }

    public static Optional<Manga> findByTitle2(String title) {
        return findBy(m ->m.getTitle().equals(title));

    }
    public static Optional<Manga> findById2(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }



        public static Optional<Manga> findById(Integer id) {
        Manga found = null;
        for (Manga m : manga) {
            if (m.getId().equals(id)) {
                found = m; // Ele atribui o mangá encontrado à variável 'found'
            }
        }
        return Optional.ofNullable(found); // Retorna Optional.empty() ou Optional com o mangá
    }
    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for(Manga m : manga){
            if(predicate.test(m)){
                found = m;
            }

        }
        return Optional.ofNullable(found); // Retorna Optional.empty() ou Optional com o mangá

    }





}