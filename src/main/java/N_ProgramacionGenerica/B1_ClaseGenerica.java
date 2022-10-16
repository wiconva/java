package N_ProgramacionGenerica;

import java.io.File;

public class B1_ClaseGenerica {
    public static void main(String[] args) {
        Generica <String> generica1 = new Generica<>();
        Generica <File>  generica2 = new Generica<>();

        generica1.setObjetoRecibido("Willian");
        generica2.setObjetoRecibido(new File("src/main/resources"));

        System.out.println(generica1.toString());
        System.out.println(generica2.toString());


    }
}
class Generica <T>{
    /*Una clase genérica puede recibir cualquier objeto, la ventaja ante la clase Object es que
      no es necesario realizar los casting para utilizarla luego lo que hace un código más legible.
      <T> indica que es un objeto genérico y no se conoce de antemano su tipo.
     */
    T objetoRecibido;
    Generica (){
       objetoRecibido = null;
    }
    public void setObjetoRecibido (T objeto){
        this.objetoRecibido = objeto;
    }

    @Override
    public String toString() {
        return "Generica{" +
                "objetoRecibido=" + objetoRecibido +
                "}  "+ objetoRecibido.getClass().getSimpleName();
    }
}
