
import java.util.Scanner;
public class evaluaredadejemplo2 {

    public static void main (String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("introduce tu edad");

        int edad = scanner.nextInt();

        if(edad<18) {
            System.out.println("eres adolescente");
        }
        else if(edad<40) {
            System.out.println("joven");
        }
        else if (edad<65){
            System.out.println("eres maduro");
        } else {
            System.out.println("cuidate");
        }






    }
}
