package com.mycompany.empleados;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maikol Andres
 */
public class AdministradorDeMercadeoYMarketing extends Administradores{
 
    private String tipo_de_estrategia_en_ventas;

    /**
     * @param tipo_de_estrategia_en_ventas
     * @param nombre
     * @param experinecia
     * @param salario
     * @param liderazgo
     * @param adaptabilidad
     */
    
  


    public AdministradorDeMercadeoYMarketing(String tipo_de_estrategia_en_ventas, String nombre, double experinecia, int salario, boolean liderazgo, boolean adaptabilidad) {
        super(nombre, experinecia, salario, liderazgo, adaptabilidad);
        this.tipo_de_estrategia_en_ventas = tipo_de_estrategia_en_ventas;
    }

    
public String Detalles() {
    // Llamamos al método Detalles() de la clase padre y agregamos la información nueva
    return super.Detalles() +
           "\nTipo de estrategia en ventas: " + tipo_de_estrategia_en_ventas;
}

    public String getTipo_de_estrategia_en_ventas() {
        return tipo_de_estrategia_en_ventas;
    }

    /**
     * @param tipo_de_estrategia_en_ventas the tipo_de_estrategia_en_ventas to set
     */
    public void setTipo_de_estrategia_en_ventas(String tipo_de_estrategia_en_ventas) {
        this.tipo_de_estrategia_en_ventas = tipo_de_estrategia_en_ventas;
    }
    
}
