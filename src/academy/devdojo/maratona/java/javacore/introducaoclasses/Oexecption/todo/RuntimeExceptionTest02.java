package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
    }

    private static int divisao(int a, int b) {

        if (b == 0) {
            throw new RuntimeException("Argumento Ilegal parceiro");
        }
        return a / b;


//            throw new ArithmeticException("");
//        }
//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

        }
    }


