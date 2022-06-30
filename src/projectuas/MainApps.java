package projectuas;

public class MainApps {
    public static int kode = 10100, jumlah;
    public static int id, pin;
    public static int newpin1, newpin2, newpin3;
    public static int jmlpesanan = 0;
    
    public static cbarang brg1 = new cbarang("Panci", 250000);
    public static cbarang brg2 = new cbarang("Blender", 150000);
    public static cbarang brg3 = new cbarang("Ulekan", 10000);
    public static cbarang brg4 = new cbarang("Mug", 12000);
    public static cbarang brg5 = new cbarang("Wajan", 50000);
    public static cTransaksi br;
    public static cDaftarTransaksi jual = new cDaftarTransaksi();
    
    public static void main(String[] args) {
        new jFrame.JFrameHome().show();
        
        br = null;
    }
}
