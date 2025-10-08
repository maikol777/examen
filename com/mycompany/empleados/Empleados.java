/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleados;

/**
 *
 * @author Maikol Andres
 */
public class Empleados {

   private String nombre;
   private double salario;
  private int horaLaboral;

    public Empleados(String nombre, double salario, int horaLaboral) {
        this.nombre = nombre;
        this.salario = salario;
        this.horaLaboral = horaLaboral;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
   

    public void setHoraLaboral(int horaLaboral) {
        this.horaLaboral = horaLaboral;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoraLaboral() {
        return horaLaboral;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
  
    
}
