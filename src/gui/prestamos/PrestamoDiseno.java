package gui.prestamos;

import gui.control.ControlVentanas;
import javax.swing.JOptionPane;

import logica.entidades.equipos.TabletaGrafica;

import gui.modelado.ModeloTabla;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import logica.entidades.prestamo.PrestamosDiseno;

import logica.verificarCampos.*;

import logica.listas.listaPrestamosDiseno;
import logica.listas.listaTablets;
import logica.listas.listaDiseno;

public class PrestamoDiseno extends javax.swing.JFrame {

    ModeloTabla mt = new ModeloTabla();

    listaDiseno usuarios = new listaDiseno();

    listaTablets tablets = new listaTablets();
    listaPrestamosDiseno prestamos = new listaPrestamosDiseno();

    private final long cedula;

    public PrestamoDiseno(long cedula) {
        this.cedula = cedula;
        initComponents();
        eventoSalida();
        this.setLocationRelativeTo(null);
        inicializarTabla();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imagenAlmacenamiento = new javax.swing.JLabel();
        cboxAlmacenamiento = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestados = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnDevolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        etTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etTitulo.setText("TABLETAS PARA DISEÑO GRÁFICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(etTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Almacenamiento");

        imagenAlmacenamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamos/espacio.png"))); // NOI18N

        cboxAlmacenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "256 GB", "512 GB", "1 TB" }));
        cboxAlmacenamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxAlmacenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboxAlmacenamientoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cboxAlmacenamiento, 0, 134, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(imagenAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(cboxAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Peso (kg)");

        campoPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("kg");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(81, 81, 81))
        );

        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seleccione las especificaciones que desea en su tablet");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tablaPrestados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPrestados);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRÉSTAMOS REALIZADOS");

        btnDevolucion.setText("Devolver equipo");
        btnDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(btnDevolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if (!camposValidos()) {
            return;
        }

        String espacio = cboxAlmacenamiento.getSelectedItem().toString();
        float peso = Float.parseFloat(campoPeso.getText());

        TabletaGrafica aPrestar = null;

        for (TabletaGrafica pc : tablets.copiarLista()) {
            if (!prestamos.tabletaYaPrestada(pc)) {
                aPrestar = pc;
                break;
            }
        }

        if (aPrestar == null) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, en este momento no hay inventario de tabletas gráficas disponibles para prestar.", "Sin stock", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        aPrestar.setAlmacenamiento(espacio);
        aPrestar.setPeso(peso);

        if (prestamos.estudiantePrestando(cedula)) {
            prestamos.obtenerPrestamoPorEstudiante(cedula).anadirTablet(aPrestar);
        } else {
            prestamos.anadirPrestamo(new PrestamosDiseno(usuarios.obtenerEstudiante(cedula)));
            prestamos.obtenerPrestamoPorEstudiante(cedula).anadirTablet(aPrestar);
        }

        JOptionPane.showMessageDialog(null, "Se ha registrado el préstamo con éxito.\nProvea su cédula y serial en tesorería para reclamar el equipo.", "Préstamo exitoso", JOptionPane.INFORMATION_MESSAGE);

        Object[] datospc = {aPrestar.getSerial(), aPrestar.getMarca(), aPrestar.getTamano(), aPrestar.getAlmacenamiento(), aPrestar.getPeso()};

        anadirTablet(datospc);

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed

        int tabletSeleccionada = tablaPrestados.getSelectedRow();

        if (tabletSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Señor usuario, seleccione un portatil en la tabla para devolver.", "Devolución", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        long serial = (Long) tablaPrestados.getValueAt(tabletSeleccionada, 0);

        prestamos.obtenerPrestamoPorEstudiante(cedula).devolverTablet(serial);

        mt = (ModeloTabla) tablaPrestados.getModel();
        mt.removeRow(tabletSeleccionada);
        tablaPrestados.setModel(mt);

        JOptionPane.showMessageDialog(null, "Se ha registrado la devolución.\n Regrese a tesorería el equipo prestado.", "Devolución", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnDevolucionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        confirmarVolver();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboxAlmacenamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxAlmacenamientoMouseEntered

        checarImagenEspacio();

    }//GEN-LAST:event_cboxAlmacenamientoMouseEntered

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        
        checarImagenEspacio();
        
    }//GEN-LAST:event_jPanel4MouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JComboBox<String> cboxAlmacenamiento;
    private javax.swing.JLabel etTitulo;
    private javax.swing.JLabel imagenAlmacenamiento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaPrestados;
    // End of variables declaration//GEN-END:variables

    private boolean sinVacios() {

        int espacio = cboxAlmacenamiento.getSelectedIndex();
        String peso = campoPeso.getText();

        camposVacios hola = new camposVacios();

        if (espacio == 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un espacio de almacenamiento.\nSeleccione el espacio que necesite en su tableta.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (hola.sinVacios(peso)) {
            JOptionPane.showMessageDialog(null, "El campo de peso está vacio.\nDigite el peso de la tableta que desea.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        return true;

    }

    private boolean integridadCampos() {

        integridadDatos parcero = new integridadDatos();

        String peso = campoPeso.getText();

        if (!parcero.verificarFlotante(peso)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo de peso.\nRevise que no hayan caracteres especiales y use punto como separador decimal.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (Float.parseFloat(peso) > 10 || Float.parseFloat(peso) < 0) {
            JOptionPane.showMessageDialog(null, "El peso introducido no es válido.\nSeleccione un peso válido.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    private boolean camposValidos() {
        return sinVacios() && integridadCampos();
    }

    private void inicializarTabla() {

        String[] columnas = {"Serial", "Marca", "Tamaño", "Almacenamiento", "Peso"};

        mt.setColumnIdentifiers(columnas);

        tablaPrestados.setModel(mt);

    }

    private void mostrarTabla() {

        for (PrestamosDiseno p : prestamos.copiarLista()) {
            if (p.getSolicitante().getCedula() == cedula) {
                for (TabletaGrafica tablet : p.obtenerEquiposPrestados()) {
                    long serial = tablet.getSerial();
                    String marca = tablet.getMarca();
                    double tamano = tablet.getTamano();
                    String almacenamiento = tablet.getAlmacenamiento();
                    float peso = tablet.getPeso();

                    Object[] datos = {serial, marca, tamano, almacenamiento, peso};

                    mt.addRow(datos);

                }
            }
        }

    }

    private void anadirTablet(Object[] datos) {
        mt = (ModeloTabla) tablaPrestados.getModel();
        mt.addRow(datos);
        tablaPrestados.setModel(mt);
    }

    private void eventoSalida() {

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evento) {
                confirmarVolver();
            }

        });

    }

    private void confirmarVolver() {

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir de su sesión de préstamos?\nCualquier cambio no guardado se perderá.", "Salida", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            ControlVentanas.cargarPrincipal();
            this.dispose();
        }

    }

    private void checarImagenEspacio() {

        int espacioElegido = cboxAlmacenamiento.getSelectedIndex();

        Icon porDefecto = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/prestamos/espacio.png")).getImage());
        Icon opcionDosCincoSeisGB = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/prestamos/256gb.png")).getImage());
        Icon opcionCincoDoceGB = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/prestamos/512gb.png")).getImage());
        Icon opcionUnaTera = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/prestamos/1tb.png")).getImage());

        switch (espacioElegido) {

            case 0:
                imagenAlmacenamiento.setIcon(porDefecto);
                break;

            case 1:
                imagenAlmacenamiento.setIcon(opcionDosCincoSeisGB);
                break;

            case 2:
                imagenAlmacenamiento.setIcon(opcionCincoDoceGB);
                break;

            case 3:
                imagenAlmacenamiento.setIcon(opcionUnaTera);
                break;

            default:
                break;

        }

    }

}
