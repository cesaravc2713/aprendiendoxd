import javax.swing.*;

public class entradaejemplo2 {
    public static void main (String[] args) {

        String nombre =JOptionPane.showInputDialog("intrudoce tu nombre porfavor");

        String edad= JOptionPane.showInputDialog("introduce la edad porfavor");

        int edad_usuario=Integer.parseInt(edad);

        edad_usuario++;


        System.out.println("tu nombre es " + nombre + " y en dos años tendras " + (edad_usuario+1) + " años");


    }
}
