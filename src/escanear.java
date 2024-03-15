
import java.util.Scanner;
public class escanear {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce tu nombre");

        String nombre = scanner.nextLine();

        System.out.println("introduce tu edad");

        int edad = scanner.nextInt();


        System.out.println("tu nombre es " + nombre + " y el proximo año tendras " + (edad+1) + " años");


    }

}
