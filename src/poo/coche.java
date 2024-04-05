package poo;

public class coche {

    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    private String color;

    private int peso_total;

    private boolean asientos_cuero, climatizador;



    public coche () {

        ruedas= 4;
        largo= 2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;



    }
    public String dime_datosgenerales(){//Getter (devolver dato)

        return("la plataforma del coche tienee " + ruedas +
                " ruedas, mide "+ largo/1000 + "metros con un" +
                "ancho de " + ancho + " centimetros y un peso" +
                "de plataforma de "+ peso_plataforma+ " kilos");
    }

    public void establece_color(String color_coche){//Setter (modificar dato)

        color = color_coche;
    }
    public String dime_color(){

        return ("el color del coche es " + color);
    }

    public void configura_asientos(String asientos_cuero){


        if(asientos_cuero=="si"){

            this.asientos_cuero=true;

        } else {
            this.asientos_cuero=false;
        }
    }
    public String dime_asientos(){
        if(asientos_cuero==true){

            return ("el coche tiene asientos de cuero");
        }else{
            return(" el coche tiene asientos de serie");
        }
    }
}
