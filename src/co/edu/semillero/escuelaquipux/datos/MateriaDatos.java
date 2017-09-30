/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.datos;

import co.edu.semillero.escuelaquipux.dtos.EstudianteDTO;
import co.edu.semillero.escuelaquipux.dtos.MateriaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres.ospina
 */
public class MateriaDatos {
    public static ArrayList<MateriaDTO> listaMaterias = new ArrayList<MateriaDTO>();

    public void crear() {
       MateriaDTO materia = new MateriaDTO();
       materia.setNombre("Matematicas");
       materia.setCodigo("MA001");
       listaMaterias.add(materia);
       materia = new MateriaDTO();
       materia.setNombre("Sociales");
       materia.setCodigo("SO001");
       listaMaterias.add(materia);
       materia = new MateriaDTO();
       materia.setNombre("Quimica");
       materia.setCodigo("QI001");
       listaMaterias.add(materia);
    }

    public List<MateriaDTO> consultar() {
        return listaMaterias;
    }
    
}
