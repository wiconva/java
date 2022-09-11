package J_Excepciones;

public class E1_Finally {
    public static void main(String[] args) {
        try{
            int [] a = {0,1};
            System.out.println(a[2]);//En esta línea el programa se cae.
        }catch (Exception e){
            System.out.println("El programa ha fallado...");
        }finally {
            //Se utiliza para cerrar flujos de archivos, DB, FTP, HTTP...
            System.out.println("Esta línea se ejecuta siempre así falle el código!!!");
        }
    }
}
