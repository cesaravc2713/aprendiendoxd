import java.util.Scanner;
import java.util.*;

public class compruebarroba_for2 {
    public static void main (String[] args) {


        boolean arroba= false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce tu email");
        String email;
        email= scanner.nextLine();

        for(int i=0;i<email.length();i++){

            if(email.charAt(i)=='@'){
                arroba = true;

            }


        }
        if (arroba==true){
            System.out.println("es correcto");
        } else {
            System.out.println("es incorrecto");
        }

    }
}
