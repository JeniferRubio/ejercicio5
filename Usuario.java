package Clase09;

public class Usuario 
{
    private String email;
    private int password;
    private Perfil perfil;
   
     Usuario(String email, int password)
     {
        setEmail(email);
        setPassword(password);
      
      
     }

     void setEmail(String email)
     {
         this.email= email;
     }

     String getEmail()
     {
         return email;
     }

     void setPassword(int password)
     {
         this.password= password;
     }
     int getPassword()
     {
         return password;
     }
     void setPerfil(Perfil perfil)
     {
         this.perfil= perfil;
     }
 
     Perfil getPerfil()
     {
         return perfil;
     }

}
