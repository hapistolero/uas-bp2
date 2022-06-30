package projectuas;

/**
 *
 * @author hafiz ilham ardana
 */
public class cDaftarTransaksi {
    cTransaksi front , rear;
    int jumlahtr;
    
    
    public cDaftarTransaksi(){
        front=rear=null;
        jumlahtr=0;
    }
    
    public cTransaksi getFront(){
        return front;
    }
    public cTransaksi getRear(){
        return rear;
    }
    public void AddTransaksi(cTransaksi baru){
        if(rear==null){
           front=rear=baru; 
        }else{
            rear.next=baru;
            rear= baru;
        }
        System.out.println("Add Suksess..");
    }
    public void LihatTransaksi(){
        int i=1;
        System.out.println("Daftar Transaksi :");
        for (cTransaksi t=front;  t!=null; t=t.next) {

            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            t.show();
            System.out.print("-"+t.getJumlah());
            System.out.println("-"+t.getStatus()+"");
            i++;
        }
        System.out.println("");
    }
    public void lihatTransaksiMember(){
        int i=1;
        double total=0,diskon;
        System.out.println("Daftar Transaksi Member :");
        for (cTransaksi t=front;  t!=null; t=t.next) {

            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            t.show();
            System.out.print("-"+t.getJumlah());
            System.out.println("-"+t.getStatus()+"");
            i++;
            total=total+(t.getBarang().getHarga()*t.getJumlah());    
        }
        System.out.println("Total Belanja :"+total);
        System.out.println("Diskon        :"+(0.1*total));
        System.out.println("Biaya         :"+(total-(0.1*total)));
    }
    public void DeleteTransaksi(int nomor){
    cTransaksi t=front;
    cTransaksi prev=null;
    int  i=1;
        if (nomor==1) {
           if(t.next==null){
               front=rear=null;          
           }
           else{
            front=front.next;
            t.next=null;
        }
            System.out.println("["+t.getBarang().getNama()+"]"+" dihapus..");
        }
        else{
            for (; t!=null; t=t.next) {
                if (i==nomor) {
                    break;
                }
                i++;
                prev=t;
            }
            if(t.next==null){
                rear=prev;
                rear.next=null;
            }
            else{
                prev.next=t.next;
                t.next=null;
            }
            System.out.println("["+t.getBarang().getNama()+"]"+" dihapus..");     
        }
    }
    public void sambung (cTransaksi depan, cTransaksi belakang){
        if (rear==null) {
            front=depan;
            rear=belakang;
        }else{
            rear.next=depan;
            rear=belakang;
        }  
    }

    public void prosesTransaksi(cTransaksi t){
        t.setStatus("Diproses");
    }

    public int lihatproses(){
        cTransaksi t=front;
        int proses=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Diproses")) {
                proses++;   
            }
        }
        return proses;
    }

    public int lihatunproses(){
        cTransaksi t=front;
        int unproses=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Belum diproses")) {
                unproses++;                    
            }
        }
        return unproses;
    }

    public double lihatpemasukan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Diproses")) {
                 nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")||t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }
        return nominal;
    }

    public double lihatunpemasukan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Belum diproses")) {

                 nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")||t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.05*nominal);
                }
            }                
        }
        return nominal;
    }
     public double totalpan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==1&&t.getStatus().equalsIgnoreCase("Diproses")) {
                 nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }
        return nominal;                        
    }

    public void totalpangraf(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==1&&t.getStatus().equalsIgnoreCase("Diproses")) {
                 nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                  if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }      

            }                                 
        }
        double nominalgraf = nominal*0.0001;
        double nominalgrafx = nominal*0.001;
        for (int i = 0; i < nominalgraf-1; i++) {
            System.out.print("X"); 
        }
        System.out.println(" / "+Math.floor(nominalgrafx)+"00");                                                         
    }

    public void totalblendgraf(){
       cTransaksi t=front;
      double nominal=0;
      for (; t!=null; t=t.next) {
        if (t.getIdBrg()==2&&t.getStatus().equalsIgnoreCase("Diproses")) {
            nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
            if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                nominal=nominal-(0.1*nominal);
            }               
        }                                 
    }

    double nominalgraf = nominal*0.0001;
    double nominalgrafx = nominal*0.001;
    for (int i = 0; i < nominalgraf-1; i++) {
        System.out.print("X"); 
    }
    System.out.println(" / "+Math.floor(nominalgrafx)+"00");                                                         
    }

    public void totalulekgraf(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==3&&t.getStatus().equalsIgnoreCase("Diproses")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }               
            }                                 
        }
        double nominalgraf = nominal*0.0001;
        double nominalgrafx = nominal*0.001;
        for (int i = 0; i < nominalgraf-1; i++) {
            System.out.print("X"); 
        }
        System.out.println(" / "+Math.floor(nominalgrafx)+"00");                                                         
    }

    public void totalmuggraf(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==4&&t.getStatus().equalsIgnoreCase("Diproses")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }               
            }                                 
        }
        double nominalgraf = nominal*0.0001;
        double nominalgrafx = nominal*0.001;
        for (int i = 0; i < nominalgraf-1; i++) {
            System.out.print("X"); 
        }
        System.out.println(" / "+Math.floor(nominalgrafx)+"00");                                                         
    }

    public void totalwajangraf(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==5&&t.getStatus().equalsIgnoreCase("Diproses")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }               
            }                                 
        }
        double nominalgraf = nominal*0.0001;
        double nominalgrafx = nominal*0.001;
         for (int i = 0; i < nominalgraf-1; i++) {
            System.out.print("X"); 
        }
        System.out.println(" / "+Math.floor(nominalgrafx)+"00");                                                         
    }

    public double totalblend(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==2&&t.getStatus().equalsIgnoreCase("Diproses")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }

        return nominal;
    }

    public double totalulekan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==3&&t.getStatus().equalsIgnoreCase("Diproses")) {
                 nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }

        return nominal; 
    }

    public double totalmug(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==4&&t.getStatus().equalsIgnoreCase("Diproses")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }

        return nominal;
    }

    public double totalwajan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getIdBrg()==5&&t.getStatus().equalsIgnoreCase("Diproses")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")|t.getPembeli().equalsIgnoreCase("11")||t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }

        return nominal;                                      
    }

    public double totalmem10(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Diproses")&&t.getPembeli().equalsIgnoreCase("10")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("10")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }

        return nominal;      
    }

    public double totalmem11(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Diproses")&&t.getPembeli().equalsIgnoreCase("11")) {
                 nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("11")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        }

        return nominal;      
    }

    public double totalmem12(){
        cTransaksi t=front;
        double nominal=0;
        for (; t!=null; t=t.next) {
            if (t.getStatus().equalsIgnoreCase("Diproses")&&t.getPembeli().equalsIgnoreCase("12")) {
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if (t.getPembeli().equalsIgnoreCase("12")) {
                    nominal=nominal-(0.1*nominal);
                }                                       
            }                
        } 
        return nominal;      
    }
       
}
         

