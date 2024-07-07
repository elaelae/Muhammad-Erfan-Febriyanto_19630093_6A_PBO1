
package pbo;


public class PenjualanDetail extends Penjualan {
    
    public PenjualanDetail (String id, String nama, String member, String barang, int totalHarga) {
        super (id,nama,member,barang,totalHarga);
    }
    
    
    public String getPilihMember () {
        String kodeMember = getMember().substring(0, 2);
        //seleksi if
        if (kodeMember.equals("01")){
            return "Active";
        } else if (kodeMember.equals("02")){
            return "Inactive";
        } else {
            return "Kode yang anda masukkan salah";
        }
    }
    
    
    public String getPilihBarang(){
        String  kodeBarang = getBarang().substring(0, 2);
        
        switch (kodeBarang) {
            case "01":
                return "Meja";
            case "02":
                return "Kursi";
            default:
                return "Barang tidak ada";
        }
    }
    
    @Override
    public String displayinfo(){
        return super.displayInfo()+
                "\nStatus Member: "+getPilihMember()+
                "\nBarang yang dipilih: "+getPilihBarang()+
                "\nTotal Harga: RP "+displayinfo1();
    }
    
    
}
