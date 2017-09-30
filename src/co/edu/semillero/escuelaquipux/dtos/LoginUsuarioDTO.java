/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.dtos;

/**
 *
 * @author salim.castellanos
 */
public class LoginUsuarioDTO {
    
    private String usuario;
    private String password;

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getPassword(){
        return this.password;
    }
      
}
