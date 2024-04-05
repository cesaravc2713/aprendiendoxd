import java.util.Scanner;
import java.util.*;

public class uso_array2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] paises = new String[8];

        paises[0]= "españa";
        paises[1]= "mexico";
        paises[2]= "colombia";
        paises[3]= "peru";
        paises[4]= "chile";
        paises[5]= "ecuador";
        paises[6]= "venezuela";
        paises[7]= "argentina";

        /*for(int i=0; i< paises.length; i++){
            System.out.println("pais " + (i+1)+ paises[i]);
        }*/

        for(String elemento:paises){
            System.out.println(elemento);

        }








    }
}
