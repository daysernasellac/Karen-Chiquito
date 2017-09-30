/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.negocio.impl;

import co.edu.semillero.escuelaquipux.datos.MateriaDatos;
import co.edu.semillero.escuelaquipux.dtos.MateriaDTO;
import co.edu.semillero.escuelaquipux.negocio.MateriaNegocio;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public class MateriaNegocioImpl implements MateriaNegocio{

    MateriaDatos materiaDatos = new MateriaDatos();
    
    @Override
    public void crearMaterias() {
        materiaDatos.crear();
    }

    @Override
    public List<MateriaDTO> consultar() {
        return materiaDatos.consultar();
    }
    
}
