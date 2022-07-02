/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

import static jFrame.JFrameMenuAdmin.jmlPesan;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectuas.cDaftarTransaksi;
import projectuas.cTransaksi;

/**
 *
 * @author rizka
 */
public class JFrameMenuOwner extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenuOwner
     */
    
    cTransaksi trans = projectuas.MainApps.jual.getFront(); 
    
    public JFrameMenuOwner() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        DefaultTableModel modeltbl = (DefaultTableModel)listTransaksi.getModel();
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
                    proses[i][6] = String.valueOf((transBaru.getBarang().getHarga() - (transBaru.getBarang().getHarga()*0.05))*transBaru.getJumlah());
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
        
        //tampil total diproses & belum diproses
        String diproses = String.valueOf(projectuas.MainApps.jual.lihatpemasukan());
        labelDiproses.setText("Nilai penjualan yang telah diproses : "+diproses);
        String belum = String.valueOf(projectuas.MainApps.jual.lihatunpemasukan());
        labelBelum.setText("Nilai penjualan yang belum diproses : "+belum);
        
        
        //tampil pemasukan
        String pemasukan = diproses;
        labelPemasukan.setText("Pemasukan : "+pemasukan);
        DefaultTableModel modelPemasukan = (DefaultTableModel)listPemasukan.getModel();
        // Tampilkan barang 1
        int nomor = 0;
        String masuk1[] = new String[3];
        nomor = 1;
        masuk1[0] = String.valueOf(nomor);
        masuk1[1] = projectuas.MainApps.brg1.getNama();
        masuk1[2] = String.valueOf((int) projectuas.MainApps.jual.totalpan());
        modelPemasukan.addRow(masuk1);
        // Tampilkan barang 2
        String masuk2[] = new String[3];
        nomor = 2;
        masuk2[0] = String.valueOf(nomor);
        masuk2[1] = projectuas.MainApps.brg2.getNama();
        masuk2[2] = String.valueOf((int) projectuas.MainApps.jual.totalblend());
        modelPemasukan.addRow(masuk2);
        // Tampilkan barang 3
        String masuk3[] = new String[3];
        nomor = 3;;
        masuk3[0] = String.valueOf(nomor);
        masuk3[1] = projectuas.MainApps.brg3.getNama();
        masuk3[2] = String.valueOf((int) projectuas.MainApps.jual.totalulekan());
        modelPemasukan.addRow(masuk3);
        // Tampilkan barang 4
        String masuk4[] = new String[3];
        nomor = 4;
        masuk4[0] = String.valueOf(nomor);
        masuk4[1] = projectuas.MainApps.brg4.getNama();
        masuk4[2] = String.valueOf((int) projectuas.MainApps.jual.totalmug());
        modelPemasukan.addRow(masuk4);
        // Tampilkan barang 5
        String masuk5[] = new String[3];
        nomor = 5;
        masuk5[0] = String.valueOf(nomor);
        masuk5[1] = projectuas.MainApps.brg5.getNama();
        masuk5[2] = String.valueOf((int) projectuas.MainApps.jual.totalwajan());
        modelPemasukan.addRow(masuk5);
        
        
        //tampil pemasukan member
        DefaultTableModel modelMember = (DefaultTableModel)listPembelianMember.getModel();
        //member 1
        String member1[] = new String[3];
        nomor = 1;
        member1[0] = String.valueOf(nomor);
        member1[1] = String.valueOf(JFrameMember.idl);
        member1[2] = String.valueOf(projectuas.MainApps.jual.totalmem10());
        modelMember.addRow(member1);
        //member 2
        String member2[] = new String[3];
        nomor = 2;
        member2[0] = String.valueOf(nomor);
        member2[1] = String.valueOf(JFrameMember.id2);
        member2[2] = String.valueOf(projectuas.MainApps.jual.totalmem11());
        modelMember.addRow(member2);
        //member 3
        String member3[] = new String[3];
        nomor = 3;
        member3[0] = String.valueOf(nomor);
        member3[1] = String.valueOf(JFrameMember.id3);
        member3[2] = String.valueOf(projectuas.MainApps.jual.totalmem12());
        modelMember.addRow(member3);
        
        
        
        // Tampilkan rekap grafik
        DefaultTableModel modelGraf = (DefaultTableModel) listGrafik.getModel();
        modelGraf.setValueAt(projectuas.MainApps.jual.totalpangraf(), 0, 1);
        modelGraf.setValueAt(projectuas.MainApps.jual.totalblendgraf(), 1, 1);
        modelGraf.setValueAt(projectuas.MainApps.jual.totalulekgraf(), 2, 1);
        modelGraf.setValueAt(projectuas.MainApps.jual.totalmuggraf(), 3, 1);
        modelGraf.setValueAt(projectuas.MainApps.jual.totalwajangraf(), 4, 1);
