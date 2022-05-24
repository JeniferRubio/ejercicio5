package Clase09;

public class Perfil 
{
    private String nombres;

    private int telefono;


    Perfil(String nombres, int telf)
{
    setNombre(nombres);
    setTelefono(telf);
    
}
    void setNombre(String nombres)
    {
        this.nombres= nombres;
    }

    String getNombres()
    {
      return nombres;
    }

    void setTelefono(int telf)
    {
        telefono=telf;
    }
    int getTelefono()
    {
        return telefono;
    }
  

}
