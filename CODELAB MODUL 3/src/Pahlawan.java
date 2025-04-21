public class Pahlawan extends KarakterGame{
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void Serang(KarakterGame target){
        System.out.println(getNama()+ " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setkesehatan(target.getkesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan : " + target.getkesehatan());
    }
}



