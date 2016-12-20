/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controller.Controller;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import modelo.Categoria;
import modelo.Conexion;
import modelo.Producte;
import modelo.Stock;


/**
 *
 * @author DANIEL Y ROGER
 */
public class VistaProducto extends javax.swing.JInternalFrame {
 Controller producte = new Controller();
    /**
     * Creates new form VistaProducto
     */
    public VistaProducto() {
        
        
        initComponents();
        
        this.jTable1.setModel(producte.mostrarProducto()); 
        Controller.ocultarColumna(7, jTable1);
        Controller.ocultarColumna(8, jTable1);
        Controller.ocultarColumna(9, jTable1);
        
        producte.llenarCombo(JComboBox);
        
        this.jbGuardar.setEnabled(false);
        this.jbEliminar.setEnabled(false);
        this.Modificar.setEnabled(false);
        
        this.jtStock_id.setVisible(false);
        this.jtProd_id.setVisible(false);
        this.JComboBox.setVisible(false);
        this.jtCategoria_id.setVisible(false);
        this.jtCategoria_id1.setVisible(false);
        
        this.jtStock.setEditable(false);
        this.jtNombre.setEditable(false);
        this.jtPrecio.setEditable(false);
        this.jtStock.setEditable(false);
        this.jtStockMax.setEditable(false);
        this.jtStockMin.setEditable(false);
        this.jtCategoria.setEditable(false);
        this.jtFoto.setEditable(false);
        
 
    }

      private TableRowSorter trsFiltro;

