/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.datos;

import co.edu.semillero.escuelaquipux.dtos.AsignacionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public class AsignacionDatos {
    
     public static ArrayList<AsignacionDTO> asignaciones = new ArrayList<AsignacionDTO>();

    public void registrar(AsignacionDTO asignacionDTO) {
        asignaciones.add(asignacionDTO);
    }
    
    public List<AsignacionDTO> consultar(){
        return asignaciones;
    }
     
}
