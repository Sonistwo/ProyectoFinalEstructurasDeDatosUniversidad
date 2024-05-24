package gui.admin;

import gui.control.ControlVentanas;
import gui.modelado.ModeloTabla;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import logica.listas.listaComputadores;
import logica.listas.listaTablets;

import logica.entidades.equipos.Computador;
import logica.entidades.equipos.TabletaGrafica;

import logica.listas.listaPrestamosDiseno;
import logica.listas.listaPrestamosIngenieria;

import logica.verificarCampos.camposVacios;
import logica.verificarCampos.integridadDatos;

public class RegistrarEquipo extends javax.swing.JFrame {

    listaTablets tablets = new listaTablets();
    listaComputadores portatiles = new listaComputadores();

    listaTablets listaTablets = tablets;
    listaComputadores listaPC = portatiles;

    listaPrestamosDiseno prestamosDis = new listaPrestamosDiseno();
    listaPrestamosIngenieria prestamosInge = new listaPrestamosIngenieria();
    
    ModeloTabla mtTablets = new ModeloTabla();
    ModeloTabla mtPC = new ModeloTabla();

    public RegistrarEquipo() {
        initComponents();
        this.setLocationRelativeTo(null);
        eventoSalida();
        inicializarTablas();
        mostrarEnTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        campoSerial = new javax.swing.JTextField();
        etSerial1 = new javax.swing.JLabel();
        campoTamano = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        imagenTipo = new javax.swing.JLabel();
        cboxTipo = new javax.swing.JComboBox<>();
        etSerial2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTablets = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantTablets = new javax.swing.JLabel();
        cantPC = new javax.swing.JLabel();
        cantTotal = new javax.swing.JLabel();
        btnEliminarTablet = new javax.swing.JButton();
        btnEliminarPortatil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR EQUIPO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Señor administrador, registre los datos del equipo a continuación");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Tamaño");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("pulgadas");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("$ COP");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Precio");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Marca");

        etSerial1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etSerial1.setText("Serial");

        jLabel3.setText("Sin caracteres especiales");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(etSerial1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etSerial1)
                            .addComponent(campoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(campoTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setText("GUARDAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER ATRÁS");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        imagenTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/admin/equipo.png"))); // NOI18N
        imagenTipo.setToolTipText("");

        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Portátil", "Tableta gráfica" }));
        cboxTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxTipoMouseClicked(evt);
            }
        });

        etSerial2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etSerial2.setText("Tipo de equipo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etSerial2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagenTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etSerial2))
                        .addGap(64, 64, 64)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tablaTablets.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaTablets);

        tablaPC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaPC);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PORTÁTILES");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TABLETAS GRÁFICAS");

        cantTablets.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cantTablets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantTablets.setText("Hay " + tablets.copiarLista().size() + " tabletas");

        cantPC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cantPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantPC.setText("Hay " + portatiles.copiarLista().size() + " portátiles");

        cantTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cantTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantTotal.setText("Hay " + (tablets.copiarLista().size() + portatiles.copiarLista().size()) + " equipos registrados");

        btnEliminarTablet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminarTablet.setText("ELIMINAR");
        btnEliminarTablet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTabletActionPerformed(evt);
            }
        });

        btnEliminarPortatil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminarPortatil.setText("ELIMINAR");
        btnEliminarPortatil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPortatil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPortatilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminarTablet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarPortatil)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(cantTablets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantPC)
                    .addComponent(cantTablets))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantTotal)
                        .addComponent(btnEliminarTablet))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnEliminarPortatil)
                        .addContainerGap())))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INVENTARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        confirmarSalida();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if (!camposValidos()) {
            return;
        }

        long serial = Long.parseLong(campoSerial.getText());
        String tipoEquipo = cboxTipo.getSelectedItem().toString();
        String marca = campoMarca.getText().toUpperCase();
        float tamano = Float.parseFloat(campoTamano.getText());
        float precio = Float.parseFloat(campoPrecio.getText());

        switch (tipoEquipo) {

            case "Portátil":

                if (listaPC.existePC(serial)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un portátil con este serial, corrija la información por favor.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                listaPC.anadirPC(new Computador("", "", serial, marca, tamano, precio));
                JOptionPane.showMessageDialog(null, "Se ha registrado el nuevo portátil con éxito.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                btnLimpiarActionPerformed(null);
                Object dataPC[] = {serial, marca, tamano, precio};

                anadirPC(dataPC);

                break;

            case "Tableta gráfica":

                if (listaTablets.existeTablet(serial)) {
                    JOptionPane.showMessageDialog(null, "Ya existe una tableta gráfica con este serial, corrija la información por favor.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                listaTablets.anadirTablet(new TabletaGrafica("", 0, serial, marca, tamano, precio));
                JOptionPane.showMessageDialog(null, "Se ha registrado la nueva tablet con éxito.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                btnLimpiarActionPerformed(null);
                Object[] dataTablet = {serial, marca, tamano, precio};

                anadirTablet(dataTablet);

                break;

            default:
                break;

        }
        
        actualizarCantidades();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        campoSerial.setText("");
        cboxTipo.setSelectedIndex(0);
        campoMarca.setText("");
        campoTamano.setText("");
        campoPrecio.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarTabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTabletActionPerformed

        int tabletSeleccionada = tablaTablets.getSelectedRow();
        
        if(tabletSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "Señor administrador, seleccione una tableta gráfica de la tabla para eliminar.", "Devolución", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        long serial = (Long) tablaTablets.getValueAt(tabletSeleccionada, 0);
        
        if(prestamosDis.tabletaYaPrestada(listaTablets.obtenerTablet(serial))){
            JOptionPane.showMessageDialog(null, "Esta tableta se encuentra en un préstamo actualmente.\nSolicite al usuario una devolución antes de eliminar este registro.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        listaTablets.eliminarTablet(listaTablets.obtenerTablet(serial));
        
        mtTablets = (ModeloTabla) tablaTablets.getModel();
        mtTablets.removeRow(tabletSeleccionada);
        tablaTablets.setModel(mtTablets);
        
        actualizarCantidades();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro de la tablet.", "Eliminación", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnEliminarTabletActionPerformed

    private void btnEliminarPortatilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPortatilActionPerformed
        
        int tabletSeleccionada = tablaPC.getSelectedRow();
        
        if(tabletSeleccionada == -1){
            JOptionPane.showMessageDialog(null, "Señor administrador, seleccione un portátil de la tabla para eliminar.", "Devolución", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        long serial = (Long) tablaPC.getValueAt(tabletSeleccionada, 0);
        
        if(prestamosInge.computadorYaPrestado(listaPC.obtenerPC(serial))){
            JOptionPane.showMessageDialog(null, "Este portátil se encuentra en un préstamo actualmente.\nSolicite al usuario una devolución antes de eliminar este registro.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        listaPC.eliminarPC(listaPC.obtenerPC(serial));
        
        mtPC = (ModeloTabla) tablaPC.getModel();
        mtPC.removeRow(tabletSeleccionada);
        tablaPC.setModel(mtPC);
        
        actualizarCantidades();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro del portátil.", "Eliminación", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnEliminarPortatilActionPerformed

    private void cboxTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxTipoMouseClicked
        
        checarImagenTipo();
        
    }//GEN-LAST:event_cboxTipoMouseClicked

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
       
        checarImagenTipo();
        
    }//GEN-LAST:event_jPanel3MouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminarPortatil;
    private javax.swing.JButton btnEliminarTablet;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoSerial;
    private javax.swing.JTextField campoTamano;
    private javax.swing.JLabel cantPC;
    private javax.swing.JLabel cantTablets;
    private javax.swing.JLabel cantTotal;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JLabel etSerial1;
    private javax.swing.JLabel etSerial2;
    private javax.swing.JLabel imagenTipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablaPC;
    private javax.swing.JTable tablaTablets;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCamposNumericos() {

        integridadDatos inspector = new integridadDatos();

        String serial = campoSerial.getText();
        String precio = campoPrecio.getText();
        String tamano = campoTamano.getText();

        if (!inspector.verificarEntero(serial)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo de Serial o es un valor inválido.\nCorríjalo e intente nuevamente.", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarFlotante(precio)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo precio o es no válido.\nCorríjalo e intente nuevamente (use un punto como separador decimal).", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!inspector.verificarFlotante(tamano)) {
            JOptionPane.showMessageDialog(null, "Hay caracteres inválidos en el campo tamaño o es no válido.\nCorríjalo e intente nuevamente (use un punto como separador decimal).", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    private boolean verificarSinVacios() {

        camposVacios ojoQueTodoLoVe = new camposVacios();

        String serial = campoSerial.getText();
        String precio = campoPrecio.getText();
        String tamano = campoTamano.getText();
        String marca = campoMarca.getText();

        String campos[] = {serial, precio, tamano, marca};

        if (!ojoQueTodoLoVe.sinVacios(campos)) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos en algún campo.\nAsegúrese de llenar todos los campos.");
            return false;
        }

        if (cboxTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un tipo de equipo.\nCorrijalo, por favor.");
            return false;
        }

        return true;

    }

    private boolean camposValidos() {

        return verificarSinVacios() && verificarCamposNumericos();

    }

    private void eventoSalida() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evento) {
                confirmarSalida();
            }
        });
    }

    private void confirmarSalida() {

        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea volver?\n Se perderá la información no guardada.", "Salida", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {

            ControlVentanas.cargarAdmin();
            this.dispose();

        }

    }

    private void inicializarTablas() {

        String[] datos = {"Serial", "Marca", "Tamaño (pulgadas)", "Precio"};

        mtTablets.setColumnIdentifiers(datos);
        tablaTablets.setModel(mtTablets);

        mtPC.setColumnIdentifiers(datos);
        tablaPC.setModel(mtPC);

    }

    private void mostrarEnTabla() {

        for (TabletaGrafica G : tablets.copiarLista()) {
            long serial = G.getSerial();
            String marca = G.getMarca();
            double tamano = G.getTamano();
            float precio = G.getPrecio();

            Object[] data = {serial, marca, tamano, precio};

            anadirTablet(data);

        }

        for (Computador PC : portatiles.copiarLista()) {
            long serial = PC.getSerial();
            String marca = PC.getMarca();
            double tamano = PC.getTamano();
            float precio = PC.getPrecio();

            Object[] data = {serial, marca, tamano, precio};

            anadirPC(data);
        }
    }

    private void anadirTablet(Object[] data) {
        mtTablets = (ModeloTabla) tablaTablets.getModel();
        mtTablets.addRow(data);
        tablaTablets.setModel(mtTablets);
    }

    private void anadirPC(Object[] data) {
        mtPC = (ModeloTabla) tablaPC.getModel();
        mtPC.addRow(data);
        tablaPC.setModel(mtPC);
    }
    
    private void checarImagenTipo() {

        int espacioElegido = cboxTipo.getSelectedIndex();

        Icon porDefecto = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/admin/equipo.png")).getImage());
        Icon opcionPC = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/admin/portatil.png")).getImage());
        Icon opcionTablet = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/admin/tablet.png")).getImage());

        switch (espacioElegido) {

            case 0:
                imagenTipo.setIcon(porDefecto);
                break;

            case 1:
                imagenTipo.setIcon(opcionPC);
                break;

            case 2:
                imagenTipo.setIcon(opcionTablet);
                break;

            default:
                break;

        }

    }
    
    private void actualizarCantidades(){
        
        cantPC.setText("Hay " + portatiles.copiarLista().size() + " portátiles");
        cantTablets.setText("Hay " + tablets.copiarLista().size() + " tabletas");
        cantTotal.setText("Hay " + (tablets.copiarLista().size() + portatiles.copiarLista().size()) + " equipos registrados");
        
    }
    
}