//        cTransaksi tr = projectuas.MainApps.jual.getFront();
//        double nominal = 0;
//        boolean ketemu = false;
//        int j;
//        for (cTransaksi t = tr; t!=null; t= t.next) {
//            j = 1;
//            if (t.getIdBrg()== j && t.getStatus().equalsIgnoreCase("Diproses")) {
//                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
//                if (t.getPembeli().equalsIgnoreCase("1")||t.getPembeli().equalsIgnoreCase("2")||t.getPembeli().equalsIgnoreCase("3")) {
//                    nominal -= (0.05*nominal);
//                }
//                ketemu = true;
//            }  
//            if(ketemu) {
//                double nominalgraf = nominal*0.0001;
//                double nominalgrafx = nominal*0.001;
//                String x = "";
//                String graf[][] = new String [5][2];
//                for (int i = 0; i < nominalgraf-1; i++) {
//                    x += "X";
//                }
//                graf[j][0] = t.getBarang().getNama();
//                graf[j][1] = x;
//                modelGraf.setValueAt(x, j-1, 1);
//            }
//            j++;
//            
//        }
        
        
        //tampil tabel ubah harga
        DefaultTableModel modelBr = (DefaultTableModel)listBarangOwner.getModel();
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTransaksi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labelDiproses = new javax.swing.JLabel();
        labelBelum = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelPemasukan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPemasukan = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listPembelianMember = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        listGrafik = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listBarangOwner = new javax.swing.JTable();
        btnKeluarMbr = new javax.swing.JButton();
        btnUbahHarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(listTransaksi);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Antrean Transaksi");

        labelDiproses.setBackground(new java.awt.Color(0, 0, 0));
        labelDiproses.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDiproses.setForeground(new java.awt.Color(0, 0, 0));
        labelDiproses.setText("Nilai penjualan yang telah diproses : ");

        labelBelum.setBackground(new java.awt.Color(0, 0, 0));
        labelBelum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelBelum.setForeground(new java.awt.Color(0, 0, 0));
        labelBelum.setText("Nilai penjualan yang belum diproses : ");

        btnKeluar.setBackground(new java.awt.Color(255, 0, 0));
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDiproses)
                            .addComponent(labelBelum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDiproses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelBelum))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnKeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Antrean Transaksi", jPanel1);

        labelPemasukan.setBackground(new java.awt.Color(0, 0, 0));
        labelPemasukan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPemasukan.setForeground(new java.awt.Color(0, 0, 0));
        labelPemasukan.setText("Pemasukan : ");

        listPemasukan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Pemasukan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listPemasukan);
        if (listPemasukan.getColumnModel().getColumnCount() > 0) {
            listPemasukan.getColumnModel().getColumn(0).setMinWidth(12);
            listPemasukan.getColumnModel().getColumn(0).setMaxWidth(32);
        }

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pembelian member");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Grafik Penjualan");

        listPembelianMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Total Belanja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(listPembelianMember);
        if (listPembelianMember.getColumnModel().getColumnCount() > 0) {
            listPembelianMember.getColumnModel().getColumn(0).setMinWidth(12);
            listPembelianMember.getColumnModel().getColumn(0).setMaxWidth(32);
        }

        listGrafik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"LPG", null},
                {"Galon", null},
                {"Minyak Goreng", null},
                {"Minuman Bersoda", null},
                {"Sirup", null}
            },
            new String [] {
                "Nama Barang", "Grafik Penjualan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(listGrafik);
        if (listGrafik.getColumnModel().getColumnCount() > 0) {
            listGrafik.getColumnModel().getColumn(0).setMinWidth(72);
            listGrafik.getColumnModel().getColumn(0).setMaxWidth(108);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(labelPemasukan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPemasukan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Laporan Penjualan", jPanel2);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Daftar Barang");

        listBarangOwner.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(listBarangOwner);

        btnKeluarMbr.setBackground(new java.awt.Color(255, 102, 102));
        btnKeluarMbr.setForeground(new java.awt.Color(0, 0, 0));
        btnKeluarMbr.setText("Keluar");
        btnKeluarMbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarMbrActionPerformed(evt);
            }
        });

        btnUbahHarga.setText("Ubah Harga");
        btnUbahHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnUbahHarga)))
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluarMbr, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUbahHarga)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addComponent(btnKeluarMbr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atur Harga", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarMbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarMbrActionPerformed
        // TODO add your handling code here:
        new jFrame.JFrameHome().show();
        this.dispose();
    }//GEN-LAST:event_btnKeluarMbrActionPerformed

    private void btnUbahHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahHargaActionPerformed
        // TODO add your handling code here:
        int j = JOptionPane.showConfirmDialog(this, "Yakin diubah?");
        if(j == 0) {
            String hargaBaru = JOptionPane.showInputDialog("Masukkan harga baru :");
            DefaultTableModel modelBr = (DefaultTableModel)listBarangOwner.getModel();
            int row = listBarangOwner.getSelectedRow();
            String barang = String.valueOf(modelBr.getValueAt(row, 0));
            modelBr.setValueAt(hargaBaru, row, 1);
            if (barang.equalsIgnoreCase("LPG")) {
                projectuas.MainApps.brg1.setharga(Integer.parseInt(hargaBaru));
            } 
            else if (barang.equalsIgnoreCase("Galon")) {
                projectuas.MainApps.brg2.setharga(Integer.parseInt(hargaBaru));
            }
            else if (barang.equalsIgnoreCase("MInyak Goreng")) {
                projectuas.MainApps.brg3.setharga(Integer.parseInt(hargaBaru));
            }
            else if (barang.equalsIgnoreCase("Minuman Bersoda")) {
                projectuas.MainApps.brg4.setharga(Integer.parseInt(hargaBaru));
            }
            else if (barang.equalsIgnoreCase("Sirup")) {
                projectuas.MainApps.brg5.setharga(Integer.parseInt(hargaBaru));
            }
            JOptionPane.showMessageDialog(this, "Harga berhasil diubah!");
        } 
        else {
            JOptionPane.showMessageDialog(this, "Harga batal diubah!");
        }
        
        
    }//GEN-LAST:event_btnUbahHargaActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        new JFrameHome().show();
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenuOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKeluarMbr;
    private javax.swing.JButton btnUbahHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelBelum;
    private javax.swing.JLabel labelDiproses;
    private javax.swing.JLabel labelPemasukan;
    private javax.swing.JTable listBarangOwner;
    private javax.swing.JTable listGrafik;
    private javax.swing.JTable listPemasukan;
    private javax.swing.JTable listPembelianMember;
    private javax.swing.JTable listTransaksi;
    // End of variables declaration//GEN-END:variables
}
