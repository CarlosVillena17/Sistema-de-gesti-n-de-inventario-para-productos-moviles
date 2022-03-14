/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import ArbolesBinarios.ArbolBusquedaProducto;
import Modelo.Producto;
import TablaHash.FiltroTablaHash;
import Ordenamiento.ControladorProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class Cliente extends javax.swing.JFrame {
    ArrayList<Producto> listaProductos=new ArrayList<Producto>();
    DefaultTableModel modelo=new DefaultTableModel();
    public Cliente() {
        initComponents();      
        tablaproductos.setModel(modelo);
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        btnProductos1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        cbxMarcaCelulares = new javax.swing.JComboBox<>();
        cbxOrdenar = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        txtTextoABuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new java.awt.GridLayout(3, 0));

        btnProductos.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cellphone_79786.png"))); // NOI18N
        btnProductos.setText("Ver productos");
        btnProductos.setAlignmentY(0.0F);
        btnProductos.setBorder(null);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductos);

        btnProductos1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnProductos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-cart-add-button_icon-icons.com_56132.png"))); // NOI18N
        btnProductos1.setText("Ver Carrito");
        btnProductos1.setAlignmentY(0.0F);
        btnProductos1.setBorder(null);
        btnProductos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductos1);

        Salir.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit-Page_icon-icons.com_53732.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setAlignmentY(0.0F);
        Salir.setBorder(null);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel5.add(Salir);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(5, 117, 230));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaproductos.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MARCA", "MODELO", "PRECIO", "CANTIDAD"
            }
        ));
        tablaproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaproductos.setRowHeight(35);
        tablaproductos.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tablaproductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproductos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 565, 310));

        btnFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFiltrar.setForeground(new java.awt.Color(0, 0, 0));
        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-circular-symbol_icon-icons.com_53800.png"))); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        cbxMarcaCelulares.setBackground(new java.awt.Color(255, 255, 255));
        cbxMarcaCelulares.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        cbxMarcaCelulares.setForeground(new java.awt.Color(0, 0, 0));
        cbxMarcaCelulares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Huawei", "Apple", "Xiaomi", "LG", "Motorola", "Sony", "Lenovo" }));
        cbxMarcaCelulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaCelularesActionPerformed(evt);
            }
        });
        jPanel4.add(cbxMarcaCelulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 152, 40));

        cbxOrdenar.setBackground(new java.awt.Color(255, 255, 255));
        cbxOrdenar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        cbxOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio", "Cantidad", "Nombre" }));
        jPanel4.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 190, 38));

        btnOrdenar.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel4.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 110, 38));

        txtTextoABuscar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtTextoABuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtTextoABuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 102, 96)));
        jPanel4.add(txtTextoABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 169, 39));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        jButton1.setText("Buscar ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRODUCTOS ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel3.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 178, 35));

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MARCA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 65, -1));

        txtModelo.setEditable(false);
        txtModelo.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPanel3.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 178, 35));

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MODELO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 65, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 178, 36));

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRECIO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 65, -1));

        txtCantidad.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 178, 36));

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        btnInsertar.setBackground(new java.awt.Color(255, 37, 26));
        btnInsertar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/63007shoppingcart_109353.png"))); // NOI18N
        btnInsertar.setText("Agregar Carrito ");
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel3.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 50));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 300, 310));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradiente4.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        limpiarTabla();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("select marca, nombre, precio, cantidad from productos ");
            rs=ps.executeQuery();
            ResultSetMetaData rsMD=rs.getMetaData();
            int ncolumnas=rsMD.getColumnCount();
            int [] ancho={50,150,50,50};
            for(int i=0; i<ncolumnas; i++){
                tablaproductos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
            }

            
            while(rs.next()){
                Object[] filas=new Object[ncolumnas];
                for(int i=0; i<ncolumnas; i++){
                    filas[i]=rs.getObject(i+1);             
                }
                Producto producto=new Producto( (String) filas[0], (String) filas[1], (double) filas[2], (int) filas[3]);
                listaProductos.add(producto);
                modelo.addRow(filas);
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        System.out.println("0.4123541");
        limpiarTabla();
        String opcion= (String) cbxOrdenar.getSelectedItem();
        ArrayList<Producto> listatemp=listaProductos;
        Iterator<Producto> iterador=listatemp.iterator();
        if(opcion.equals("Precio")){
            ControladorProductos.ordenacionMonticulosPrecios(listatemp);
            for(Producto producto: listatemp){
                Object[] filas=new Object[4];
                filas[0]=producto.getCodigo();
                filas[1]=producto.getNombre();
                filas[2]=producto.getPrecio();
                filas[3]=producto.getCantidad();
                modelo.addRow(filas);

            }

        }else if(opcion.equals("Cantidad")){
            ControladorProductos.quickSortCantidad(listatemp, 0, listatemp.size()-1);
            for(Producto producto: listatemp){
                Object[] filas=new Object[4];
                filas[0]=producto.getCodigo();
                filas[1]=producto.getNombre();
                filas[2]=producto.getPrecio();
                filas[3]=producto.getCantidad();
                modelo.addRow(filas);

            }

        }else if(opcion.equals("Nombre")){
            ArrayList<Producto> listaordenada=new ArrayList<>();
            ArbolBusquedaProducto arbol=new ArbolBusquedaProducto(listaordenada);
            for(Producto producto: listatemp){
                arbol.agregarNodo(producto);
            }
            arbol.inOrden(arbol.getRaiz());
            for(Producto producto: listaordenada){
                Object[] filas=new Object[4];
                filas[0]=producto.getCodigo();
                filas[1]=producto.getNombre();
                filas[2]=producto.getPrecio();
                filas[3]=producto.getCantidad();
                modelo.addRow(filas);

            }
            
            
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void cbxMarcaCelularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaCelularesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMarcaCelularesActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
       
        PreparedStatement ps=null;
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("insert into carritocompras (marca, modelo, precio, cantidad, idcliente) values (?,?,?,?,?)");
            ps.setString(1, txtMarca.getText());
            ps.setString(2, txtModelo.getText());
            ps.setDouble(3, Double.parseDouble(txtPrecio.getText()));
            ps.setInt(4, Integer.parseInt(txtCantidad.getText()));
            ps.setInt(5, Login.ID_USUARIO);
            int r=ps.executeUpdate();
            if(r>0){
                JOptionPane.showMessageDialog(null,"SE HA AGREGADO AL CARRITO");
            }else{
                JOptionPane.showMessageDialog(null, "NO SE REGISTRO EL PEDIDO");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "CANTIDAD INVALIDA");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        System.out.println("0.00001234116");
        String marcacelular=(String) cbxMarcaCelulares.getSelectedItem();
        FiltroTablaHash filtro=new FiltroTablaHash();
        filtro.pasarTabla(listaProductos);
        ArrayList<Producto> lista=new ArrayList<>();
        lista=filtro.filtrarPorCodigo(marcacelular);
        limpiarTabla();
        for(Producto pro: lista){
            Object[] tabla=new Object[4];
            tabla[0]=pro.getCodigo();
            tabla[1]=pro.getNombre();
            tabla[2]=pro.getPrecio();
            tabla[3]=pro.getCantidad();
            modelo.addRow(tabla);
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void tablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductosMouseClicked
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
           Conexion con=new Conexion();
           Connection conexion=con.getConnection();
           int fila=tablaproductos.getSelectedRow();
           String nombre=tablaproductos.getValueAt(fila, 1).toString();
           ps=conexion.prepareStatement("select marca, nombre, precio  from productos where nombre=?");
           ps.setString(1, nombre);
           rs=ps.executeQuery();
           
           while(rs.next()){
               txtMarca.setText(rs.getString("marca"));
               txtModelo.setText(rs.getString("nombre"));
               txtPrecio.setText(String.valueOf(rs.getDouble("precio")));
           }
            
        }catch(Exception ex){
            System.out.println("Error "+ex);
        }
    }//GEN-LAST:event_tablaproductosMouseClicked

    private void btnProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos1ActionPerformed
          VerCarro vercarro=new VerCarro();
          this.dispose();
          vercarro.setVisible(true);
    }//GEN-LAST:event_btnProductos1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       Login login=new Login();
       this.dispose();
       login.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("0.111215");
        limpiarTabla();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String consulta=txtTextoABuscar.getText()+"%";
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("select marca, nombre, precio, cantidad from productos where nombre like \""+consulta+"\"");
            rs=ps.executeQuery();
            ResultSetMetaData rsMD=rs.getMetaData();
            int ncolumnas=rsMD.getColumnCount();
            int [] ancho={50,150,50,50};
            for(int i=0; i<ncolumnas; i++){
                tablaproductos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
            }         
            while(rs.next()){
                Object[] filas=new Object[ncolumnas];
                for(int i=0; i<ncolumnas; i++){
                    filas[i]=rs.getObject(i+1);             
                }
                modelo.addRow(filas);
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiarTabla(){
        int fila=tablaproductos.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JComboBox<String> cbxMarcaCelulares;
    private javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTextoABuscar;
    // End of variables declaration//GEN-END:variables
}
