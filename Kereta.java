public class Kereta {
    private String namaKereta;
    private int jumlahTiket;
    // objek tiket untuk menyimpan data penumpang
    private Ticket tiket;
    
    // konstruktor unutk kereta komuter 
    public Kereta(String komuter) {
        this.namaKereta = "komuter";
        this.jumlahTiket = 1000;
        this.tiket = new Ticket(); //menginisialisasi objek tiket
    }

    // konstruktor untuk nama kereta dan jumlah tiket
    public Kereta(String namaKereta, int jumlahTiket) {
        this.namaKereta = namaKereta;
        this.jumlahTiket = jumlahTiket;
        this.tiket = new Ticket(namaKereta, jumlahTiket);
    }

    //method untuk menambah tiket
    public void tambahTiket(String namaPenumpang){
        String[] nama = new String[tiket.getNamaPenumpang().length + 1];
        System.arraycopy(tiket.getNamaPenumpang(), 0, nama, 0, tiket.getNamaPenumpang().length);
        nama[tiket.getNamaPenumpang().length] = namaPenumpang;
        tiket.setNamaPenumpang(nama);
 
        System.out.println("=================================================");
        System.out.println("Tiket berhasil dipesan");     
     }

    //method untuk menamvah tiket beserta asal dan tujuan
     public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        if (tiket.getNamaPenumpang().length < jumlahTiket) {
            String[] newNama = new String[tiket.getNamaPenumpang().length + 1];
            String[] newAsal = new String[tiket.getAsal().length + 1];
            String[] newTujuan = new String[tiket.getTujuan().length + 1];
    
            System.arraycopy(tiket.getNamaPenumpang(), 0, newNama, 0, tiket.getNamaPenumpang().length);
           
             System.arraycopy(tiket.getAsal(), 0, newAsal, 0, tiket.getAsal().length);
             System.arraycopy(tiket.getTujuan(), 0, newTujuan, 0, tiket.getTujuan().length);
 
             newNama[tiket.getNamaPenumpang().length] = namaPenumpang;
             newAsal[tiket.getAsal().length] = asal;
             newTujuan[tiket.getTujuan().length] = tujuan;
 
             tiket.setNamaPenumpang(newNama);
             tiket.setAsal(newAsal);
             tiket.setTujuan(newTujuan);
 
             if(jumlahTiket - tiket.getNamaPenumpang().length < 50){
                 System.out.println("=================================================");
                 System.out.println("Tiket berhasil dipesan Sisa tiket tersedia: " + (jumlahTiket - tiket.getNamaPenumpang().length));
             } else {
                 System.out.println("=================================================");
                 System.out.println("Tiket berhasil dipesan");
             }       
 
         } else {
             System.out.println("=================================================");
             System.out.println("kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya"); 
         }       
     }

     // method untuk menampilkan daftar tiket    
     public void tampilkanTiket(){
         System.out.println("=================================================");
         System.out.println("Daftar penumpang kereta api " + this.namaKereta + ": ");
         System.out.println("---------------------------");
 
         for(int i = 0; i < tiket.getNamaPenumpang().length; i++){
             if(this.namaKereta.equals("komuter")){
                 System.out.println("Nama: " + this.tiket.getNamaPenumpang()[i]);
             } else {
                 System.out.println("Nama: " + this.tiket.getNamaPenumpang()[i]);
                 System.out.println("Asal: " + this.tiket.getAsal()[i]);
                 System.out.println("Tujuan: " + this.tiket.getTujuan()[i]);
                 System.out.println("---------------------------");
             }
         }
     }
     
 }
    

