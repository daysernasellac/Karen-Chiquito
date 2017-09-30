/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.escuelaquipux.dtos;

import java.util.List;

/**
 *
 * @author andres.ospina
 */
public class AsignacionDTO {
    
    private MateriaDTO materia;
    private List<EstudianteDTO> estudiante;
    //horario
    //profesor
    //salon ...

    /**
     * @return the materia
     */
    public MateriaDTO getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(MateriaDTO materia) {
        this.materia = materia;
    }

    /**
     * @return the estudiante
     */
    public List<EstudianteDTO> getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(List<EstudianteDTO> estudiante) {
        this.estudiante = estudiante;
    }
    
}
