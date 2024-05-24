package gui.control;

import logica.Importes;
import logica.Exportes;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
    private static boolean inicio = true;
 
    public Principal() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(inicio){
            new Importes().ImportarTodo();
            inicio = false;
        }
        
        eventoSalida();
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etTitulo = new javax.swing.JLabel();
        etTitulo2 = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        etYoSoy = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInge = new javax.swing.JButton();
        btnDiseno = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        btnAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio");

        etTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etTitulo.setText("UNIVERSIDAD SAN JUAN DE DIOS");

        etTitulo2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etTitulo2.setText("PRÉSTAMO DE EQUIPOS");

        etYoSoy.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etYoSoy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etYoSoy.setText("YO SOY");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInge.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login/inge.png"))); // NOI18N
        btnInge.setText("  INGENIERÍA");
        btnInge.setToolTipText("");
        btnInge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInge.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInge.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngeActionPerformed(evt);
            }
        });

        btnDiseno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDiseno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login/dis.png"))); // NOI18N
        btnDiseno.setText("DISEÑO");
        btnDiseno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiseno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiseno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisenoActionPerformed(evt);
            }
        });

        btnAdministrador.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(etYoSoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(separador))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnInge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnDiseno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdministrador)
                .addGap(159, 159, 159))
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etYoSoy)
                .addGap(18, 18, 18)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDiseno, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnInge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(btnAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnDisenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisenoActionPerformed
        ControlVentanas.cargarLoginDiseno();
        this.dispose();
    }//GEN-LAST:event_btnDisenoActionPerformed

    private void btnIngeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngeActionPerformed
        ControlVentanas.cargarLoginIngenieria();
        this.dispose();
    }//GEN-LAST:event_btnIngeActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        ControlVentanas.cargarLoginAdmin();
        this.dispose();
    }//GEN-LAST:event_btnAdministradorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnDiseno;
    private javax.swing.JButton btnInge;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etTitulo;
    private javax.swing.JLabel etTitulo2;
    private javax.swing.JLabel etYoSoy;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

    private void confirmarSalida(){
        
        int opcionEscogida = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "Confirmar salida", JOptionPane.OK_CANCEL_OPTION);
        
        if(opcionEscogida == JOptionPane.OK_OPTION){
            new Exportes().ExportarTodo();
            System.exit(0);
        }
        
    }
    
    private void eventoSalida(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evento){
                confirmarSalida();
            }
        });
    }
    
}
