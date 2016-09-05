/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Login {
    
    
    public boolean Usuario(String cUsuario, String cClave)
            
    {
     boolean btnEnviar; 
     if (cUsuario.equals("user") && cClave.equals("1234"))
     {
         btnEnviar = true; 
     }   
    else
     {
      btnEnviar = false; 
     }  
    return btnEnviar ;
    }
}
