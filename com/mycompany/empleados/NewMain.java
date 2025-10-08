package com.mycompany.empleados;

import java.util.ArrayList;

/**
 *
 * @author Maikol
 */
public class NewMain {

    public static void main(String[] args) {

        ArrayList<Administradores> listaAdministradores = new ArrayList<>();

        Administradores adminGeneral = new Administradores("Laura", 10, 5000000, true, true);

        
        AdministradorDeMercadeoYMarketing adminMarketing = new AdministradorDeMercadeoYMarketing("Marketing digital", "Andrés", 5, 4000000, true, true);

        AdministradorRecursosHumanos adminRRHH =new AdministradorRecursosHumanos(25, "Camila", 8, 4200000, true, true);

        AdministradorDeProyecto adminProyecto = new AdministradorDeProyecto(12, "Julián", 6, 3800000, true, false);

        // Agregar todos los administradores a la lista
        listaAdministradores.add(adminGeneral);
        listaAdministradores.add(adminMarketing);
        listaAdministradores.add(adminRRHH);
        listaAdministradores.add(adminProyecto);

        System.out.println(" LISTA DE ADMINISTRADORES ");
        for (Administradores admin : listaAdministradores) {
            System.out.println(admin.Detalles());
            System.out.println("--------------------------------");
        }
    }
}
