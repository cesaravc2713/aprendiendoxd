package poo;

public class Uso_coche {

    public static void main (String[] args) {

        coche micoche = new coche();

        micoche.establece_color("amarillo");

        System.out.println(micoche.dime_datosgenerales());

        System.out.println(micoche.dime_color());

        micoche.configura_asientos("si");

        System.out.println(micoche.dime_asientos());




    }











}
