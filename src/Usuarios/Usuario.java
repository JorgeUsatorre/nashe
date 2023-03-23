package Usuarios;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Usuario {


    String nombre;
    String contraseña;



    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    FileWriter ou=null;
    PrintWriter fich=null;

    public void nombreUsuario(File fichero){
        String nombre= "Username: ";
        String contraseña= "\nPassword: ";
        try{
            ou = new FileWriter (fichero);
            fich = new PrintWriter(ou);
            fich.write(nombre);
            //fich.print(PedirDatos.pedirString( "Nombre de usuario"));
            fich.write(contraseña);
            //fich.println(PedirDatos.pedirString("Contraseña"));


        }catch (IOException ex){
            System.out.println("error de escritura" + ex.getMessage());
        }
        finally{
            fich.close();
        }
    }

}