
package ventanas;

import ArbolesBinarios.ArbolBusquedaClientes;
import Cola.Cola;
import Modelo.ClienteComprador;
import Modelo.Producto;
import Ordenamiento.ControladorClientes;
import TablaHash.FiltroTablaHash;
import Ordenamiento.ControladorProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class Administrador extends javax.swing.JFrame {
    ArrayList<ClienteComprador> listacliente=new ArrayList<>();
    Cola<ClienteComprador> colaclientes=new Cola<>();
    DefaultTableModel modelo=new DefaultTableModel();
    DefaultTableModel modelotablaconCola=new DefaultTableModel();
    public Administrador() {
        initComponents();      
        tablaclientes.setModel(modelo);
        tablaclientesencolada.setModel(modelotablaconCola);
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("VENTA");
        modelotablaconCola.addColumn("DNI");
        modelotablaconCola.addColumn("NOMBRE");
        modelotablaconCola.addColumn("APELLIDO");
        modelotablaconCola.addColumn("VENTAS");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        cbxOrdenar = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        btnColaEspera = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaclientesencolada = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnOrdenar1 = new javax.swing.JButton();
        btnAtenderPedido = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtTotal1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-80_icon-icons.com_57249.png"))); // NOI18N
        btnProductos.setText("Clientes");
        btnProductos.setAlignmentY(0.0F);
        btnProductos.setBorder(null);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel3.add(btnProductos);

        btnAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        btnAlmacen.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cargo_3_35515.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setAlignmentY(0.0F);
        btnAlmacen.setBorder(null);
        btnAlmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        jPanel3.add(btnAlmacen);

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart_sales_performance_coins_money_icon_157294.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setAlignmentY(0.0F);
        btnVentas.setBorder(null);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel3.add(btnVentas);

        btnEstadisticas.setBackground(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1477521928_10_icon-icons.com_74620.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setAlignmentY(0.0F);
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        jPanel3.add(btnEstadisticas);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit-Page_icon-icons.com_53732.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 160, 580));

        jPanel4.setBackground(new java.awt.Color(36, 59, 106));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaclientes.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "TOTAL "
            }
        ));
        tablaclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaclientes.setRowHeight(35);
        tablaclientes.setSelectionBackground(new java.awt.Color(204, 0, 204));
        tablaclientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 220));

        cbxOrdenar.setBackground(new java.awt.Color(255, 255, 255));
        cbxOrdenar.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        cbxOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Nombre" }));
        jPanel4.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 40));

        btnOrdenar.setBackground(new java.awt.Color(255, 51, 51));
        btnOrdenar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setBorder(null);
        btnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel4.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 90, 40));

        btnColaEspera.setBackground(new java.awt.Color(0, 0, 0));
        btnColaEspera.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnColaEspera.setForeground(new java.awt.Color(255, 255, 255));
        btnColaEspera.setText("Agregar a la Cola");
        btnColaEspera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColaEspera.setFocusable(false);
        btnColaEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaEsperaActionPerformed(evt);
            }
        });
        jPanel4.add(btnColaEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 190, 40));

        tablaclientesencolada.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tablaclientesencolada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "VENTAS "
            }
        ));
        tablaclientesencolada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaclientesencolada.setRowHeight(35);
        tablaclientesencolada.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tablaclientesencolada.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaclientesencolada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesencoladaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaclientesencolada);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 570, 190));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 200, 30));

        btnOrdenar1.setBackground(new java.awt.Color(0, 0, 0));
        btnOrdenar1.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnOrdenar1.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar1.setText("Actualizar");
        btnOrdenar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenar1.setFocusable(false);
        btnOrdenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenar1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnOrdenar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 170, 40));

        btnAtenderPedido.setBackground(new java.awt.Color(255, 0, 0));
        btnAtenderPedido.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnAtenderPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnAtenderPedido.setText("Atender pedido ");
        btnAtenderPedido.setBorder(null);
        btnAtenderPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtenderPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderPedidoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAtenderPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 270, 50));

        btnClientes.setBackground(new java.awt.Color(0, 0, 0));
        btnClientes.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Ver Clientes");
        btnClientes.setAlignmentY(0.0F);
        btnClientes.setBorder(null);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setFocusable(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel4.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 160, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txtTotal1.setEditable(false);
        txtTotal1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtTotal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL");

        txtDNI.setEditable(false);
        txtDNI.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("APELLIDO");

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMBRE");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setMinimumSize(new java.awt.Dimension(64, 36));

        txtUsername.setEditable(false);
        txtUsername.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("USERNAME");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtApellido)
                        .addComponent(txtDNI))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 270, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradiente7.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 580));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 890, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login login=new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

        
    
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
            System.out.println("0.146446555555555555555");
            limpiarTabla();
            String opcion=(String) cbxOrdenar.getSelectedItem();
            if(opcion.equals("Ventas")){
                ControladorClientes.quickSortVentas(listacliente, 0, listacliente.size()-1);
                for(ClienteComprador cliente: listacliente){
                Object[] filas=new Object[4];
                filas[0]=cliente.getDNI();
                filas[1]=cliente.getNombre();
                filas[2]=cliente.getApellido();
                filas[3]=cliente.getVentas();
                modelo.addRow(filas);

            }
            }else if(opcion.equals("Nombre")){
                ArrayList<ClienteComprador> listaordenada=new ArrayList<>();
                ArbolBusquedaClientes arbolClientes=new ArbolBusquedaClientes(listaordenada);
                for(ClienteComprador cliente: listacliente){
                arbolClientes.agregarNodo(cliente);
                 }
                arbolClientes.inOrden(arbolClientes.getRaiz());
                for(ClienteComprador cliente: listaordenada){
                Object[] filas=new Object[4];
                filas[0]=cliente.getDNI();
                filas[1]=cliente.getNombre();
                filas[2]=cliente.getApellido();
                filas[3]=cliente.getVentas();
                modelo.addRow(filas);

            }
            }
            
            

    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
           Conexion con=new Conexion();
           Connection conexion=con.getConnection();
           int fila=tablaclientes.getSelectedRow();
           String nombre=tablaclientes.getValueAt(fila, 1).toString();
          ps=conexion.prepareStatement("select dni, nombre, apellido, username, total from cliente "
                   + "inner join venta on cliente.idcliente=venta.idcliente where nombre=?");
           ps.setString(1, nombre);
           rs=ps.executeQuery();
            System.out.println(nombre);
           while(rs.next()){
               txtDNI.setText(rs.getString("dni"));
               txtNombre.setText(rs.getString("nombre"));
               txtApellido.setText(rs.getString("apellido"));
               txtTotal1.setText(String.valueOf(rs.getInt("total")));
               txtUsername.setText(rs.getString("username")); 
           }
            
        }catch(Exception ex){
            System.out.println("Error "+ex);
        }
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        limpiarTabla();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("select dni, nombre, apellido, total from cliente "
                    + "inner join venta  on cliente.idcliente=venta.idcliente");
            rs=ps.executeQuery();
            ResultSetMetaData rsMD=rs.getMetaData();
            int ncolumnas=rsMD.getColumnCount();
            int [] ancho={50,100,70,50};
            for(int i=0; i<ncolumnas; i++){
                tablaclientes.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
            }
            
            while(rs.next()){
                Object[] filas=new Object[ncolumnas];
                for(int i=0; i<ncolumnas; i++){
                    filas[i]=rs.getObject(i+1);             
                }
                listacliente.add(new ClienteComprador((String)filas[0], (String) filas[1], (String) filas[2], (Double) filas[3]));
                modelo.addRow(filas);
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
       
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnColaEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaEsperaActionPerformed

           String username=txtUsername.getText();
           String dni=txtDNI.getText();
           String nombre=txtNombre.getText();
           String apellido=txtApellido.getText();
           Double total=Double.parseDouble(txtTotal1.getText());
           colaclientes.enqueue(new ClienteComprador(username,dni, nombre,apellido,total));
           JOptionPane.showMessageDialog(this, "Se ha agregado a la cola");
           
           
    }//GEN-LAST:event_btnColaEsperaActionPerformed

    private void tablaclientesencoladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesencoladaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaclientesencoladaMouseClicked

    private void btnOrdenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenar1ActionPerformed
        limpiarTablaEncolada();
        Cola<ClienteComprador> colatemporal=new Cola<>();
        while (colaclientes.isEmpty()==false){
            Object[] filas=new Object[4];
                filas[0]=colaclientes.front().getNombre();
                filas[1]=colaclientes.front().getApellido();
                filas[2]=colaclientes.front().getDNI();
                filas[3]=colaclientes.front().getVentas();
                modelotablaconCola.addRow(filas);
                colatemporal.enqueue(colaclientes.front());
                colaclientes.dequeue();
        }
        colaclientes=colatemporal;
        
    }//GEN-LAST:event_btnOrdenar1ActionPerformed

    private void btnAtenderPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderPedidoActionPerformed
        limpiarTablaEncolada();
        PedidoAtentido pedido=new PedidoAtentido(this, true);
        if(colaclientes.dequeue()){
            pedido.setVisible(true);
            Cola<ClienteComprador> colatemporal=new Cola<>();
            while (colaclientes.isEmpty()==false){
            Object[] filas=new Object[4];
            filas[0]=colaclientes.front().getNombre();
            filas[1]=colaclientes.front().getApellido();
            filas[2]=colaclientes.front().getDNI();
            filas[3]=colaclientes.front().getVentas();
            modelotablaconCola.addRow(filas);
            colatemporal.enqueue(colaclientes.front());
            colaclientes.dequeue();
        }
            colaclientes=colatemporal;
        }else{
            ErrorEnColar e=new  ErrorEnColar(this, true);
            e.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnAtenderPedidoActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
       Almacen ventanaAlmacen=new Almacen();
       this.dispose();
       ventanaAlmacen.setVisible(true);
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        GraficarVentas ventanaVentas=new GraficarVentas();
        this.dispose();
        ventanaVentas.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed
    public void limpiarTabla(){
        int fila=tablaclientes.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    public void limpiarTablaEncolada(){
        int fila=tablaclientesencolada.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelotablaconCola.removeRow(i);
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnAtenderPedido;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnColaEspera;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnOrdenar1;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTable tablaclientesencolada;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTotal1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
