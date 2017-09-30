/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.datos;

import co.edu.semillero.escuelaquipux.dtos.UsuarioDTO;
import java.util.ArrayList;
import sun.applet.Main;

/**
 *
 * @author carlos.ramirez
 */
public class LoginDatos {

    public static ArrayList<UsuarioDTO> listaUsuarios = new ArrayList<UsuarioDTO>();

    public String consultarClaveUsuario(String usuario) {
        for(UsuarioDTO usuarioDTO: listaUsuarios){
            if(usuarioDTO.getUsuario().equals(usuario)){
                return usuarioDTO.getClave();
            }
        }
        return null;
    }

    public boolean registrarUsuario(UsuarioDTO usuario) {

        boolean registro = false;
        System.out.println("tamaño: "+listaUsuarios.size());
        try {         
            listaUsuarios.add(usuario);
            registro = true;
        } catch (Exception e) {
            System.out.println("se lanza exception");
            e.printStackTrace();
        }
        
         System.out.println("tamaño2: "+listaUsuarios.size());

        return registro;

    }
    
    
    
    public static void main(String[] args) {
        LoginDatos loginDatos = new LoginDatos();
        UsuarioDTO usuario = new UsuarioDTO();
        
        usuario.setUsuario("salim.castellanos");
        usuario.setClave("abc123");
        
        loginDatos.registrarUsuario(usuario);
        loginDatos.registrarUsuario(usuario);
        loginDatos.registrarUsuario(usuario);
        loginDatos.registrarUsuario(usuario);
        loginDatos.registrarUsuario(usuario);
    }

}
