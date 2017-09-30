/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.negocio.impl;

import co.edu.semillero.escuelaquipux.datos.EstudianteDatos;
import co.edu.semillero.escuelaquipux.dtos.EstudianteDTO;
import co.edu.semillero.escuelaquipux.negocio.EstudianteNegocio;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public class EstudianteNegocioImpl implements EstudianteNegocio{

    EstudianteDatos estudianteDatos = new EstudianteDatos();
    
    @Override
    public void registrar(EstudianteDTO estudiante) {
        estudianteDatos.registrar(estudiante);
    }
    
    @Override
    public List<EstudianteDTO> consultar(){
        return estudianteDatos.consultar();
    }
    
}
