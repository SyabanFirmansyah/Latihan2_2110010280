package universitas;

public class Mahasiswa {
    private String npm, nama, prodi;

    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setnpm(String npm) {
        this.npm = npm;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }

    public String getnpm() {
        return npm;
    }

    public String getnama() {
        return nama;
    }

    public String getprodi() {
        return prodi;
    }
   
    //tampilan
    void getDetail(){
        System.out.println("NPM       : "+npm);
        System.out.println("NAMA      : "+nama);
        System.out.println("PRODI     : "+prodi);
    }
    
}
