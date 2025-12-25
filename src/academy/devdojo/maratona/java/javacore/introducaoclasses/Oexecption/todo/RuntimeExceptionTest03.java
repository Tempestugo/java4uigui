package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao();

//        try {
//            System.out.println("Abrindo arquivo");
//            throw new RuntimeException();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }finally {
//            System.out.println("Fechando recurso liberado pelo SO");
//
//        }
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            return "conexão aberta";

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
        return null;
    }


    private static String abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            return "conexão aberta";

        } finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
    }
}



