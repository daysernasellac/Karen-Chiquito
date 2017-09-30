/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.negocio.impl;

import co.edu.semillero.escuelaquipux.datos.LoginDatos;
import co.edu.semillero.escuelaquipux.negocio.UsuarioNegocio;
import co.edu.semillero.escuelaquipux.dtos.UsuarioDTO;
/**
 *
 * @author andres.ospina
 */
public class UsuarioNegocioImpl implements UsuarioNegocio{
    
    private LoginDatos loginDatos;
    
    @Override
    public boolean registrar(UsuarioDTO usuarioDTO){
        loginDatos = new LoginDatos();
        return loginDatos.registrarUsuario(usuarioDTO);
       
    }
}
