
import java.util.Scanner;
import java.util.*;

public class peso_ideal_whiledo {

    public static void main (String[] args) {

        String genero="";
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("introduce tu genero(m/f");
            genero= scanner.nextLine();



        } while(genero.equalsIgnoreCase("m")==false && genero.equalsIgnoreCase("f")==false);

        System.out.println("introduce tu altura en cm");
        int altura;
        altura =  scanner.nextInt();

        int pesoideal= 0;

        if(genero.equalsIgnoreCase("m")) {
            pesoideal= altura-110;
        } else if (genero.equalsIgnoreCase("f")) {
            pesoideal= altura-120;

        }

        System.out.println("tu peso ideal es "+ pesoideal);

    }

}
