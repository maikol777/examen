package com.mycompany.empleados;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author Maikol Andres
 */
public class AdministradorRecursosHumanos extends Administradores {
    private int contratos;

    /**
     * 
     * @param contratos
     * @param nombre
     * @param experinecia
     * @param salario
     * @param liderazgo
     * @param adaptabilidad
     */
    
  
    public AdministradorRecursosHumanos(int contratos, String nombre, double experinecia, int salario, boolean liderazgo, boolean adaptabilidad) {
        super(nombre, experinecia, salario, liderazgo, adaptabilidad);
        this.contratos = contratos;
    }



    @Override
   public String Detalles() {
    // Llamamos al método Detalles() de la clase padre y agregamos la información nueva
    return super.Detalles() +
           "\nnumero de contratos " + contratos;
}

    
    public int getContratos() {
        return contratos;
    }

    /**
     * @param contratos the contratos to set
     */
    public void setContratos(int contratos) {
        this.contratos = contratos;
    }
    
}
