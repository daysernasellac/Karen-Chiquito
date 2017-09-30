/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.negocio;

import co.edu.semillero.escuelaquipux.dtos.MateriaDTO;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public interface MateriaNegocio {

    public void crearMaterias();

    public List<MateriaDTO> consultar();
    
}
