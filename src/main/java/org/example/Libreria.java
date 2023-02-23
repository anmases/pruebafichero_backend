package org.example;

import javax.management.loading.ClassLoaderRepository;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.ProtectionDomain;



public class Libreria {



    public Libreria(){}

    public static String buscarRuta(){
        String ruta = Libreria.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        File directorio = new File(ruta);
            File directorio2 = new File(directorio.getParent());
            String ruta2 = directorio2.getParent();
            return ruta2;
       }

    public static void escribirFichero() throws IOException {




        /**Class<?> clase = Libreria.class;
        ProtectionDomain protectionDomain = clase.getProtectionDomain();
        CodeSource codeSource = protectionDomain.getCodeSource();
        URL sitio = codeSource.getLocation();
        String ruta = sitio.toString();**/




        BufferedWriter escritor = new BufferedWriter(new FileWriter(buscarRuta()+"/texto.csv", true));
        escritor.write("Hola mundo");
        //Path filePath = Paths.get(Libreria.class.getResource("Libreria.java").toURI());
        //String prueba = filePath.toAbsolutePath().toString();
        //File archivo = new File(ruta);
        //System.out.println(ruta);
        escritor.close();
    }

}
