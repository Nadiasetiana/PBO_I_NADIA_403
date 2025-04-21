public class RekeningBank {
    String NoRek, Nama;
    double Saldo;

    void Tampilkaninfo() {
        System.out.println("Nomor Rekening: " + NoRek);
        System.out.println("Nama Rekening: " + Nama);
        System.out.println("Saldo Rekening: " + Saldo + "\n");
    }

    void SetorUang(double Jumlah) {
        Saldo += Jumlah;
        System.out.print( Nama + " Menyetor Rp " + Jumlah);
        System.out.println(" Saldo Sekarang: Rp " + Saldo);
    }

    void TarikUang(double Jumlah) {
        if (Saldo < Jumlah) {
            System.out.println(" ");
            System.out.print( Nama + " Menarik Rp " + Jumlah);
            System.out.println(" Gagal, saldo tidak mencukupi. Saldo saat ini: Rp " + Saldo);
        } else {
            Saldo -= Jumlah;
            System.out.print( Nama + " Menarik Rp " + Jumlah);
            System.out.println(" Berhasil, Saldo Sekarang: Rp" + Saldo);
        }
    }

    void Hasil() {
        System.out.println("\nNomor Rekening: " + NoRek);
        System.out.println("Nama Rekening: " + Nama);
        System.out.println("Saldo Rekening: " + Saldo);
    }
}
