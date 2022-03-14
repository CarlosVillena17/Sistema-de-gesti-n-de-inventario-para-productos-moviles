
package ventanas;

import Cola.Cola;
import Modelo.ClienteComprador;
import Modelo.Producto;
import Ordenamiento.ControladorClientes;
import TablaHash.FiltroTablaHash;
import Ordenamiento.ControladorProductos;
import Pila.Pila;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class Almacen extends javax.swing.JFrame {
    Pila<Producto> pilaalmacen=new Pila<>();
    ArrayList<Producto> almacenProductos=new ArrayList<Producto>();
    DefaultTableModel modelo=new DefaultTableModel();
    public Almacen() {
        initComponents();      
        tablaAlmacenProductos.setModel(modelo);
        modelo.addColumn("MARCA");
        modelo.addColumn("MODELO");
        modelo.addColumn("PRECIO");
        modelo.addColumn("STOCK");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlmacenProductos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAtenderPedido = new javax.swing.JButton();
        btnDarPrioridad = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnCargarTabla = new javax.swing.JButton();
        pila = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        btnClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man-2_icon-icons.com_55041.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setAlignmentY(0.0F);
        btnClientes.setBorder(null);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel3.add(btnClientes);

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 180, 580));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAlmacenProductos.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tablaAlmacenProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MARCA", "MODELO", "PRECIO", "STOCK"
            }
        ));
        tablaAlmacenProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaAlmacenProductos.setRowHeight(35);
        tablaAlmacenProductos.setSelectionBackground(new java.awt.Color(255, 51, 255));
        tablaAlmacenProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaAlmacenProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmacenProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAlmacenProductos);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 530, 320));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(4, 2, 2, 5));

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("MARCA");
        jPanel5.add(jLabel2);

        cbxMarca.setBackground(new java.awt.Color(255, 255, 255));
        cbxMarca.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        cbxMarca.setForeground(new java.awt.Color(0, 0, 0));
        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Huawei", "Apple", "Xiaomi", "LG", "Motorola", "Sony", "Lenovo" }));
        cbxMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaActionPerformed(evt);
            }
        });
        jPanel5.add(cbxMarca);

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("MODELO");
        jPanel5.add(jLabel9);

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(txtModelo);

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("PRECIO");
        jPanel5.add(jLabel10);

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(txtPrecio);

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("STOCK ");
        jPanel5.add(jLabel8);

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(txtStock);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 170));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(4, 0, 5, 0));

        btnAtenderPedido.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnAtenderPedido.setText("Push");
        btnAtenderPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtenderPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderPedidoActionPerformed(evt);
            }
        });
        jPanel6.add(btnAtenderPedido);

        btnDarPrioridad.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnDarPrioridad.setText("Pop");
        btnDarPrioridad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDarPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarPrioridadActionPerformed(evt);
            }
        });
        jPanel6.add(btnDarPrioridad);

        btnTop.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnTop.setText("Top");
        btnTop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        jPanel6.add(btnTop);

        btnCargarTabla.setBackground(new java.awt.Color(255, 0, 51));
        btnCargarTabla.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        btnCargarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarTabla.setText("CARGAR TABLA ");
        btnCargarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaActionPerformed(evt);
            }
        });
        jPanel6.add(btnCargarTabla);

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 270, 200));

        pila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pila.gif"))); // NOI18N
        jPanel4.add(pila, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 260, 290));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 880, 630));

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

        
    
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Administrador ventanaAdministrador=new Administrador();
        this.dispose();
        ventanaAdministrador.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void tablaAlmacenProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmacenProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAlmacenProductosMouseClicked

    private void btnAtenderPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderPedidoActionPerformed
        ArrayList<Producto> listaProductos=new ArrayList<>();
        PreparedStatement ps=null;
        try{
            String marca= (String) cbxMarca.getSelectedItem();
            String modeloCelular=txtModelo.getText();
            Double precio=Double.parseDouble(txtPrecio.getText());
            int stock=Integer.parseInt(txtStock.getText());
            if(!"".equals(modeloCelular)){
                Conexion con=new Conexion();
                Connection conexion=con.getConnection();
                ps=conexion.prepareStatement("insert into productos (marca, nombre, precio, cantidad) values (?,?,?,?)");
                ps.setString(1, marca);
                ps.setString(2, modeloCelular);
                ps.setDouble(3,  precio);
                ps.setInt(4, stock);
                int r=ps.executeUpdate();
                if(r>0){
                    limpiarTablaPila();
                    pilaalmacen.push(new Producto(marca,modeloCelular,precio,stock));
                    
                    while (pilaalmacen.isEmpty()==false){
                        Object[] filas=new Object[4];
                        filas[0]=pilaalmacen.top().getCodigo();
                        filas[1]=pilaalmacen.top().getNombre();
                        filas[2]=pilaalmacen.top().getPrecio();
                        filas[3]=pilaalmacen.top().getCantidad();
                        listaProductos.add(pilaalmacen.top());
                        pilaalmacen.pop();                     
                        modelo.addRow(filas);
                     }
                    JOptionPane.showMessageDialog(this, "INGRESO CORRECTO");
                    Collections.reverse(listaProductos);
                    for(Producto producto: listaProductos){
                    pilaalmacen.push(producto);
                    }    
                    
                }else{
                JOptionPane.showMessageDialog(null, "HUBO UN PROBLEMA A LA HORA DE INGRESAR LOS DATOS");
                }
            }else{
                JOptionPane.showMessageDialog(this, "INGRESE EL MODELO");
            }
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "CANTIDAD INVALIDADA");
        }
        catch(Exception ex){
            System.out.println("Error "+ex);
        }
                    
    }//GEN-LAST:event_btnAtenderPedidoActionPerformed

    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
        limpiarTablaPila();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("select marca, nombre, precio, cantidad from productos");
            rs=ps.executeQuery();
            ResultSetMetaData rsMD=rs.getMetaData();
            int ncolumnas=rsMD.getColumnCount();
            int [] ancho={50,100,50,50};
            for(int i=0; i<ncolumnas; i++){
                tablaAlmacenProductos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
            }
            while(rs.next()){
                Object[] filas=new Object[ncolumnas];
                for(int i=0; i<ncolumnas; i++){
                    filas[i]=rs.getObject(i+1);             
                }
                Producto producto=new Producto( (String) filas[0], (String) filas[1], (double) filas[2], (int) filas[3]);
                almacenProductos.add(producto);
                modelo.addRow(filas);
   
            }
            Collections.reverse(almacenProductos);
            for(Producto producto: almacenProductos){
            pilaalmacen.push(producto);
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }//GEN-LAST:event_btnCargarTablaActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnDarPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarPrioridadActionPerformed
        
        if(pilaalmacen.pop()){
            modelo.removeRow(0);
        }else{
           ErrorEnPilar ventanaPop=new ErrorEnPilar(this, true);
           ventanaPop.setVisible(true);
           
        } 
        
    }//GEN-LAST:event_btnDarPrioridadActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        if(pilaalmacen.isEmpty()){
            ErrorEnPilar ventanaPop=new ErrorEnPilar(this, true);
            ventanaPop.setVisible(true);
        }else{
            limpiarTablaPila();
            Object [] fila=new Object[4];
            fila[0]= (String) pilaalmacen.top().getCodigo();
            fila[1]= (String) pilaalmacen.top().getNombre();
            fila[2]= (double) pilaalmacen.top().getPrecio();
            fila[3]= (int) pilaalmacen.top().getCantidad();
            modelo.addRow(fila);
        }
        
    }//GEN-LAST:event_btnTopActionPerformed

    private void cbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMarcaActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        GraficarVentas ventanaVentas=new GraficarVentas();
        this.dispose();
        ventanaVentas.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    public void limpiarTablaPila(){
        int fila=tablaAlmacenProductos.getRowCount();
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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnAtenderPedido;
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDarPrioridad;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTop;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cbxMarca;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pila;
    private javax.swing.JTable tablaAlmacenProductos;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
