package projectuas;

public class MainApps {
    public static int kode = 070200, jumlah;
    public static int id, pin;
    public static int newpin1, newpin2, newpin3;
    public static int jmlpesanan = 0;   
    
    public static cbarang brg1 = new cbarang("LPG", 17000);
    public static cbarang brg2 = new cbarang("Galon", 18000);
    public static cbarang brg3 = new cbarang("Minyak Goreng", 25000);
    public static cbarang brg4 = new cbarang("Minuman Bersoda", 10000);
    public static cbarang brg5 = new cbarang("Sirup", 19000);
    public static cTransaksi br;
    public static cDaftarTransaksi jual = new cDaftarTransaksi();
    
    public static void main(String[] args) {
        new jFrame.JFrameHome().show();
        
        br = null;
    }
}
