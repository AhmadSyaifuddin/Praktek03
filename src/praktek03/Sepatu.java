package praktek03;

public class Sepatu {
    private double harga;
    private String merk;
    private String warna;
     
      
   void cetakInfo(){
       System.out.println("merk \t: "+merk+"\n"+
                     "warna \t:"+warna+"\n"+
                     "Harga \t:"+harga);
   }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
   
   
}
