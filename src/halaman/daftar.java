/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static koneksi.konek.konek;

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
        namaLengkapLabel = new javax.swing.JLabel();
        usernamelLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        daftarButton = new javax.swing.JButton();
        sudahLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        konfPassLabel = new javax.swing.JLabel();
        namaLengkapTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        passPasswordField = new javax.swing.JPasswordField();
        konfPassPasswordField = new javax.swing.JPasswordField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar");
        setBackground(new java.awt.Color(244, 248, 250));

        daftarPanel.setBackground(new java.awt.Color(3, 5, 9));
        daftarPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        daftarPanel.setForeground(new java.awt.Color(3, 5, 9));

        judulLabel.setBackground(new java.awt.Color(3, 5, 9));
        judulLabel.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(244, 248, 250));
        judulLabel.setText("Daftar Akun E-Lapor");

        namaLengkapLabel.setBackground(new java.awt.Color(3, 5, 9));
        namaLengkapLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        namaLengkapLabel.setForeground(new java.awt.Color(244, 248, 250));
        namaLengkapLabel.setText("Nama Lengkap");

        usernamelLabel.setBackground(new java.awt.Color(3, 5, 9));
        usernamelLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        usernamelLabel.setForeground(new java.awt.Color(244, 248, 250));
        usernamelLabel.setText("Username");

        passLabel.setBackground(new java.awt.Color(3, 5, 9));
        passLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(244, 248, 250));
        passLabel.setText("Password");

        daftarButton.setBackground(new java.awt.Color(244, 248, 250));
        daftarButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        daftarButton.setForeground(new java.awt.Color(3, 5, 9));
        daftarButton.setText("Daftar");
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        sudahLabel.setBackground(new java.awt.Color(3, 5, 9));
        sudahLabel.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        sudahLabel.setForeground(new java.awt.Color(244, 248, 250));
        sudahLabel.setText("Sudah punya akun?");

        loginButton.setBackground(new java.awt.Color(244, 248, 250));
        loginButton.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(3, 5, 9));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        konfPassLabel.setBackground(new java.awt.Color(3, 5, 9));
        konfPassLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        konfPassLabel.setForeground(new java.awt.Color(244, 248, 250));
        konfPassLabel.setText("Konfirmasi Password");

        namaLengkapTextField.setBackground(new java.awt.Color(244, 248, 250));
        namaLengkapTextField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        namaLengkapTextField.setForeground(new java.awt.Color(3, 5, 9));

        usernameTextField.setBackground(new java.awt.Color(244, 248, 250));
        usernameTextField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(3, 5, 9));

        passPasswordField.setBackground(new java.awt.Color(244, 248, 250));
        passPasswordField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        passPasswordField.setForeground(new java.awt.Color(3, 5, 9));

        konfPassPasswordField.setBackground(new java.awt.Color(244, 248, 250));
        konfPassPasswordField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        konfPassPasswordField.setForeground(new java.awt.Color(3, 5, 9));

        javax.swing.GroupLayout daftarPanelLayout = new javax.swing.GroupLayout(daftarPanel);
        daftarPanel.setLayout(daftarPanelLayout);
        daftarPanelLayout.setHorizontalGroup(
            daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daftarPanelLayout.createSequentialGroup()
                        .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaLengkapLabel)
                            .addComponent(usernamelLabel)
                            .addComponent(passLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaLengkapTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(daftarPanelLayout.createSequentialGroup()
                        .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(judulLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sudahLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(daftarPanelLayout.createSequentialGroup()
                        .addComponent(konfPassLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(konfPassPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(daftarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        daftarPanelLayout.setVerticalGroup(
            daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLengkapLabel)
                    .addComponent(namaLengkapTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daftarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(konfPassLabel)
                    .addComponent(konfPassPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(daftarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(daftarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
        String nama_lengkap = namaLengkapTextField.getText();
        String user = usernameTextField.getText();
        String password = passPasswordField.getText();
        String konfPassword = konfPassPasswordField.getText();
        String passPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        String userPattern = ".{6,10}";
        String cekUser = null;
        String role = "pengguna";
        
        try{
            Connection con = konek();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM akun WHERE username = '"+user+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cekUser = rs.getString("username");
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
        if(nama_lengkap.equals("")|| user.equals("")|| password.equals("")|| konfPassword.equals("")){
            JOptionPane.showMessageDialog(null, "Tidak Boleh Ada Isian Yang Kosong!", "Gagal", JOptionPane.ERROR_MESSAGE);
        }else if(!user.matches(userPattern)){
            JOptionPane.showMessageDialog(null, "Username Minimal Terdiri Dari 6 Karakter dan Maksimal 10 Karakter", "Gagal", JOptionPane.ERROR_MESSAGE);
            usernameTextField.setText("");
            passPasswordField.setText("");
            konfPassPasswordField.setText("");
            usernameTextField.requestFocus();
        }else if(cekUser!=null){
            JOptionPane.showMessageDialog(null, "Username Yang Anda Masukkan Sudah Terdaftar!", "Gagal", JOptionPane.ERROR_MESSAGE);
            usernameTextField.setText("");
            passPasswordField.setText("");
            konfPassPasswordField.setText("");
            usernameTextField.requestFocus();
        }else if(user.contains(" ")){
            JOptionPane.showMessageDialog(null, "Username Tidak Boleh Ada Spasi!", "Gagal", JOptionPane.ERROR_MESSAGE);
            usernameTextField.setText("");
            passPasswordField.setText("");
            konfPassPasswordField.setText("");
            usernameTextField.requestFocus();
        }else if(!password.matches(passPattern)){
            JOptionPane.showMessageDialog(null, "Password Minimal Terdiri Dari 8 Karakter, Harus Terdiri Dari Angka, Huruf Besar dan Huruf Kecil, "
                    + "serta Tidak Diperbolehkan Ada Spasi", "Gagal", JOptionPane.ERROR_MESSAGE);
            passPasswordField.setText("");
            konfPassPasswordField.setText("");
            passPasswordField.requestFocus();
        }else if(!password.equals(konfPassword)){
            JOptionPane.showMessageDialog(null, "Password Tidak Sesuai!", "Gagal", JOptionPane.ERROR_MESSAGE);
            passPasswordField.setText("");
            konfPassPasswordField.setText("");
            passPasswordField.requestFocus();
        }else{
            try{
                Connection con = konek();
                String sql = "INSERT INTO akun VALUES (?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, password);
                ps.setString(3, nama_lengkap);
                ps.setString(4, role);
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(null, "Berhasil Mendaftar Akun", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                login log = new login();
                log.setVisible(true);
            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_daftarButtonActionPerformed

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
    private javax.swing.JLabel konfPassLabel;
    private javax.swing.JPasswordField konfPassPasswordField;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel namaLengkapLabel;
    private javax.swing.JTextField namaLengkapTextField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPasswordField;
    private javax.swing.JLabel sudahLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel usernamelLabel;
    // End of variables declaration//GEN-END:variables
}
