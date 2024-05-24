package gui.login;

import javax.swing.JOptionPane;

import logica.verificarCampos.*;
import logica.listas.listaIngenieria;
import logica.entidades.estudiantes.EstIngenieria;

import gui.control.ControlVentanas;

public class RegistroIngenieria extends javax.swing.JFrame {

    listaIngenieria listaEstudiantes = new listaIngenieria();

    public RegistroIngenieria() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etTitulo = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        etSubtitulo = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        etqApellido = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        etqModalidadEstudio = new javax.swing.JLabel();
        etqCantAsignaturas = new javax.swing.JLabel();
        etqSerial = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoSemestreActual = new javax.swing.JTextField();
        campoSerial = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        campoPromAcumulado = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ingenieria");

        etTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etTitulo.setText("ESTUDIANTE DE INGENIERÍA");
        etTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(etTitulo))
        );

        etSubtitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etSubtitulo.setText("REGISTRE SUS DATOS A CONTINUACIÓN");
        etSubtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        etqCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCedula.setText("Cédula");

        etqNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqNombre.setText("Nombre");

        etqApellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqApellido.setText("Apellido");

        etqTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqTelefono.setText("Teléfono");

        etqModalidadEstudio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqModalidadEstudio.setText("Promedio acumulado");

        etqCantAsignaturas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCantAsignaturas.setText("Semestre actual");

        etqSerial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqSerial.setText("Serial");

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqNombre)
                            .addComponent(etqCedula)
                            .addComponent(etqApellido)
                            .addComponent(etqTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContentLayout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(etqSerial))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContentLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(etqCantAsignaturas))
                                    .addComponent(etqModalidadEstudio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoSemestreActual, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(campoSerial)
                                    .addComponent(campoPromAcumulado, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(84, 84, 84))))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etSubtitulo)
                .addGap(56, 56, 56)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula)
                    .addComponent(etqModalidadEstudio)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPromAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(etqCantAsignaturas)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoSemestreActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellido)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqSerial)
                    .addComponent(campoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("VOLVER");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setText("ACEPTAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addGap(203, 203, 203))
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControlVentanas.cargarLoginIngenieria();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!camposValidos()) {
            return;
        }

        long cedula = Long.parseLong(campoCedula.getText());
        long serial = Long.parseLong(campoSerial.getText());
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String telefono = campoTelefono.getText();
        short semestreActual = Short.parseShort(campoSemestreActual.getText());
        float promAcumulado = Float.parseFloat(campoPromAcumulado.getText());

        if (listaEstudiantes.existeEstudiante(cedula, serial)) {
            JOptionPane.showMessageDialog(null, "Ya existe un usuario con la cedula o serial introducido.\nVerifique su información o contáctese con el soporte de la institución.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        listaEstudiantes.anadirEstudiante(new EstIngenieria(semestreActual, promAcumulado, cedula, serial, nombre.toUpperCase(), apellido.toUpperCase(), telefono));

        JOptionPane.showMessageDialog(null, "Se ha registrado con éxito.\nPuede iniciar sesión ahora.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

        ControlVentanas.cargarLoginIngenieria();
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPromAcumulado;
    private javax.swing.JTextField campoSemestreActual;
    private javax.swing.JTextField campoSerial;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etSubtitulo;
    private javax.swing.JLabel etTitulo;
    private javax.swing.JLabel etqApellido;
    private javax.swing.JLabel etqCantAsignaturas;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqModalidadEstudio;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqSerial;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCamposNumericos() {

        integridadDatos inspector = new integridadDatos();

        String cedula = campoCedula.getText();
        String serial = campoSerial.getText();
        String semestreActual = campoSemestreActual.getText();
        String promAcumulado = campoPromAcumulado.getText();
        String telefono = campoTelefono.getText();

        if (!inspector.verificarEntero(cedula)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo Cédula o es un valor inválido.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarEntero(serial)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo de Serial o es un valor inválido.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarEntero(semestreActual)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo del Semestre actual.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (Integer.parseInt(semestreActual) > 12) {
            JOptionPane.showMessageDialog(null, "Se ingresó una cantidad inválida en el semestre actual.\nVerifique e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarFlotante(promAcumulado)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo del promedio acumulado.\nCorríjalo e intente nuevamente (use un punto como separador decimal).", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        } else if (Float.parseFloat(promAcumulado) > 5 || Float.parseFloat(promAcumulado) < 0) {
            JOptionPane.showMessageDialog(null, "Se ingresó una cantidad inválida en el promedio acumulado.\nVerifique e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarEntero(telefono)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo teléfono o es no válido.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    private boolean verificarCamposTexto() {

        integridadDatos inspector = new integridadDatos();

        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();

        if (!inspector.verificarSoloLetras(nombre)) {
            JOptionPane.showMessageDialog(null, "Hay números en el campo de nombre.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarSoloLetras(apellido)) {
            JOptionPane.showMessageDialog(null, "Hay números en el campo apellido.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    private boolean verificarSinVacios() {

        camposVacios ojoQueTodoLoVe = new camposVacios();

        String cedula = campoCedula.getText();
        String serial = campoSerial.getText();
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String telefono = campoTelefono.getText();
        String semestreActual = campoSemestreActual.getText();
        String promAcumulado = campoPromAcumulado.getText();

        String campos[] = {cedula, serial, nombre, apellido, telefono, semestreActual, promAcumulado};

        if (!ojoQueTodoLoVe.sinVacios(campos)) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos en algún campo.\nAsegúrese de llenar todos los campos.");
            return false;
        }

        return true;

    }

    private boolean camposValidos() {

        return verificarSinVacios() && verificarCamposTexto() && verificarCamposNumericos();

    }

}
