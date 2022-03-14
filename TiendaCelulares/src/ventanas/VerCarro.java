/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Modelo.Producto;
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


public class VerCarro extends javax.swing.JFrame {
    int filaEliminar=-1;
    DefaultTableModel modelo=new DefaultTableModel();
    public VerCarro() {
        initComponents();      
        tablacarritocompras.setModel(modelo);
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Precio");
        modelo.addColumn("cantidad");
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
        tablacarritocompras = new javax.swing.JTable();
        btnVerCarrito = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSubtotalPagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalaPagar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxVisaaPagar = new javax.swing.JComboBox<>();
        txtTarjeta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnComprar1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

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
                .addGap(0, 274, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 198, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablacarritocompras.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tablacarritocompras.setModel(new javax.swing.table.DefaultTableModel(
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
        tablacarritocompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablacarritocompras.setRowHeight(30);
        tablacarritocompras.setSelectionBackground(new java.awt.Color(255, 4, 197));
        tablacarritocompras.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablacarritocompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacarritocomprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacarritocompras);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 500, 305));

        btnVerCarrito.setBackground(new java.awt.Color(0, 153, 0));
        btnVerCarrito.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnVerCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/63007shoppingcart_109353.png"))); // NOI18N
        btnVerCarrito.setText("Ver mi carrito");
        btnVerCarrito.setActionCommand("Comprar");
        btnVerCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarritoActionPerformed(evt);
            }
        });
        jPanel4.add(btnVerCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 243, -1));

        btnComprar.setBackground(new java.awt.Color(255, 0, 51));
        btnComprar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1491313931-cross_82985.png"))); // NOI18N
        btnComprar.setText("Eliminar Producto");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel4.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 230, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel2.setText("TU PEDIDO ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 39));

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setText("TOTAL A PAGAR S/ ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtSubtotalPagar.setEditable(false);
        txtSubtotalPagar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtSubtotalPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtSubtotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 160, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel4.setText("SUBTOTAL A PAGAR S/ ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        txtDescuento.setEditable(false);
        txtDescuento.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtDescuento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, -1));

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel5.setText("MI TARJETA ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        txtTotalaPagar.setEditable(false);
        txtTotalaPagar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtTotalaPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txtTotalaPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 4));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Visa_icon-icons.com_60549.png"))); // NOI18N
        jPanel6.add(jLabel7);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mastercard_icon-icons.com_60554.png"))); // NOI18N
        jPanel6.add(jLabel8);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yape.png"))); // NOI18N
        jPanel6.add(jLabel6);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bitcoin_icon-icons.com_60538.png"))); // NOI18N
        jPanel6.add(jLabel1);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 199, 330, 60));

        cbxVisaaPagar.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        cbxVisaaPagar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "MasterCard", "Yape", "Bitcoins" }));
        jPanel3.add(cbxVisaaPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 320, 40));

        txtTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 320, 40));

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel10.setText("DESCUENTO S/");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnComprar1.setBackground(new java.awt.Color(255, 0, 0));
        btnComprar1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnComprar1.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/62878dollarbanknote_109277.png"))); // NOI18N
        btnComprar1.setText("Comprar");
        btnComprar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 249, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 376, 540));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MI CARRITO ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrito-de-compra-8.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 21, 500, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradiente4.png"))); // NOI18N
        jPanel4.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 580));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Cliente cliente=new Cliente();
        this.dispose();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       Login login=new Login();
       this.dispose();
       login.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void btnVerCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarritoActionPerformed
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("select marca, modelo, precio, cantidad from carritocompras where idcliente=?");
            ps.setInt(1, Login.ID_USUARIO);
            rs=ps.executeQuery();
            int ncolumnas=4;
            while(rs.next()){
                Object[] filas=new Object[ncolumnas];
                for(int i=0; i<ncolumnas; i++){
                    filas[i]=rs.getObject(i+1);             
                }
                modelo.addRow(filas);
            }
            calcularCostoTotal();
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }//GEN-LAST:event_btnVerCarritoActionPerformed

    private void tablacarritocomprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacarritocomprasMouseClicked
        filaEliminar=tablacarritocompras.getSelectedRow();
        
    }//GEN-LAST:event_tablacarritocomprasMouseClicked

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if(filaEliminar==-1){
            JOptionPane.showMessageDialog(this, "Selecione un producto a eliminar");
        }else{
            modelo.removeRow(filaEliminar);
            calcularCostoTotal();
        }
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar1ActionPerformed
       
            if(txtTarjeta.getText().trim().length()==0){
                JOptionPane.showMessageDialog(null, "Escriba el numero de su tarjeta");           
            }else{
                PreparedStatement ps=null;
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("insert into venta (idcliente, total) values (?,?)");
            ps.setInt(1, Login.ID_USUARIO);
            ps.setDouble(2, Double.parseDouble(txtTotalaPagar.getText()));
            int r=ps.executeUpdate();
            if(r>0){
                this.dispose();
                Cliente cliente=new Cliente();
                cliente.setVisible(true);
                GraciasPorLaCompra ventana=new GraciasPorLaCompra(this, true);
                ventana.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "NO SE REGISTRO LA COMPRA");
            }
        }catch(Exception ex){
            System.out.println("Error "+ex);
        }
                
            }
            
       
    }//GEN-LAST:event_btnComprar1ActionPerformed
    public void limpiarTabla(){
        int fila=tablacarritocompras.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    public void calcularCostoTotal(){
        
        int numerodefilas=tablacarritocompras.getRowCount();
        double descuento=0.0;
        double subtotal=0.0;
        double total=0.0;
        int totalcantidad=0;
        int cantidad;
        double precio;
        for(int i=0; i<numerodefilas; i++){
            cantidad=(int) tablacarritocompras.getValueAt(i, 3);
            precio= (double) tablacarritocompras.getValueAt(i, 2);
            subtotal+=precio*cantidad; 
            totalcantidad+=cantidad;
        }
        if(totalcantidad>=5){
            descuento=250;
        }else if(totalcantidad>=3){
            descuento=100;
        }
        total=subtotal-descuento;
        txtDescuento.setText(String.valueOf(descuento));
        txtSubtotalPagar.setText(String.valueOf(subtotal));
        txtTotalaPagar.setText(String.valueOf(total));
        
        
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
            java.util.logging.Logger.getLogger(VerCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnComprar1;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JButton btnVerCarrito;
    private javax.swing.JComboBox<String> cbxVisaaPagar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablacarritocompras;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotalPagar;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTotalaPagar;
    // End of variables declaration//GEN-END:variables
}
