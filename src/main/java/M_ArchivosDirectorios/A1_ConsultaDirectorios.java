package M_ArchivosDirectorios;

import java.io.File;

public class A1_ConsultaDirectorios {
    public static void main(String[] args) {
        //Se utiliza el el campoo statico separator para tomar el que usa el SO.
        String ruta ="src"+File.separator+"main"+File.separator+"resources"+File.separator+"ficheros"+File.separator+"folderNuevo";
        System.out.println(ruta);
        File file = new File(ruta);//Cuando no se epecifica ruta toma la del proyecto por defecto..
        if (!file.exists()) {file.mkdir();} //Crea el folde si no existe.

        String [] contenido = file.list();
        File f;
        //Listando carpetas dentro de otras.
        for (String c:contenido){
            System.out.println(c);
            f = new File(file.getAbsolutePath(),c);
            if (f.isDirectory()){

                String [] subFiles = f.list();
                for (String f2: subFiles){
                    System.out.println("\t"+f2);
                }

            }
        }
    }
}
