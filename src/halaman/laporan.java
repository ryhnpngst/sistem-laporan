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
public class laporan extends javax.swing.JFrame {

    /**
     * Creates new form utama
     */
    public laporan() {
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

        menuPanel = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        tingkatButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        buatLaporanLabel = new javax.swing.JLabel();
        tanggalLaporanLabel = new javax.swing.JLabel();
        kabupatenLaporanLabel = new javax.swing.JLabel();
        jenisLaporanLabel = new javax.swing.JLabel();
        jenisKriminalitasComboBox = new javax.swing.JComboBox<>();
        wilayahKriminalitasComboBox = new javax.swing.JComboBox<>();
        detailLabel = new javax.swing.JLabel();
        laporanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTextArea = new javax.swing.JTextArea();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buat Laporan");
        setBackground(new java.awt.Color(244, 248, 250));

        menuPanel.setBackground(new java.awt.Color(3, 5, 9));
        menuPanel.setForeground(new java.awt.Color(3, 5, 9));
        menuPanel.setPreferredSize(new java.awt.Dimension(200, 720));

        menuLabel.setBackground(new java.awt.Color(3, 5, 9));
        menuLabel.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(244, 248, 250));
        menuLabel.setText("Menu");

        tingkatButton.setBackground(new java.awt.Color(244, 248, 250));
        tingkatButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        tingkatButton.setForeground(new java.awt.Color(3, 5, 9));
        tingkatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/chartIcon.png"))); // NOI18N
        tingkatButton.setText("Tingkat Kriminalitas");

        dashboardButton.setBackground(new java.awt.Color(244, 248, 250));
        dashboardButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(3, 5, 9));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard.png"))); // NOI18N
        dashboardButton.setText("Dashboard");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuLabel)
                    .addComponent(tingkatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel)
                .addGap(18, 18, 18)
                .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tingkatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(574, Short.MAX_VALUE))
        );

        buatLaporanLabel.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        buatLaporanLabel.setForeground(new java.awt.Color(3, 5, 9));
        buatLaporanLabel.setText("Buat Laporan");

        tanggalLaporanLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        tanggalLaporanLabel.setForeground(new java.awt.Color(3, 5, 9));
        tanggalLaporanLabel.setText("Tanggal Kejadian");

        kabupatenLaporanLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        kabupatenLaporanLabel.setForeground(new java.awt.Color(3, 5, 9));
        kabupatenLaporanLabel.setText("Wilayah Kejadian");

        jenisLaporanLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jenisLaporanLabel.setForeground(new java.awt.Color(3, 5, 9));
        jenisLaporanLabel.setText("Jenis Kriminalitas");

        jenisKriminalitasComboBox.setBackground(new java.awt.Color(244, 248, 250));
        jenisKriminalitasComboBox.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jenisKriminalitasComboBox.setForeground(new java.awt.Color(3, 5, 9));
        jenisKriminalitasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pencurian", "Perampokan", "Pembunuhan", "Pemusnahan", "Perampasan", "Penyiksaan", "Perkosaan", "Penganiayaan", "Lainnya" }));

        wilayahKriminalitasComboBox.setBackground(new java.awt.Color(244, 248, 250));
        wilayahKriminalitasComboBox.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        wilayahKriminalitasComboBox.setForeground(new java.awt.Color(3, 5, 9));
        wilayahKriminalitasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kulon Progo", "Bantul", "Gunung Kidul", "Sleman", "Kota Yogyakarta" }));
        wilayahKriminalitasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wilayahKriminalitasComboBoxActionPerformed(evt);
            }
        });

        detailLabel.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(3, 5, 9));
        detailLabel.setText("Detail Kejadian");

        laporanButton.setBackground(new java.awt.Color(244, 248, 250));
        laporanButton.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        laporanButton.setForeground(new java.awt.Color(3, 5, 9));
        laporanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/createCircle.png"))); // NOI18N
        laporanButton.setText("Buat Laporan");
        laporanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanButtonActionPerformed(evt);
            }
        });

        detailTextArea.setBackground(new java.awt.Color(244, 248, 250));
        detailTextArea.setColumns(20);
        detailTextArea.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        detailTextArea.setForeground(new java.awt.Color(3, 5, 9));
        detailTextArea.setRows(5);
        jScrollPane1.setViewportView(detailTextArea);

        jDateChooser2.setForeground(new java.awt.Color(3, 5, 9));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wilayahKriminalitasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jenisLaporanLabel)
                                    .addGap(29, 29, 29)
                                    .addComponent(jenisKriminalitasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(buatLaporanLabel))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(laporanButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tanggalLaporanLabel)
                                    .addComponent(kabupatenLaporanLabel)
                                    .addComponent(detailLabel))
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(buatLaporanLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenisLaporanLabel)
                            .addComponent(jenisKriminalitasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kabupatenLaporanLabel)
                            .addComponent(wilayahKriminalitasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggalLaporanLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(laporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wilayahKriminalitasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wilayahKriminalitasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wilayahKriminalitasComboBoxActionPerformed

    private void laporanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buatLaporanLabel;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTextArea detailTextArea;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisKriminalitasComboBox;
    private javax.swing.JLabel jenisLaporanLabel;
    private javax.swing.JLabel kabupatenLaporanLabel;
    private javax.swing.JButton laporanButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel tanggalLaporanLabel;
    private javax.swing.JButton tingkatButton;
    private javax.swing.JComboBox<String> wilayahKriminalitasComboBox;
    // End of variables declaration//GEN-END:variables
}
