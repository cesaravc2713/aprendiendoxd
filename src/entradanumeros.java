import javax.swing.*;


public class entradanumeros {
    public static void main (String[] args) {

        /*double x = 100000.0;

        System.out.printf("%1.4f", x/2);*/

        String num1=JOptionPane.showInputDialog("introduce un numero");

        double num2=Double.parseDouble(num1);

        System.out.println("la raiz de "+ num2 + " es ");

        System.out.printf("%1.10f", Math.sqrt(num2));
    }
}
