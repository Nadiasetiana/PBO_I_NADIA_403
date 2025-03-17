public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.Nama = "Kucing";
        hewan1.Jenis = "Mamalia";
        hewan1.Suara = "Meow~~";

        hewan2.Nama = "Anjing";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "Wook-wook!!!";

        hewan1.TampilkanInfo();
        hewan2.TampilkanInfo();
    }
}
