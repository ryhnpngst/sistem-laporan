/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import halaman.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static koneksi.konek.konek;
import koneksi.session;

/**
 *
 * @author Lenovo
 */
public class dashboard extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    String user = session.get_Username();

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        con = konek();
        String sql = "SELECT * FROM akun WHERE username=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while(rs.next()){
                welcomeLabel.setText("Selamat Datang " + user);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        dashboardLabel = new javax.swing.JLabel();
        editPenggunaButton = new javax.swing.JButton();
        buatLaporanButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(244, 248, 250));

        menuPanel.setBackground(new java.awt.Color(3, 5, 9));
        menuPanel.setForeground(new java.awt.Color(3, 5, 9));
        menuPanel.setPreferredSize(new java.awt.Dimension(200, 700));

        dashboardLabel.setBackground(new java.awt.Color(244, 248, 250));
        dashboardLabel.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(244, 248, 250));
        dashboardLabel.setText("Dashboard");

        editPenggunaButton.setBackground(new java.awt.Color(244, 248, 250));
        editPenggunaButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        editPenggunaButton.setForeground(new java.awt.Color(3, 5, 9));
        editPenggunaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/createIcon.png"))); // NOI18N
        editPenggunaButton.setText("Edit Pengguna");
        editPenggunaButton.setPreferredSize(new java.awt.Dimension(141, 23));
        editPenggunaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPenggunaButtonActionPerformed(evt);
            }
        });

        buatLaporanButton.setBackground(new java.awt.Color(244, 248, 250));
        buatLaporanButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        buatLaporanButton.setForeground(new java.awt.Color(3, 5, 9));
        buatLaporanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/createCircle.png"))); // NOI18N
        buatLaporanButton.setText("Buat Laporan");

        logoutButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logout.png"))); // NOI18N
        logoutButton.setText("Keluar");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardLabel)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(editPenggunaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buatLaporanButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardLabel)
                .addGap(18, 18, 18)
                .addComponent(buatLaporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editPenggunaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        welcomeLabel.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        welcomeLabel.setText("Selamat Datang atauAdmin E-Lapor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(welcomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editPenggunaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPenggunaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPenggunaButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        login in = new login();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buatLaporanButton;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JButton editPenggunaButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
