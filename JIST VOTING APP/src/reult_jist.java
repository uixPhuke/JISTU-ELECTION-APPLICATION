/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ruhon Borah
 */

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.*;
import java.awt.print.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class reult_jist extends javax.swing.JFrame {

    /**
     * Creates new form reult_jist
     */
    public reult_jist() {
          setUndecorated(true);
        setAlwaysOnTop(true);
        setResizable(true);
        
        
        Toolkit tk= Toolkit.getDefaultToolkit();
        
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        
        
        
        this.setSize(x,y); 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        i1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        printt = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL NO", "VOTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        i1.setBackground(new java.awt.Color(0, 102, 204));
        i1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        i1.setForeground(new java.awt.Color(0, 204, 204));
        i1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("SHOW RESULT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        printt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        printt.setText("PRINT");
        printt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printtActionPerformed(evt);
            }
        });

        jButton27.setText("<<");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27)
                    .addComponent(printt))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        String PRE1="select * from add_post;";
        
        
        
        try
        {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet r=stat.executeQuery(PRE1);
            
            while(r.next()){
                
                i1.addItem(r.getString("POSTN"));
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }   
         
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i;
        i=i1.getSelectedIndex();
        if(i==1){
             String sql="select * from president_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);
        }
        if(i==2){
            String sql="select * from v_president_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);
        }
         if(i==3){
            String sql="select * from gs_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);
        }
         if(i==4){
            String sql="select * from ags_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);
        }
         if(i==5){
            String sql="select * from cultural_s_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);
        }
          if(i==6){
            String sql="select * from liter_mega_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);
        }
          if(i==7){
            String sql="select * from liter_mega_resul";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
          if(i==8){
            String sql="select * from major_g_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
           if(i==9){
            String sql="select * from minor_g_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
            if(i==10){
            String sql="select * from social_s_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
            if(i==11){
            String sql="select * from boys_com_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
            if(i==12){
            String sql="select * from girls_com_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
            if(i==13){
            String sql="select * from training_placement_result";
        DefaultTableModel dtm=(DefaultTableModel)table.getModel();
        
        try
        {
            Connection con=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost/jistsue","root","rohan@#8011");
            Statement stat=con.createStatement();
            
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                
                dtm.addRow(new Object[]{rs.getString("SL"),rs.getString("vote")});
            }
        }
        catch(SQLException ex){
            System.out.println("Error in prog...."+ex);
        }
        table.setModel(dtm);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        table.setModel(new DefaultTableModel(null,new String[]{"SL","VOTE"}));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void printtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printtActionPerformed
        // TODO add your handling code here:
        MessageFormat header=new MessageFormat("List ");
        MessageFormat footer=new MessageFormat("page{0,number,integer}");
        
        try{
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("cnnot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_printtActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        new result_portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton27ActionPerformed

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
            java.util.logging.Logger.getLogger(reult_jist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reult_jist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reult_jist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reult_jist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reult_jist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> i1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
