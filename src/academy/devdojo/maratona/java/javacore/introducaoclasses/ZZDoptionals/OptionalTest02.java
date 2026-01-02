package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZDoptionals;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZDoptionals.domain.Manga;
import academy.devdojo.maratona.java.javacore.introducaoclasses.ZZDoptionals.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle2("Sakurajima");
        mangaByTitle.ifPresent(m -> m.setTitle("Sakurajima1234"));
        System.out.println(mangaByTitle);

        MangaRepository.findById2(1234).orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRepository.findByTitle2("Sakurajima").orElseGet(() -> new Manga(3, "drifeter", 20));

    }
}
