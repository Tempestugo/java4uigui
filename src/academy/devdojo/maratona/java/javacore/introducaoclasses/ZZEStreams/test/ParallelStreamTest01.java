package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreamTest01 {
    public static void main(String[] args) {
        long num = 10_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    // 1. For Tradicional (Muito rápido para tipos primitivos)
    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + " Time: " + (end - init) + "ms");
    }

    // 2. Stream.iterate (Lento: Boxing/Unboxing e iteração sequencial)
    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + " Time: " + (end - init) + "ms");
    }

    // 3. Parallel Stream.iterate (Péssimo: Overhead de threads sem saber dividir tarefa)
    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum ParallelStreamIterate");
        long init = System.currentTimeMillis();
        // O .parallel() torna o fluxo paralelo, mas o iterate é ruim para dividir
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + " Time: " + (end - init) + "ms");
    }

    // 4. LongStream (Rápido: Primitivos e tamanho conhecido)
    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + " Time: " + (end - init) + "ms");
    }

    // 5. Parallel LongStream (O mais rápido para grandes volumes)
    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("Result: " + result + " Time: " + (end - init) + "ms");
    }
}