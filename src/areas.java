import java.util.Scanner;
import javax.swing.*;
public class areas {

    public static void main (String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("elige una opcion: \n1 cuadrado \n2 rectangulo \n3 triangulo \n4 circulo ");

        int figura= scanner.nextInt();

        switch (figura){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("introduce el lado")) ;

                System.out.println("el area del cuadrado es " + Math.pow(lado,2));

                break;
            case 2:
                int base =Integer.parseInt(JOptionPane.showInputDialog("introduce la base")) ;
                int altura =Integer.parseInt(JOptionPane.showInputDialog("introduce la altura")) ;

                System.out.println("el area del rectangulo es " + base*altura);
                break;

            case 3:
                base =Integer.parseInt(JOptionPane.showInputDialog("introduce la base")) ;
                altura =Integer.parseInt(JOptionPane.showInputDialog("introduce la altura")) ;

                System.out.println("el area del triangulo es " + (base*altura)/2 );
                break;

            case 4:

                int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce el radio")) ;

                System.out.print("el area del circulo es " );

                System.out.printf("1.2%f", Math.PI*(Math.pow(radio,2)));

                break;

            default:

                System.out.println("no es el numero correcto");






        }


    }


}
