public class uso_arrays {

    public static void main (String[] args) {

        int[] matriz= new int[5];

        matriz[0]=5;
        matriz[1]=23;
        matriz[2]=56;
        matriz[3]=78;
        matriz[4]=98;


        for(int i=0;i<matriz.length;i++){
            System.out.println("valor de indice " +i+ " = " + matriz[i]);
        }



    }
}
