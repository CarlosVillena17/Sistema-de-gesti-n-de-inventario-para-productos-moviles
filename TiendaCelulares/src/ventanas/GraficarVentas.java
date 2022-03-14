
package ventanas;

import ArbolesBinarios.ArbolBusquedaClientes;
import Cola.Cola;
import Modelo.ClienteComprador;
import Modelo.Producto;
import Ordenamiento.ControladorClientes;
import TablaHash.FiltroTablaHash;
import Ordenamiento.ControladorProductos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class GraficarVentas extends javax.swing.JFrame {
    String [] marcas=new String[8];
    int [] totales=new int[8];
    int total_Huawei, total_Apple, total_Samsung, total_Xiomi, total_Lenovo, total_Sony, total_motorola
            , total_Lg;
  
    public GraficarVentas() {
        initComponents();
        graficarVentas();
        repaint();
        
        
    }
    public void graficarVentas(){
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            Conexion con=new Conexion();
            Connection conexion=con.getConnection();
            ps=conexion.prepareStatement("select sum(total) as sumatotal, marca from cliente " +
            "inner join venta  on cliente.idcliente=venta.idcliente " +
            "inner join carritocompras on carritocompras.idcliente=cliente.idcliente " +
            "group by marca");
            rs=ps.executeQuery();
            int posicion=0;
            while(rs.next()){
                marcas[posicion]=rs.getString("marca");
                totales[posicion]= (int) rs.getDouble("sumatotal");

                if(marcas[posicion].equals("Huawei")){
                    total_Huawei=totales[posicion];
                }else if(marcas[posicion].equals("Lenovo")){
                    total_Lenovo=totales[posicion];
                }else if(marcas[posicion].equals("Samsung")){
                    total_Samsung=totales[posicion];
                }else if(marcas[posicion].equals("Apple")){
                    total_Apple=totales[posicion];
                }else if(marcas[posicion].equals("Xiaomi")){
                    total_Xiomi=totales[posicion];
                }else if(marcas[posicion].equals("LG")){
                    total_Lg=totales[posicion];
                }else if(marcas[posicion].equals("Motorola")){
                    total_motorola=totales[posicion];
                }else if(marcas[posicion].equals("Sony")){
                    total_Sony=totales[posicion];
                }          
                posicion++;
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int total= (total_Apple+total_Huawei+total_Lenovo+total_Lg+total_Samsung+total_Sony+total_Xiomi+total_motorola);
        int mayor= GraficarVentas.calcularMayor(total_Huawei,total_Apple,total_Lg, total_Samsung, total_Sony, total_motorola, total_Lenovo, total_Xiomi);
        int barraHuawei= total_Huawei*700/mayor;
        int barraSamsung= total_Samsung*700/mayor;
        int barraLenono=  total_Lenovo*700/mayor;
        int barraLg= total_Lg*700/mayor;
        int barraApple= total_Apple*700/mayor;
        int barraMotorola= total_motorola*700/mayor;
        int barraSony= total_Sony*700/mayor;
        int barraXiomi= total_Xiomi*700/mayor;
        

        try {
                for(int i=0; i<barraHuawei; i=i+2){
                g.setColor(new Color(255, 102, 235));
                g.fillRect(450, 100, i, 40);
                g.setColor(new Color(46, 44, 39));
                g.setFont(new Font("Open Sans", Font.BOLD, 18));
                g.drawString("HUAWEI", 245 , 125);
                g.drawString("S/"+total_Huawei, 370, 125);
                    Thread.sleep(9);
                }
                
                for(int i=0; i<barraSamsung; i=i+2){
                g.setColor(new Color(48, 240, 214));
                g.fillRect(450, 150, barraSamsung, 40);
                g.setColor(new Color(46, 44, 39));
                g.setFont(new Font("Open Sans", Font.BOLD, 18));
                g.drawString("SAMSUNG", 245 , 175);
                g.drawString("S/"+total_Samsung, 370, 175);
                    Thread.sleep(9);
                }
                
                for(int i=0; i<barraXiomi; i=i+2){
                    g.setColor(new Color(110, 255, 38));
                    g.fillRect(450, 200, i, 40);
                    g.setColor(new Color(46, 44, 39));
                    g.setFont(new Font("Open Sans", Font.BOLD, 18));
                    g.drawString("XIOMI", 245 , 225);
                    g.drawString("S/"+total_Xiomi, 370, 225);
                    Thread.sleep(9);
                }
                
                for(int i=0; i<barraApple; i=i+2){
                   g.setColor(new Color(143, 162, 255));
                   g.fillRect(450, 250, i, 40);
                   g.setColor(new Color(46, 44, 39));
                   g.setFont(new Font("Open Sans", Font.BOLD, 18));
                   g.drawString("APPLE", 245 , 275);
                   g.drawString("S/"+total_Apple, 370, 275);
                   Thread.sleep(9);
                }
                
                for(int i=0; i<barraMotorola; i=i+2){
                   g.setColor(new Color(19, 13, 28));
                   g.fillRect(450, 300, i, 40);
                   g.setFont(new Font("Open Sans", Font.BOLD, 18));
                   g.drawString("MOTOROLA", 245 , 325);
                   g.drawString("S/"+total_motorola, 370, 325);
                   Thread.sleep(9);
                }
                for(int i=0; i<barraLenono; i=i+2){
                   g.setColor(new Color(255, 64, 25));
                   g.fillRect(450, 350, i, 40);
                   g.setColor(new Color(46, 44, 39));
                   g.setFont(new Font("Open Sans", Font.BOLD, 18));
                   g.drawString("LENOVO", 245 , 375);
                   g.drawString("S/"+total_Lenovo, 370, 375);
                   Thread.sleep(9);
                }
                
                for(int i=0; i<barraSony; i=i+2){
                    g.setColor(new Color(40, 52, 61));
                    g.fillRect(450, 400, i, 40);
                    g.setColor(new Color(46, 44, 39));
                    g.setFont(new Font("Open Sans", Font.BOLD, 18));
                    g.drawString("SONY", 245 , 425);
                    g.drawString("S/"+total_Sony, 370, 425);
                   Thread.sleep(9);
                }
                
                for(int i=0; i<barraLg; i=i+2){
                    g.setColor(new Color(229, 255, 36));
                    g.fillRect(450, 450, i, 40);
                    g.setColor(new Color(46, 44, 39));
                    g.setFont(new Font("Open Sans", Font.BOLD, 18));
                    g.drawString("LG", 245 , 475);
                    g.drawString("S/"+total_Lg, 370, 475);
                   Thread.sleep(9);
                }
                               
                
            } catch (InterruptedException ex) {
                    
            }

 
    }
    public static int calcularMayor(int a, int b, int c, int d, int e, int f, int g, int h){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(a); 
        array.add(b); 
        array.add(c); 
        array.add(d); 
        array.add(e); 
        array.add(f);
        array.add(g); 
        array.add(h);       
        Collections.sort(array);       
        return array.get(array.size()-1);  
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        btnProductos.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 190, 590));

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setText("VENTAS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Administrador ventanaAdministrador=new Administrador();
            this.dispose();
            ventanaAdministrador.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
       
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
       Almacen ventanaAlmacen=new Almacen();
       this.dispose();
       ventanaAlmacen.setVisible(true);
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    
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
            java.util.logging.Logger.getLogger(GraficarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
