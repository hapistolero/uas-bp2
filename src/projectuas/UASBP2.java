package projectuas;

import java.util.Scanner;

public class UASBP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cbarang brg1 = new cbarang("Panci", 250000);
        cbarang brg2 = new cbarang("Blender", 150000);
        cbarang brg3 = new cbarang("Ulekan", 10000);
        cbarang brg4 = new cbarang("Mug Enamel", 12000);
        cbarang brg5 = new cbarang("Wajan", 50000);

        //member 
        int idl = 10, pwd1 = 123;
        int idl2 = 11, pwd2 = 222;
        int idl3 = 12, pwd3 = 333;
        int id, pin;

        int newpin1, newpin2, newpin3;

        cDaftarTransaksi jual = new cDaftarTransaksi();
        int pilih = 0;
        int pilih2 = 0;
        int pilih3 = 0, piliha = 0;
        cTransaksi br = null;
        int kode = 10100, jumlah;
        do {
            System.out.println("Selamat Datang ");
            System.out.println("1.Pembeli");
            System.out.println("2.Member");
            System.out.println("3.Admin");
            System.out.println("4.Pemilik");
            System.out.println("5.Exit");
            System.out.print("pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    kode++;
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.print("Masukan Nama : ");
                    String nama = sc.next();
                    do {

                        System.out.println("");
                        System.out.println("Akun Pembeli ");
                        System.out.println("1.Tambah");
                        System.out.println("2.Hapus");
                        System.out.println("3.Lihat");
                        System.out.println("4.kembali");
                        System.out.print("Pilih =");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:

                                System.out.println("Daftar Barang :");
                                System.out.println("1.Panci");
                                System.out.println("2.Blender");
                                System.out.println("3.Ulekan");
                                System.out.println("4.Mug Enamel");
                                System.out.println("5.Wajan");
                                System.out.print("pilih : ");
                                pilih3 = sc.nextInt();
                                System.out.print("Jumlah Barang : ");
                                jumlah = sc.nextInt();
                                if (pilih3 == 1) {
                                    br = new cTransaksi(String.valueOf(kode), nama, brg1, jumlah, "Belum diproses", 1);

                                } else if (pilih3 == 2) {
                                    br = new cTransaksi(String.valueOf(kode), nama, brg2, jumlah, "Belum diproses", 2);

                                } else if (pilih3 == 3) {

                                    br = new cTransaksi(String.valueOf(kode), nama, brg3, jumlah, "Belum diproses", 3);

                                } else if (pilih3 == 4) {
                                    br = new cTransaksi(String.valueOf(kode), nama, brg4, jumlah, "Belum diproses", 4);

                                } else if (pilih3 == 5) {
                                    br = new cTransaksi(String.valueOf(kode), nama, brg5, jumlah, "Belum diproses", 5);

                                }

                                beli.AddTransaksi(br);

                                break;
                            case 2:
                                beli.LihatTransaksi();
                                System.out.print("Hapus Nomor = ");
                                int hapus = sc.nextInt();
                                beli.DeleteTransaksi(hapus);
                                break;
                            case 3:
                                beli.LihatTransaksi();
                                break;
                            case 4:
                                System.out.println("...");
                                jual.sambung(beli.getFront(), beli.getRear());
                                break;

                        }

                    } while (pilih2 != 4);
                    break;
                case 2:
                    //member

                    System.out.println("Member Menu :");
                    System.out.println("1. lanjutkan");
                    System.out.println("2. ubah pin");
                    System.out.println("3. keluar...");
                    System.out.print("pilih = ");
                    int pilih4 = 0;
                    pilih4 = sc.nextInt();
                    switch (pilih4) {
                        case 1:
                            boolean valid = false;
                            do {
                                System.out.print("ID = ");
                                id = sc.nextInt();
                                System.out.print("PIN = ");
                                pin = sc.nextInt();
                                if (id == idl && pin == pwd1) {

                                    valid = true;
                                } else if (id == idl2 && pin == pwd2) {
                                    valid = true;
                                } else if (id == idl3 && pin == pwd3) {
                                    valid = true;
                                }
                                if (valid == false) {
                                    System.out.println("ID/PIN Salah");
                                } else {
                                    break;
                                }

                            } while (valid == true);
                            if (valid == true) {
                                System.out.println("Selamat Datang..");

                                kode++;
                                beli = new cDaftarTransaksi();

                                do {

                                    System.out.println("");
                                    System.out.println("Akun Member ");
                                    System.out.println("1.Tambah");
                                    System.out.println("2.Hapus");
                                    System.out.println("3.Lihat");
                                    System.out.println("4.kembali");
                                    System.out.print("Pilih =");
                                    pilih2 = sc.nextInt();
                                    switch (pilih2) {
                                        case 1:

                                            System.out.println("Daftar Barang :");
                                            System.out.println("1.Panci");
                                            System.out.println("2.Blender");
                                            System.out.println("3.Ulekan");
                                            System.out.println("4.Mug Enamel");
                                            System.out.println("5.Wajan");
                                            System.out.print("pilih : ");
                                            pilih3 = sc.nextInt();
                                            System.out.print("Jumlah Barang : ");
                                            jumlah = sc.nextInt();

                                            if (pilih3 == 1) {
                                                br = new cTransaksi(String.valueOf(kode), String.valueOf(id), brg1, jumlah, "Belum diproses", 1);

                                            } else if (pilih3 == 2) {
                                                br = new cTransaksi(String.valueOf(kode), String.valueOf(id), brg2, jumlah, "Belum diproses", 2);

                                            } else if (pilih3 == 3) {
                                                br = new cTransaksi(String.valueOf(kode), String.valueOf(id), brg3, jumlah, "Belum diproses", 3);

                                            } else if (pilih3 == 4) {
                                                br = new cTransaksi(String.valueOf(kode), String.valueOf(id), brg4, jumlah, "Belum diproses", 4);

                                            } else if (pilih3 == 5) {
                                                br = new cTransaksi(String.valueOf(kode), String.valueOf(id), brg5, jumlah, "Belum diproses", 5);

                                            }

                                            beli.AddTransaksi(br);

                                            break;
                                        case 2:
                                            beli.LihatTransaksi();
                                            System.out.print("Hapus Nomor = ");
                                            int hapus = sc.nextInt();
                                            beli.DeleteTransaksi(hapus);
                                            break;
                                        case 3:
                                            beli.lihatTransaksiMember();
                                            break;
                                        case 4:
                                            System.out.println("...");
                                            jual.sambung(beli.getFront(), beli.getRear());
                                            break;

                                    }

                                } while (pilih2 != 4);
                                break;
                            }
                            break;
                        case 2:
                            valid = false;
                            do {
                                System.out.print("ID = ");
                                id = sc.nextInt();
                                System.out.print("PIN Lama = ");
                                pin = sc.nextInt();
                                if (id == idl && pin == pwd1) {

                                    System.out.print("Pin baru : ");
                                    newpin1 = sc.nextInt();
                                    pwd1 = newpin1;

                                    valid = true;
                                } else if (id == idl2 && pin == pwd2) {

                                    System.out.print("Pin baru : ");
                                    newpin2 = sc.nextInt();
                                    pwd2 = newpin2;

                                    valid = true;
                                } else if (id == idl3 && pin == pwd3) {

                                    System.out.print("Pin baru : ");
                                    newpin3 = sc.nextInt();
                                    pwd3 = newpin3;
                                    valid = true;
                                }
                                if (valid == true) {
                                    System.out.println("pin berhasil di perbarui");
                                } else {
                                    break;
                                }
                                break;
                            } while (valid == true);

                            break;
                        case 3:
                            System.out.println("kembali...");
                            break;

                    }

                    break;
                case 3:
                    //admin
                    System.out.println("Akun Admin");
                    jual.LihatTransaksi();
                    //prosess
                    cTransaksi t = jual.getFront();
                    do {
                        if (t.getStatus().equalsIgnoreCase("Belum diproses")) {
                            System.out.println("Kode :" + t.getKode());
                            System.out.println("Pembeli :" + t.getPembeli());
                            System.out.println("Barang :" + t.getBarang().getNama());
                            System.out.println("Jumlah :" + t.getJumlah());
                            System.out.println("");
                            System.out.println("Jumlah Transaksi Belum Diproses : " + jual.lihatunproses());
                            System.out.println("Total Transaksi Belum di proses : " + jual.lihatunpemasukan());
                            System.out.println("");
                            System.out.println("Pilih Aksi-");
                            System.out.println("1.Diproses");
                            System.out.println("2.Selesai");

                            System.out.print("Pilih = ");
                            int aksi = sc.nextInt();
                            if (aksi == 1) {
                                jual.prosesTransaksi(t);
                                System.out.println("Berhasil diproses..");

                            } else {
                                break;
                            }

                        }
                        t = t.next;

                    } while (t != null);

                    break;
                case 4:
                    //pemilik
                    System.out.println("Akun Pemilik");
                    System.out.println("Jumlah Transaksi Diproses : " + jual.lihatproses());
                    System.out.println("Pemasukan " + jual.lihatpemasukan());
                    System.out.println("1.Ubah Harga");
                    System.out.println("2.Laporan Penjualan Barang");
                    System.out.println("3.Laporan Pembelian Member");
                    System.out.println("4.Grafik Penjualan");
                    System.out.println("5.Keluar...");
                    System.out.print("pilih = ");
                    piliha = sc.nextInt();
                    switch (piliha) {
                        case 1:
                            System.out.println("Daftar Barang :");
                            System.out.println("1.Panci");
                            System.out.println("2.Blender");
                            System.out.println("3.Ulekan");
                            System.out.println("4.Mug Enamel");
                            System.out.println("5.Wajan");
                            System.out.print("Pilih Barang : ");
                            int barang;
                            barang = sc.nextInt();
                            boolean ada = false;
                            int hrgbaru = 0;
                            if (barang == 1) {
                                ada = true;
                                System.out.print("Masukan Harga Baru : ");
                                hrgbaru = sc.nextInt();
                                brg1.setharga(hrgbaru);
                            } else if (barang == 2) {
                                ada = true;
                                System.out.print("Masukan Harga Baru : ");
                                hrgbaru = sc.nextInt();
                                brg2.setharga(hrgbaru);
                                ada = true;
                            } else if (barang == 3) {
                                ada = true;
                                System.out.print("Masukan Harga Baru : ");
                                hrgbaru = sc.nextInt();
                                brg3.setharga(hrgbaru);
                                ada = true;
                            } else if (barang == 4) {
                                ada = true;
                                System.out.print("Masukan Harga Baru : ");
                                hrgbaru = sc.nextInt();
                                brg4.setharga(hrgbaru);
                                ada = true;
                            } else if (barang == 5) {
                                ada = true;
                                System.out.print("Masukan Harga Baru : ");
                                hrgbaru = sc.nextInt();
                                brg5.setharga(hrgbaru);
                                ada = true;
                            }
                            if (ada == false) {
                                System.out.println("Barang Tidak Ada");
                            }
                            break;
                        case 2:

                            System.out.println("Laporan Penjualan Barang");
                            System.out.println("Total Penjualan : " + jual.lihatpemasukan());
                            System.out.println("1.Panci      : " + jual.totalpan());
                            System.out.println("2.Blender    : " + jual.totalblend());
                            System.out.println("3.Ulekan     : " + jual.totalulekan());
                            System.out.println("4.Mug Enamel : " + jual.totalmug());
                            System.out.println("5.Wajan      : " + jual.totalwajan());
                            break;

                        case 3:
                            System.out.println("Total Pembelian Member");
                            System.out.println("Member id 10 : " + jual.totalmem10());
                            System.out.println("Member id 11 : " + jual.totalmem11());
                            System.out.println("Member id 12 : " + jual.totalmem12());
                            System.out.println("");
                            break;
                        case 4:
                            System.out.println("Grafik Penjualan :");
                            System.out.print("1.Panci      : ");
                            jual.totalpangraf();
                            System.out.print("2.Blender    : ");
                            jual.totalblendgraf();
                            System.out.print("3.Ulekan     : ");
                            jual.totalulekgraf();
                            System.out.print("4.Mug Enamel : ");
                            jual.totalmuggraf();
                            System.out.print("5.Wajan      : ");
                            jual.totalwajangraf();
                            break;

                        case 5:
                            break;
                    }

                    break;
                case 5:
                    break;
            }
        } while (pilih != 5);
        System.out.println("CONNECTED");
        System.out.println("alhamdulillah");
        System.out.println("Haloo");
        System.out.println("Yess");
        System.out.println("hore");
        
    }

}
