import java.util.Scanner;
import java.util.*;


public class factorial_for3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int resultado=1;

        int numero;
        numero= scanner.nextInt();

        for(int i= numero;i>0;i--){
            resultado=resultado*i;
        }

        System.out.println("el factorial de " + numero + " es " + resultado);



    }
}
