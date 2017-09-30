/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.validacion;

import co.edu.semillero.escuelaquipux.dtos.LoginUsuarioDTO;
import co.edu.semillero.escuelaquipux.negocio.impl.LoginNegocioImpl;

/**
 *
 * @author carlos.ramirez
 */
public class LoginValidacion {
    
    public boolean login(LoginUsuarioDTO loginUsuario){
        if(loginUsuario.getUsuario().equals("")){
            System.out.println("No ingreso usuario");
            return false;
        }
        if(loginUsuario.getPassword().equals("")){
            System.out.println("No ingreso clave");
            return false;
        }
        LoginNegocioImpl loginNegocio=new LoginNegocioImpl();

        return loginNegocio.login(loginUsuario);
    }
    
}
