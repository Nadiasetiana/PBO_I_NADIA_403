public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.NoRek = "202410370110403";
        rekening1.Nama = "Nadia";
        rekening1.Saldo = 1000000;

        rekening2.NoRek = "123456789";
        rekening2.Nama = "Arga";
        rekening2.Saldo = 2000000;

        rekening1.Tampilkaninfo();
        rekening2.Tampilkaninfo();

        rekening1.SetorUang(2000000);
        rekening2.SetorUang(5000000);

        rekening1.TarikUang(8000000);
        rekening2.TarikUang(3000000);

        rekening1.Hasil();
        rekening2.Hasil();
    }
}