import java.util.Scanner;
import java.util.*;


public class adiivina_numero_while2 {

    public static void main (String[] args) {

        int aleatorio =(int)(Math.random()*100);

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int intentos= 0;

        while(numero!=aleatorio){

            intentos++;

            System.out.println("introduce un numero");

            numero= scanner.nextInt();

            if(aleatorio<numero){
                System.out.println("mas bajo");
            }
            else if(aleatorio>numero){
                System.out.println("mas alto");
            }
        }


        System.out.println("correcto, lo has conseguido en " + intentos + " intentos");

    }
}
