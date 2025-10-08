package com.mycompany.empleados;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Grafica extends javax.swing.JPanel {

    private final ArrayList<Administradores> listaAdministradores = new ArrayList<>();

    public Grafica() {
        initComponents();
    }

    private void actualizarTextArea() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== LISTA DE ADMINISTRADORES ===\n\n");
        for (Administradores admin : listaAdministradores) {
            if (admin instanceof AdministradorDeMercadeoYMarketing) {
                sb.append("[Marketing] ");
            } else if (admin instanceof AdministradorRecursosHumanos) {
                sb.append("[RRHH] ");
            } else if (admin instanceof AdministradorDeProyecto) {
                sb.append("[Proyectos] ");
            }
            sb.append(admin.Detalles()).append("\n------------------------\n");
        }
        jTextArea1.setText(sb.toString());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton1.setText("addAdminMarketing");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("addAdminRRHH");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        jButton3.setText("AddAdminProyectos");
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(57, 57, 57)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );
    }

    // BOTÓN 1 - Marketing
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = JOptionPane.showInputDialog(this, "Nombre:");
        if (nombre == null) return;

        double experiencia = pedirDouble("Experiencia (años):");
        if (experiencia < 0) return;

        int salario = pedirInt("Salario (entero):");
        if (salario < 0) return;

        boolean liderazgo = pedirBoolean("¿Tiene liderazgo?");
        boolean adaptabilidad = pedirBoolean("¿Tiene adaptabilidad?");

        String tipo = JOptionPane.showInputDialog(this, "Tipo de estrategia en ventas:");
        if (tipo == null) return;

        AdministradorDeMercadeoYMarketing adminMarketing =
            new AdministradorDeMercadeoYMarketing(tipo, nombre, experiencia, salario, liderazgo, adaptabilidad);

        listaAdministradores.add(adminMarketing);
        actualizarTextArea();
    }

    // BOTÓN 2 - RRHH
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int contratos = pedirInt("Número de contratos (entero):");
        if (contratos < 0) return;

        String nombre = JOptionPane.showInputDialog(this, "Nombre:");
        if (nombre == null) return;

        double experiencia = pedirDouble("Experiencia (años):");
        if (experiencia < 0) return;

        int salario = pedirInt("Salario (entero):");
        if (salario < 0) return;

        boolean liderazgo = pedirBoolean("¿Tiene liderazgo?");
        boolean adaptabilidad = pedirBoolean("¿Tiene adaptabilidad?");

        AdministradorRecursosHumanos adminRRHH =
            new AdministradorRecursosHumanos(contratos, nombre, experiencia, salario, liderazgo, adaptabilidad);

        listaAdministradores.add(adminRRHH);
        actualizarTextArea();
    }

    // BOTÓN 3 - Proyectos
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int proyectos = pedirInt("Proyectos exitosos (entero):");
        if (proyectos < 0) return;

        String nombre = JOptionPane.showInputDialog(this, "Nombre:");
        if (nombre == null) return;

        double experiencia = pedirDouble("Experiencia (años):");
        if (experiencia < 0) return;

        int salario = pedirInt("Salario (entero):");
        if (salario < 0) return;

        boolean liderazgo = pedirBoolean("¿Tiene liderazgo?");
        boolean adaptabilidad = pedirBoolean("¿Tiene adaptabilidad?");

        AdministradorDeProyecto adminProyecto =
            new AdministradorDeProyecto(proyectos, nombre, experiencia, salario, liderazgo, adaptabilidad);

        listaAdministradores.add(adminProyecto);
        actualizarTextArea();
    }

    // MÉTODOS AUXILIARES
    private int pedirInt(String mensaje) {
        String str = JOptionPane.showInputDialog(this, mensaje);
        if (str == null) return -1;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Número inválido");
            return -1;
        }
    }

    private double pedirDouble(String mensaje) {
        String str = JOptionPane.showInputDialog(this, mensaje);
        if (str == null) return -1;
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Número inválido");
            return -1;
        }
    }

    private boolean pedirBoolean(String mensaje) {
        int resp = JOptionPane.showConfirmDialog(this, mensaje, "Confirmar", JOptionPane.YES_NO_OPTION);
        return resp == JOptionPane.YES_OPTION;
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
}
