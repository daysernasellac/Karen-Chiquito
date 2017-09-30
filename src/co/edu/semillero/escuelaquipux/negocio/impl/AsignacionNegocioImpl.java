/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.negocio.impl;

import co.edu.semillero.escuelaquipux.datos.AsignacionDatos;
import co.edu.semillero.escuelaquipux.dtos.AsignacionDTO;
import co.edu.semillero.escuelaquipux.dtos.EstudianteDTO;
import co.edu.semillero.escuelaquipux.dtos.MateriaDTO;
import co.edu.semillero.escuelaquipux.negocio.AsignacionNegocio;
import co.edu.semillero.escuelaquipux.negocio.EstudianteNegocio;
import co.edu.semillero.escuelaquipux.negocio.MateriaNegocio;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public class AsignacionNegocioImpl implements AsignacionNegocio{

    AsignacionDatos asignacionDatos = new AsignacionDatos();
    EstudianteNegocio estudianteNegocio = new EstudianteNegocioImpl();
    MateriaNegocio materiaNegocio = new MateriaNegocioImpl();
    @Override
    public void asignar() {
        List<EstudianteDTO> listaEstudiantes = estudianteNegocio.consultar();
        List<MateriaDTO> listaMaterias = materiaNegocio.consultar();
        AsignacionDTO asignacionDTO = new AsignacionDTO();
        asignacionDTO.setMateria(listaMaterias.get(0));
        asignacionDTO.setEstudiante(listaEstudiantes);
        asignacionDatos.registrar(asignacionDTO);
        asignacionDTO = new AsignacionDTO();
        asignacionDTO.setMateria(listaMaterias.get(1));
        asignacionDTO.setEstudiante(listaEstudiantes);
        asignacionDatos.registrar(asignacionDTO);
        asignacionDTO = new AsignacionDTO();
        asignacionDTO.setMateria(listaMaterias.get(2));
        asignacionDTO.setEstudiante(listaEstudiantes);
        asignacionDatos.registrar(asignacionDTO);
    }

    @Override
    public List<AsignacionDTO> cosultar() {
        return asignacionDatos.consultar();
    }
    
    
    
}
