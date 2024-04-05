import java.util.Scanner;
import java.util.*;

public class uso_array4 {
    public static void main (String[] args) {

       int[] matriz_aleatorios = new int[200];

       for(int i=0; i<matriz_aleatorios.length; i++){

           matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
       }

       for(int numeros:matriz_aleatorios){

           System.out.print(numeros+ " ");
       }








    }
}
