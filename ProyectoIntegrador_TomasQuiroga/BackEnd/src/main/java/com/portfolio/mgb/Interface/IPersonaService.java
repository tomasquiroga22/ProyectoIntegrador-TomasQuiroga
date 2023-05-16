/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;

/**
 *
 * @author Tasspero
 */
public interface IPersonaService {
    
//Trear persona (o lista de personas)
    public List<Persona> getPersona();
    
// Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
   
    //Eliminar objeto o usuariopor ID
    public void deletePersona(Long id);
    
//Buscar persona por id
    public Persona findPersona(Long id);
}
