/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman;

/**
 *
 * @author Lenovo
 */
public class daftar extends javax.swing.JFrame {

    /**
     * Creates new form daftar
     */
    public daftar() {
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

        jLabel3 = new javax.swing.JLabel();
        daftarPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        namaDepanLabel = new javax.swing.JLabel();
        namaBelakangLabel = new javax.swing.JLabel();
        usernamelLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        namaDepanTextField = new javax.swing.JTextField();
        namaBelakangTextField = new javax.swing.JTextField();
        usernamelTextField = new javax.swing.JTextField();
        passPasswordField = new javax.swing.JPasswordField();
        daftarButton = new javax.swing.JButton();
        sudahLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar");
        setBackground(new java.awt.Color(255, 255, 255));

        daftarPanel.setBackground(new java.awt.Color(255, 255, 255));
        daftarPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        judulLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        judulLabel.setText("Daftar dengan username");

        namaDepanLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        namaDepanLabel.setText("Nama depan");

        namaBelakangLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        namaBelakangLabel.setText("Nama belakang");

        usernamelLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        usernamelLabel.setText("Username");

        passLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passLabel.setText("Password");

        namaDepanTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        namaBelakangTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        usernamelTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        passPasswordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        daftarButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        daftarButton.setText("Daftar");

        sudahLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        sudahLabel.setText("Sudah punya akun?");

        loginButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        loginButton.setText("Login");

        javax.swing.GroupLayout daftarPanelLayout = new javax.swing.GroupLayout(daftarPanel);
        daftarPanel.setLayout(daftarPanelLayout);
        daftarPanelLayout.setHorizontalGroup(
            daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daftarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(daftarPanelLayout.createSequentialGroup()
                        .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulLabel)
                            .addGroup(daftarPanelLayout.createSequentialGroup()
                                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaDepanLabel)
                                    .addComponent(namaBelakangLabel)
                                    .addComponent(usernamelLabel)
                                    .addComponent(passLabel))
                                .addGap(28, 28, 28)
                                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaDepanTextField)
                                    .addComponent(namaBelakangTextField)
                                    .addComponent(usernamelTextField)
                                    .addComponent(passPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addComponent(sudahLabel)
                            .addComponent(loginButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        daftarPanelLayout.setVerticalGroup(
            daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addGap(18, 18, 18)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaDepanLabel)
                    .addComponent(namaDepanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBelakangLabel)
                    .addComponent(namaBelakangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelLabel)
                    .addComponent(usernamelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(daftarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sudahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(daftarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(daftarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarButton;
    private javax.swing.JPanel daftarPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel namaBelakangLabel;
    private javax.swing.JTextField namaBelakangTextField;
    private javax.swing.JLabel namaDepanLabel;
    private javax.swing.JTextField namaDepanTextField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPasswordField;
    private javax.swing.JLabel sudahLabel;
    private javax.swing.JLabel usernamelLabel;
    private javax.swing.JTextField usernamelTextField;
    // End of variables declaration//GEN-END:variables
}