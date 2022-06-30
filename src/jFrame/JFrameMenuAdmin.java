/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectuas.cTransaksi;

/**
 *
 * @author rizka
 */
public class JFrameMenuAdmin extends javax.swing.JFrame {
    public static int jmlPesan = projectuas.MainApps.jmlpesanan;
    /**
     * Creates new form JFrameMenuAdmin
     */
    static boolean aksi = false;
    cTransaksi trans = projectuas.MainApps.jual.getFront(); 
    
    static int baris = 0;
    //static String status;
    
    public JFrameMenuAdmin() {
        initComponents();
        DefaultTableModel modeltbl = (DefaultTableModel)listProses.getModel();
        cTransaksi transBaru = trans;
        String proses[][] = new String[jmlPesan][8];
        do {
            int i = 0;
//            if(transBaru.getStatus() == 0) {
//                
//            }
            proses[i][0] = transBaru.getKode();
                proses[i][1] = transBaru.getPembeli();
                proses[i][2] = transBaru.getBarang().getNama();
                proses[i][3] = String.valueOf(transBaru.getBarang().getHarga());
                proses[i][4] = String.valueOf(transBaru.getJumlah());
                if(transBaru.getPembeli().equalsIgnoreCase("1") || transBaru.getPembeli().equalsIgnoreCase("2") || transBaru.getPembeli().equalsIgnoreCase("3")) {
//                    String subTotal = String.valueOf((trans.getBarang().getHarga()*trans.getJumlah()) * 0.05);
                    proses[i][5] = String.valueOf( (transBaru.getBarang().getHarga()*transBaru.getJumlah()) * 0.05);
                    proses[i][6] = String.valueOf(transBaru.getBarang().getHarga() - transBaru.getBarang().getHarga()*0.05);
                } else {
                    proses[i][5] = "-";
                    proses[i][6] = String.valueOf(transBaru.getBarang().getHarga() * transBaru.getJumlah());
                }
                proses[i][7] = String.valueOf(transBaru.getStatus());
                proses[i][7] = transBaru.getStatus();
            modeltbl.addRow(proses[i]);
            i++;
            transBaru = transBaru.next;
        } while (transBaru != null);
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listProses = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnProses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        listProses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Transaksi", "Nama", "Barang", "Harga", "Jumlah", "Diskon", "Total", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listProses);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Antrean Transaksi");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("KELUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnProses.setBackground(new java.awt.Color(0, 153, 0));
        btnProses.setText("PROSES TRANSAKSI");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnProses)
                                .addGap(17, 17, 17))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProses)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        boolean harusProses = false;
        for (cTransaksi t = projectuas.MainApps.jual.getFront(); t!= null; t=t.next) {
            if(t.getStatus().equalsIgnoreCase("Belum diproses")) {
                harusProses = true;
                trans = t;
                break;
            }
        }
        if (harusProses) {
            do {    
                aksi = true;
                if (aksi) {
                    projectuas.MainApps.jual.prosesTransaksi(trans);
                    System.out.println("sukses");
                    //status = "Diproses";
                    DefaultTableModel modeltbl = (DefaultTableModel)listProses.getModel();
                    //int baris = modeltbl.getRowCount();

                    modeltbl.setValueAt(trans.getStatus(), baris, 7);
                    baris++;
                }
                trans = trans.next;
                break;
            } while (trans.next != null);
        } else{
            JOptionPane.showMessageDialog(this, "Semua pesanan telah diproses");
            System.out.println("Pesanan diproses semua");
        }
        
        /*if (trans == null) {
            JOptionPane.showMessageDialog(this, "Semua pesanan telah diproses");
            System.out.println("Pesanan diproses semua");
        }*/
    }//GEN-LAST:event_btnProsesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new jFrame.JFrameHome().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listProses;
    // End of variables declaration//GEN-END:variables
}
