import java.util.Scanner;
import java.util.*;

public class uso_array3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] paises = new String[8];

        String pais;


        for(int i= 0; i<8; i++){
            paises[i]= pais = scanner.nextLine();
            System.out.println("introduce un pais " + (i+1));
        }

        for(String elemento:paises){
            System.out.println(elemento);

        }








    }
}
