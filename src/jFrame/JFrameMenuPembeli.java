/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectuas.cDaftarTransaksi;
import projectuas.cTransaksi;

/**
 *
 * @author rizka
 */
public class JFrameMenuPembeli extends javax.swing.JFrame {
    public static cDaftarTransaksi beli = new cDaftarTransaksi();
    /**
     * Creates new form JFrameMenuPembeli
     */
    public JFrameMenuPembeli() {
        initComponents();
        DefaultTableModel modelBr = (DefaultTableModel)listBarangPb.getModel();
        // Tampilkan barang 1
        String barang1[] = new String[2];
        barang1[0] = projectuas.MainApps.brg1.getNama();
        barang1[1] = String.valueOf((int) projectuas.MainApps.brg1.getHarga());
        modelBr.addRow(barang1);
        // Tampilkan barang 2
        String barang2[] = new String[2];
        barang2[0] = projectuas.MainApps.brg2.getNama();
        barang2[1] = String.valueOf((int) projectuas.MainApps.brg2.getHarga());
        modelBr.addRow(barang2);
        // Tampilkan barang 3
        String barang3[] = new String[2];
        barang3[0] = projectuas.MainApps.brg3.getNama();
        barang3[1] = String.valueOf((int) projectuas.MainApps.brg3.getHarga());
        modelBr.addRow(barang3);
        // Tampilkan barang 4
        String barang4[] = new String[2];
        barang4[0] = projectuas.MainApps.brg4.getNama();
        barang4[1] = String.valueOf((int) projectuas.MainApps.brg4.getHarga());
        modelBr.addRow(barang4);
        // Tampilkan barang 5
        String barang5[] = new String[2];
        barang5[0] = projectuas.MainApps.brg5.getNama();
        barang5[1] = String.valueOf((int) projectuas.MainApps.brg5.getHarga());
        modelBr.addRow(barang5);
        
        projectuas.MainApps.kode++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBarangPb = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        keranjangPb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnTambahPb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluarPb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Keranjang");

        listBarangPb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listBarangPb);

        keranjangPb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Jumlah", "Harga", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(keranjangPb);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Daftar Barang");

        btnTambahPb.setBackground(new java.awt.Color(255, 102, 102));
        btnTambahPb.setForeground(new java.awt.Color(0, 0, 0));
        btnTambahPb.setText("Tambah");
        btnTambahPb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPbActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Checkout");

        btnHapus.setBackground(new java.awt.Color(102, 102, 102));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluarPb.setBackground(new java.awt.Color(255, 102, 102));
        btnKeluarPb.setForeground(new java.awt.Color(0, 0, 0));
        btnKeluarPb.setText("Keluar");
        btnKeluarPb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarPbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTambahPb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnKeluarPb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahPb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnKeluarPb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahPbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPbActionPerformed
        // TODO add your handling code here:
        String jb = JOptionPane.showInputDialog(this,"Masukkan jumlah barang : ");
        int jml = Integer.parseInt(jb);
        DefaultTableModel modelBr = (DefaultTableModel) listBarangPb.getModel();
        int row = listBarangPb.getSelectedRow();
        String barang = String.valueOf(modelBr.getValueAt(row, 0));
        if (barang.equalsIgnoreCase("panci")) {
            projectuas.MainApps.br = new cTransaksi( String.valueOf(projectuas.MainApps.kode), JFramePembeli.namaPembeli, projectuas.MainApps.brg1, jml, 0, 1);
        } 
        else if (barang.equalsIgnoreCase("Blender")) {
            projectuas.MainApps.br = new cTransaksi( String.valueOf(projectuas.MainApps.kode), JFramePembeli.namaPembeli, projectuas.MainApps.brg2, jml, 0, 2);
        }
        else if (barang.equalsIgnoreCase("Ulekan")) {
            projectuas.MainApps.br = new cTransaksi( String.valueOf(projectuas.MainApps.kode), JFramePembeli.namaPembeli, projectuas.MainApps.brg3, jml, 0, 3);
        }
        else if (barang.equalsIgnoreCase("Mug")) {
            projectuas.MainApps.br = new cTransaksi( String.valueOf(projectuas.MainApps.kode), JFramePembeli.namaPembeli, projectuas.MainApps.brg4, jml, 0, 4);
        }
        else if (barang.equalsIgnoreCase("Wajan")) {
            projectuas.MainApps.br = new cTransaksi( String.valueOf(projectuas.MainApps.kode), JFramePembeli.namaPembeli, projectuas.MainApps.brg5, jml, 0, 5);
        }
        beli.AddTransaksi(projectuas.MainApps.br);
        projectuas.MainApps.jmlpesanan++;
        
        // Update Tabel Keranjang
        DefaultTableModel modelCart = (DefaultTableModel)keranjangPb.getModel();
        
        String barangBaru[] = new String[4];
        barangBaru[0] = projectuas.MainApps.br.getBarang().getNama();
        barangBaru[1] = String.valueOf(jml);
        barangBaru[2] = String.valueOf(projectuas.MainApps.br.getBarang().getHarga());
        barangBaru[3] = String.valueOf(projectuas.MainApps.br.getBarang().getHarga() * jml);
        modelCart.addRow(barangBaru);
    }//GEN-LAST:event_btnTambahPbActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int j = JOptionPane.showConfirmDialog(this, "Yakin dihapus?");
        if (j==0) {
            DefaultTableModel modelCart = (DefaultTableModel)keranjangPb.getModel();
            int row = keranjangPb.getSelectedRow();
            int nomor = row+1;
            beli.DeleteTransaksi(nomor);
            modelCart.removeRow(row);
            projectuas.MainApps.jmlpesanan--;
        } else {
            JOptionPane.showMessageDialog(null, "Batal dihapus!");
        }
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarPbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarPbActionPerformed
        // TODO add your handling code here:
        new jFrame.JFrameHome().show();
        this.dispose();
        projectuas.MainApps.jual.sambung(beli.getFront(), beli.getRear());
        beli.LihatTransaksi();
    }//GEN-LAST:event_btnKeluarPbActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuPembeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluarPb;
    private javax.swing.JButton btnTambahPb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable keranjangPb;
    private javax.swing.JTable listBarangPb;
    // End of variables declaration//GEN-END:variables
}
