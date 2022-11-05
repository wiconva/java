package M_ArchivosDirectorios;

import java.io.File;
import java.io.FilenameFilter;
import java.text.FieldPosition;

public class B1_Busqueda {
    public static void main(String[] args) {
        //Ruta con separador del sistema operativo.
        String ruta ="src"+File.separator+"main"+File.separator+"resources"+File.separator+"ficheros"+File.separator+"folderNuevo";

        //crea una representación abstracta del archivo.
        File [] file = new File(ruta).listFiles();

        //Imprime el contenido dentro de la carpeta.
        if (file.length > 0){
            System.out.println("Cantidad de archivos: "+file.length);
        }
        for (File f: file){
            System.out.println(f);
        }

        //Crea una busqueda de los archivos.
        File[] encotrados = new File(ruta).listFiles(new Filtro());

        // Cuando el método sobre-escrito devuelve true guarda un registro en el array.
        for (File f:encotrados){
            System.out.println("El archivo encotrado fue: "+f.getName()
            +"y su ruta: "+f.getAbsolutePath());
        }

    }
}

class Filtro implements FilenameFilter {
    String objetivo = "folder";//Objetivo busqueda.


    //Método sobrescrito que es llamdado cada archivo dentro de la ruta especificada del objeto File.
    @Override
    public boolean accept(File dir, String name) {
        return name.contains(objetivo);
    }
}