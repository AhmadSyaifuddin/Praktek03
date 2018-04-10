package praktek03;
public class SepatuAksi {
    public static void main(String[] args) {
       Sepatu a = new Sepatu();

       a.setMerk("Yeezy");
       a.setWarna("Hitam");
       a.setHarga(500.000);
       //gak bisa a.setJenisBola()
       a.cetakInfo();
       
       System.out.println("Merknya \t : ");
       System.out.println(a.getMerk());
       System.out.println("Warnanya \t : ");
       System.out.println(a.getWarna());
       System.out.println("Harganya \t : ");
       System.out.println(a.getHarga());
       
       SepatuBola ab = new SepatuBola();
       ab.setMerk("Nike");
       ab.setWarna("Merah");
       ab.setHarga(200.000);
       ab.setJenisBola("Futsal");
       ab.cetakInfo();
       System.out.println("Jenis \t: "+ab.getJenisBola());
       ab.throttle();
    }     
}
