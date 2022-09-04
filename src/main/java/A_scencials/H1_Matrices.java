package A_scencials;

public class H1_Matrices {

    public static void main(String[] args) {
        int [][] matriz = new int [2][2];
        matriz[0][0] =10;
        matriz[0][1] =11;
        matriz[1][0] =12;
        matriz[1][1] =13;

        int [][] matriz2 = {{1,2}, {3,4}};
        int i=0, j=0;
        for(int[] array:matriz){//Ietera por fila que es una array.
            i++;
            for(int dato:array){
                j++;
                System.out.println("Dato en la posición de la Matriz 1 ["+i+"]["+j+"] = "+dato);
            }
            j=0;
        }
        System.out.println("====================================================================");
        for(int[] array:matriz2){
            i++;
            for(int dato:array){
                j++;
                System.out.println("Dato en la posición de la Matriz 2 ["+i+"]["+j+"] = "+dato);
            }
            j=0;
        }

    }
}