  public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "NOMBRE") {
            columnaABuscar = 0;
        }
        if (comboFiltro.getSelectedItem().toString() == "CATEGORIA") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "DNI") {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(jTbuscar.getText(), columnaABuscar));
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtFoto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtStockMin = new javax.swing.JTextField();
        jtStockMax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JComboBox = new javax.swing.JComboBox<>();
        jtCategoria_id = new javax.swing.JTextField();
        jtStock_id = new javax.swing.JTextField();
        jtProd_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtCategoria = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        jtCategoria_id1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Producto");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel4.setText("Foto:");

        jtFoto.setEditable(false);
        jtFoto.setText("Referencia foto");
        jtFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFotoActionPerformed(evt);
            }
        });

        jLabel2.setText("Stock:");

        jtStock.setText("Estock actual");

        jLabel1.setText("Nombre:");

        jtNombre.setText("Nombre del producto");
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio:");

        jtPrecio.setText("Precio del producto");

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setForeground(new java.awt.Color(0, 153, 153));
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setForeground(new java.awt.Color(255, 0, 51));
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jbNuevo.setForeground(new java.awt.Color(0, 153, 153));
        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jLabel5.setText("Stock MIn:");

        jtStockMin.setText("Estock Mínimo");

        jtStockMax.setText("Estock Máximo");

        jLabel6.setText("Stock Max:");

        JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxItemStateChanged(evt);
            }
        });
        JComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxActionPerformed(evt);
            }
        });

        jtCategoria_id.setEditable(false);
        jtCategoria_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCategoria_idActionPerformed(evt);
            }
        });

        jtStock_id.setEditable(false);

        jtProd_id.setEditable(false);

        jLabel9.setText("Categoria:");

        jtCategoria.setText("Categoría producto");

        Modificar.setBackground(new java.awt.Color(255, 255, 255));
        Modificar.setForeground(new java.awt.Color(0, 153, 153));
        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jtCategoria_id1.setEditable(false);
        jtCategoria_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCategoria_id1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtCategoria)
                            .addComponent(jtFoto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtPrecio)
                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtStock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtProd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtStockMax, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtCategoria_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCategoria_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtFoto)
                        .addComponent(jLabel6)
                        .addComponent(jtStockMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtStock_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtProd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCategoria_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCategoria_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(Modificar)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        //System.out.println("Hola");

        //Modificamos el boton guardar para que pase a modificar
        this.jtCategoria.setEditable(false);
        this.JComboBox.setVisible(false);
        //Marcar la fila selecionado al presionar click
        int fila = jTable1.rowAtPoint(evt.getPoint());
        //Pasa el parametro
        jtNombre.setText(String.valueOf(jTable1.getValueAt(fila, 0)));
        jtPrecio.setText(String.valueOf(jTable1.getValueAt(fila, 1)));
        jtStock.setText(String.valueOf(jTable1.getValueAt(fila, 2)));
        jtStockMax.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
        jtStockMin.setText(String.valueOf(jTable1.getValueAt(fila, 4)));
        jtCategoria.setText(String.valueOf(jTable1.getValueAt(fila, 5)));
        jtFoto.setText(String.valueOf(jTable1.getValueAt(fila, 6)));
        jtProd_id.setText(String.valueOf(jTable1.getValueAt(fila, 7)));
        jtStock_id.setText(String.valueOf(jTable1.getValueAt(fila, 8)));
        jtCategoria_id.setText(String.valueOf(jTable1.getValueAt(fila, 9)));
        jtCategoria_id1.setText(String.valueOf(jTable1.getValueAt(fila, 9)));

        this.jbGuardar.setEnabled(false);
        this.jbEliminar.setEnabled(true);
        this.Modificar.setEnabled(true);

        //jtPrecio.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
        //jtPrecio.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
        //jtPrecio.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
        //jtPrecio.setText(String.valueOf(jTable1.getValueAt(fila, 3)));

        //Desahibilitar los botones de añadir y eliminar
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtCategoria_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCategoria_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCategoria_id1ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        this.jbEliminar.setEnabled(true);

        this.jtStock.setEditable(true);
        this.jtNombre.setEditable(true);
        this.jtPrecio.setEditable(true);
        this.jtStock.setEditable(true);
        this.jtStockMax.setEditable(true);
        this.jtStockMin.setEditable(true);
        this.jtCategoria.setEditable(false);
        this.jtFoto.setEditable(true);
        this.JComboBox.setVisible(true);

        this.jbGuardar.setEnabled(true);

        //Categoria ca =(Categoria)this.JComboBox.getSelectedItem();
        //this.jtCategoria_id1.setText(String.valueOf(ca.getCategoria_id()));

    }//GEN-LAST:event_ModificarActionPerformed

    private void jtCategoria_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCategoria_idActionPerformed
        // TODO add your handling code here:
        //Categoria ca = (Categoria)this.JComboBox.getSelectedObjects();
        //this.jtCategoria_id1.setText(String.valueOf(ca.))
    }//GEN-LAST:event_jtCategoria_idActionPerformed

    private void JComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxActionPerformed
        // TODO add your handling code here:
        Categoria ca =(Categoria)this.JComboBox.getSelectedItem();
        this.jtCategoria_id1.setText(String.valueOf(ca.getCategoria_id()));
    }//GEN-LAST:event_JComboBoxActionPerformed

    private void JComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxItemStateChanged
        //Categoria ca=(Categoria)this.jComboBox.getSelectedItem();
        //this.jTextField4.setText(String.valueOf(ca.getIdcategoria()));
    }//GEN-LAST:event_JComboBoxItemStateChanged

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:

        this.jbEliminar.setEnabled(false);
        this.Modificar.setEnabled(false);

        //poner todo en blanco
        this.jtStock.setText("");
        this.jtNombre.setText("");
        this.jtPrecio.setText("");
        this.jtStock.setText("");
        this.jtStockMax.setText("");
        this.jtStockMin.setText("");
        this.jtCategoria.setText("");
        this.jtFoto.setText("");
        this.jtProd_id.setText(String.valueOf(0));
        this.jtStock_id.setText("");

        this.JComboBox.setVisible(true);
        this.jtCategoria.setEditable(false);

        this.jtStock.setEditable(true);
        this.jtNombre.setEditable(true);
        this.jtPrecio.setEditable(true);
        this.jtStock.setEditable(true);
        this.jtStockMax.setEditable(true);
        this.jtStockMin.setEditable(true);
        this.jtFoto.setEditable(true);

        this.jbGuardar.setEnabled(true);

        //indicar que la accion sera guardar
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        this.jbGuardar.setEnabled(false);

        int idPro = Integer.parseInt(this.jtProd_id.getText());
        int stock_id = Integer.parseInt(this.jtStock_id.getText());

        Producte p=new Producte(idPro);
        Stock s=new Stock(stock_id);

        producte.EliminarProducto(p, s);

        this.jtStock.setText("");
        this.jtNombre.setText("");
        this.jtPrecio.setText("");
        this.jtStock.setText("");
        this.jtStockMax.setText("");
        this.jtStockMin.setText("");
        this.jtCategoria.setText("");
        this.jtFoto.setText("");
        this.jtProd_id.setText("");
        this.jtStock_id.setText("");

        this.Modificar.setEnabled(false);

        this.jTable1.setModel(producte.mostrarProducto());

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        this.jbEliminar.setEnabled(true);
        this.Modificar.setEnabled(true);

        //primero ver de que accion viene si de guardar o demodificar

        //validar
        if (this.jtNombre.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Nombre del producto obligatorio");
            jtNombre.requestFocus();
            return;
        }

        //  ControllerFactura.isNumeric(this.jtStock.getText())
        if (!Controller.isNumeric(this.jtPrecio.getText())) {

            JOptionPane.showConfirmDialog(rootPane, "Debe introducir un número");

            // boolean num=ControllerFactura.isNumeric(this.jtStock.getText());
            jtPrecio.requestFocus();
            return;
        }

        if (!Controller.isNumeric(this.jtStock.getText())) {

            JOptionPane.showConfirmDialog(rootPane, "Debe introducir el stock actual");

            // boolean num=ControllerFactura.isNumeric(this.jtStock.getText());
            jtStock.requestFocus();
            return;
        }

        if (!Controller.isNumeric(this.jtStockMin.getText())) {

            JOptionPane.showConfirmDialog(rootPane, "Debe introducir el stock minimo");

            // boolean num=ControllerFactura.isNumeric(this.jtStock.getText());
            jtStockMin.requestFocus();
            return;
        }
        if (!Controller.isNumeric(this.jtStockMax.getText())) {

            JOptionPane.showConfirmDialog(rootPane, "Debe introducir el stock minimo");

            // boolean num=ControllerFactura.isNumeric(this.jtStock.getText());
            jtStockMax.requestFocus();
            return;
        }

        //

        String nombrePro = this.jtNombre.getText();
        int precioPro = Integer.parseInt(this.jtPrecio.getText());
        int fotoPro = Integer.parseInt(this.jtFoto.getText());
        int stock_actual = Integer.parseInt(this.jtStock.getText());
        int stock_max = Integer.parseInt(this.jtStockMax.getText());
        int stock_min = Integer.parseInt(this.jtStockMin.getText());
        int idCat=Integer.parseInt(this.jtCategoria_id1.getText());

        //ACTUALIZAR REGISTRO:
        int f=0;
        if(Integer.parseInt(this.jtProd_id.getText())!=0){
            f=1;
            int idPro =Integer.parseInt(this.jtProd_id.getText());
            //int idCat = Integer.parseInt(this.jtCategoria_id1.getText());
            int stock_id = Integer.parseInt(this.jtStock_id.getText());

            Producte p=new Producte(idPro,nombrePro,precioPro,fotoPro,idCat);
            Stock s=new Stock(stock_id,stock_actual,stock_max,stock_min);

            producte.InsertarProductoStock(p, s, f);

        }else{
            //NUEVO REGISTRO:
            //int idPro =Integer.parseInt(this.jtProd_id.getText());
            Producte p=new Producte(nombrePro,precioPro,fotoPro,idCat);
            Stock s=new Stock(stock_actual,stock_max,stock_min);
            producte.InsertarProductoStock(p, s, f);

        }

        // producte.addProducteStock(p, s);

        this.jtStock.setEditable(false);
        this.jtNombre.setEditable(false);
        this.jtPrecio.setEditable(false);
        this.jtStock.setEditable(false);
        this.jtStockMax.setEditable(false);
        this.jtStockMin.setEditable(false);
        this.jtCategoria.setEditable(false);
        this.jtFoto.setEditable(false);

        this.jTable1.setModel(producte.mostrarProducto());
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFotoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBox;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTextField jtCategoria;
    private javax.swing.JTextField jtCategoria_id;
    private javax.swing.JTextField jtCategoria_id1;
    private javax.swing.JTextField jtFoto;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtProd_id;
    private javax.swing.JTextField jtStock;
    private javax.swing.JTextField jtStockMax;
    private javax.swing.JTextField jtStockMin;
    private javax.swing.JTextField jtStock_id;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
