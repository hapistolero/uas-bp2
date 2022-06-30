package projectuas;

/**
 *
 * @author hafiz ilham ardana
 */
public class cTransaksi {
    String kode;
    String pembeli;
    cbarang barang;
    int jumlah ;
    String status;
    int idBarang;
    public cTransaksi next;
    
    public cTransaksi(String k, String p, cbarang b, int j, String s, int idBr){
        kode=k; pembeli=p; barang=b; jumlah= j; status=s; idBarang=idBr;
        next = null;
    }

    public void setStatus(String s){
        status=s;
    }
    public String getKode(){
        return kode;
    }
    public String getPembeli(){
        
    return pembeli;
    }
     
    public cbarang getBarang(){
        return barang;
    }
    public void show(){
        String nam = barang.getNama();
        System.out.print(nam);
    }
    
    public int getJumlah(){
        return jumlah;
    }
    public String getStatus(){
        return status;
    }
    
    public int getIdBrg() {
        return idBarang;
    }
        
}
