public class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setkesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
    public int getkesehatan() {
        return kesehatan;
    }

    public void Serang(KarakterGame target) {
        System.out.println("Serang");
    }

    public void Info(){
        System.out.println(nama+ " memiliki kesehatan : " + kesehatan);
    }
}
