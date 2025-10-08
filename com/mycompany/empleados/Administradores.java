package com.mycompany.empleados;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maikol Andres
 */
public class Administradores {
    
      

       
    String nombre;
    double experinecia;
    int salario;
    private boolean liderazgo;
    private boolean adaptabilidad;

    /**
     *
     * @param nombre
     * @param experinecia
     * @param salario
     * @param liderazgo
     * @param adaptabilidad
     */
    public Administradores(String nombre, double experinecia, int salario, boolean liderazgo, boolean adaptabilidad) {
        this.nombre = nombre;
        this.experinecia = experinecia;
        this.salario = salario;
        this.liderazgo = liderazgo;
        this.adaptabilidad = adaptabilidad;
    }

   
    

   public String Detalles() {
    return "Nombre: " + nombre +
           "\nExperiencia: " + experinecia +  
           "\nSalario: " + salario +
           "\nLiderazgo: " + liderazgo  +
           "\nAdaptabilidad: " + adaptabilidad  ;
}


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the experinecia
     */
    public double getExperinecia() {
        return experinecia;
    }

    /**
     * @param experinecia the experinecia to set
     */
    public void setExperinecia(double experinecia) {
        this.experinecia = experinecia;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the liderazgo
     */
    public boolean isLiderazgo() {
        return liderazgo;
    }

    /**
     * @param liderazgo the liderazgo to set
     */
    public void setLiderazgo(boolean liderazgo) {
        this.liderazgo = liderazgo;
    }

    /**
     * @return the adaptabilidad
     */
    public boolean isAdaptabilidad() {
        return adaptabilidad;
    }

    /**
     * @param adaptabilidad the adaptabilidad to set
     */
    public void setAdaptabilidad(boolean adaptabilidad) {
        this.adaptabilidad = adaptabilidad;
    }
}
