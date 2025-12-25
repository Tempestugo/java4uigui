package academy.devdojo.maratona.java.javacore.introducaoclasses.Oexecption.todo;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("DENTRO DO ArrayIndexOutOfBoundsException");

        }catch(IllegalArgumentException e){
            System.out.println("DENTRO DO IndexOutOfBoundsException");
        }catch(ArithmeticException e){
            System.out.println("DENTRO DO IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("DENTRO DO RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException throwable) {
            throwable.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }
}



