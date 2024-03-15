
import java.util.Scanner;

public class acesso_aplicacion_while1 {

    public static void main (String[] args) {


        Scanner scanner= new Scanner(System.in);

        String clave= "cesar";

        String password= "";

        while(clave.equals(password)==false){


            System.out.println("introduce la contraseña");

            password = scanner.nextLine();

            if(clave.equals(password)==false) {

                System.out.println("contraseña incorrecta");

            } else{
                System.out.println("es correcta");

            }




        }
    }
}
