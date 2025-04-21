public class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void Serang(KarakterGame target){
        System.out.println(getNama()+ " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setkesehatan(target.getkesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan : " + target.getkesehatan());
    }
}
