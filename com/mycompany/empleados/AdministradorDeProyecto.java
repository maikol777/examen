package com.mycompany.empleados;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author Maikol Andres
 */
public class AdministradorDeProyecto extends Administradores {
    
    private int proyectos_exitosos;

    /**
     *
     * @param proyectos_exitosos
     * @param nombre
     * @param experinecia
     * @param salario
     * @param liderazgo
     * @param adaptabilidad
     */
    public AdministradorDeProyecto(int proyectos_exitosos, String nombre, double experinecia, int salario, boolean liderazgo, boolean adaptabilidad) {
        super(nombre, experinecia, salario, liderazgo, adaptabilidad);
        this.proyectos_exitosos = proyectos_exitosos;
    }

    @Override
   public String Detalles() {
    // Llamamos al método Detalles() de la clase padre y agregamos la información nueva
    return super.Detalles() +
           "\nproyectos envolucrados con exito: " + proyectos_exitosos;
}

    

    /**
     * @return the proyectos_exitosos
     */
    public int getProyectos_exitosos() {
        return proyectos_exitosos;
    }

    /**
     * @param proyectos_exitosos the proyectos_exitosos to set
     */
    public void setProyectos_exitosos(int proyectos_exitosos) {
        this.proyectos_exitosos = proyectos_exitosos;
    }
    
    

   
   
    
}
