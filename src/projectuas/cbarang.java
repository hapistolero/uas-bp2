package projectuas;

/**
 *
 * @author hafiz ilham ardana
 */
public class cbarang {
    String nama;
    int harga;
    
    cbarang (String n, int h){
        nama=n; harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String disp(){
        return nama+" "+harga;
    }

    void setharga(int hrgbaru) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
