/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;

/**
 *
 * @author Ruhon Borah
 */
public class administrator_log extends javax.swing.JFrame {

    /**
     * Creates new form administrator_log
     */
    public administrator_log() {
       setUndecorated(true);
        setAlwaysOnTop(true);
        setResizable(true);
        
        
        Toolkit tk= Toolkit.getDefaultToolkit();
        
        int x=(int) tk.getScreenSize().getWidth();
       int y=(int) tk.getScreenSize().getHeight();
        
        
        
       this.setSize(x,y); 
        initComponents();
    }
   // public administrator_log() {
       // setUndecorated(true);
        //setAlwaysOnTop(true);
        //setResizable(true);
        
        
       // Toolkit tk= Toolkit.getDefaultToolkit();
        
       // int x=(int) tk.getScreenSize().getWidth();
        //int y=(int) tk.getScreenSize().getHeight();
        
        
        
        //this.setSize(x,y); 
        //initComponents();
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mxg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vpass = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        showCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 102));

        jp.setBackground(new java.awt.Color(0, 153, 0));
        jp.setForeground(new java.awt.Color(0, 0, 255));
        jp.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\JISTU ELECTION APPLICATION\\JIST LOGO.jpg")); // NOI18N
        jp.add(jLabel1);
        jLabel1.setBounds(400, 20, 300, 180);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("ID");
        jp.add(jLabel2);
        jLabel2.setBounds(450, 330, 26, 29);
        jp.add(vid);
        vid.setBounds(550, 340, 270, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("PASSWORD");
        jp.add(jLabel3);
        jLabel3.setBounds(380, 390, 140, 29);

        jButton1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("LOG IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jp.add(jButton1);
        jButton1.setBounds(340, 490, 147, 40);

        jButton2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jp.add(jButton2);
        jButton2.setBounds(530, 490, 150, 40);

        jButton3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jp.add(jButton3);
        jButton3.setBounds(730, 490, 120, 40);

        mxg.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jp.add(mxg);
        mxg.setBounds(180, 550, 670, 40);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("JISTSU VOTING APPLICATION");
        jp.add(jLabel4);
        jLabel4.setBounds(170, 220, 710, 50);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("administrator section");
        jp.add(jLabel5);
        jLabel5.setBounds(300, 280, 450, 40);
        jp.add(vpass);
        vpass.setBounds(550, 390, 270, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton4.setText("<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jp.add(jButton4);
        jButton4.setBounds(790, 610, 80, 30);

        showCheckbox.setText("Show Password");
        showCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCheckboxActionPerformed(evt);
            }
        });
        jp.add(showCheckbox);
        showCheckbox.setBounds(710, 440, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String un=vid.getText();
        String x=new String(vpass.getPassword());

        String sql="SELECT * FROM administrator_login WHERE id='"+un+"'AND PASSword='"+x+"'";
        String dbpass,dbun;
        dbpass="";
        dbun="";
        try
        {
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost/JISTSUE","root","rohan@#8011");
            Statement stat=con.createStatement();

            ResultSet rs=stat.executeQuery(sql);

            if(rs.next()){
                dbun=""+rs.getString("id");
                dbpass=""+rs.getString("PASSword");

                if((un.equals(dbun))&&(x.equals(dbpass)))
                {
                    new administration_portal().setVisible(true);
        this.setVisible(false);
                }

            }
            else if ( vid.getText().trim().isEmpty() && vpass.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "PLEASE INSERT ID AND PASSWORD");
            }
            else if ( vid.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "PLEASE INSERT ID");
            }
            else if(vpass.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "PLEASE INSERT PASSWORD");
            }
            else{
                mxg.setText("MESSAGE:INVALID USERNAME OR PASSWORD!");
            }

        }catch(SQLException rs)
        {
            System.out.print(rs);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        vid.setText("");
        vpass.setText("");
        mxg.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void showCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCheckboxActionPerformed
        // TODO add your handling code here:
        if(showCheckbox.isSelected()){
            vpass.setEchoChar((char)0);
        }  else{
            vpass.setEchoChar('*');
        }

    }//GEN-LAST:event_showCheckboxActionPerformed

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
            java.util.logging.Logger.getLogger(administrator_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrator_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrator_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrator_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrator_log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jp;
    private javax.swing.JLabel mxg;
    private javax.swing.JCheckBox showCheckbox;
    private javax.swing.JTextField vid;
    private javax.swing.JPasswordField vpass;
    // End of variables declaration//GEN-END:variables
}