/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.negocio;

import co.edu.semillero.escuelaquipux.dtos.AsignacionDTO;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public interface AsignacionNegocio {

    public void asignar();
    List<AsignacionDTO> cosultar();
    
}
