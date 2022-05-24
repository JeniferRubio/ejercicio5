package Clase09;

public class Main {
    public static void main(String args[])
    {
        Usuario usuario = new Usuario("joseluis@gmail",12345);

        System.out.println(usuario.getEmail());
        System.out.println(usuario.getPassword());
       

        usuario.setPerfil(new Perfil("jose", 9657622));
        System.out.println(usuario.getPerfil().getNombres());
        System.out.println(usuario.getPerfil().getTelefono());
       
    }
    
}
