package A_scencials;

public class G1_Arrays {
    public static void main(String[] args) {
        //Forma 1 de inicializar un array.
        int [] arreglo1 = new int[5];
        arreglo1[0] =1;
        arreglo1[1] =2;
        arreglo1[2] =3;
        arreglo1[3] =4;
        arreglo1[4] =5;

        //Forma 2 de inicializar un array.
        int [] arreglo2 = {1,2,3,4,5};

        for(int i=0;i<arreglo1.length;i++){
            System.out.println("Arreglo1 en la posicion "+i+" : "+arreglo1[i]);
        }
        System.out.println("=======================================================");
        int i=0;
        for(int dato:arreglo2){
            System.out.println("Arreglo2 en la posicion "+i+" : "+dato);
            i++;
        }
    }
}
