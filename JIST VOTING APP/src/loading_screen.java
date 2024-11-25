
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ruhon Borah
 */
public class loading_screen extends javax.swing.JFrame {

    /**
     * Creates new form loading_screen
     */
    public loading_screen() {
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

        Back = new javax.swing.JPanel();
        k = new javax.swing.JProgressBar();
        x = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setPreferredSize(new java.awt.Dimension(900, 500));
        Back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Back.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 900, -1));

        x.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        x.setText("Loading....");
        Back.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 360, -1));

        y.setBackground(new java.awt.Color(255, 255, 255));
        y.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        y.setText("0 %");
        Back.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 40, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\JISTU ELECTION APPLICATION\\images (1).jfif")); // NOI18N
        jLabel2.setText("jLabel2");
        Back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 500, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\JISTU ELECTION APPLICATION\\download.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        Back.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 290, 170));

        bim.setIcon(new javax.swing.ImageIcon("D:\\JISTU ELECTION APPLICATION\\steven-universe-wallpaper-full-hd-1080p-83090.jpg")); // NOI18N
        bim.setText("jLabel1");
        Back.add(bim, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -1, 910, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //int i;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loading_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        loading_screen sp=new loading_screen();
        sp.setVisible(true);
        
        
        try{
            for( int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.y.setText(i+"%");
            
            
                if(i==10){
                    sp.x.setText("Turning on JISTSUE...");
                    
                }
                 if(i==20){
                    sp.x.setText("Loading JISTSUE....");
            }
                 if(i==50){
                    sp.x.setText("Connection to JISTSUE...");
                    
                }
                 if(i==70){
                    sp.x.setText("Connection Successful...!");
            }
                 if(i==80){
                    sp.x.setText("Launching JISTSUE...");
                    
                }
                 if(i==20){
                    sp.x.setText("Turning on Modules...");
            }
                
                 if(i==100){
                     new jist_voting_log().setVisible(true);

                    
                     
            }
                 sp.k.setValue(i);
        }
        }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JLabel bim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar k;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}
