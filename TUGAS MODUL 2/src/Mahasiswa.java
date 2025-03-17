public class Mahasiswa {
    String Nama = "Nadia";
    String NIM = "202410370110403";

    void login(String InputNama, String InputNIM) {
        if (InputNama.equals(Nama) && InputNIM.equals(NIM)) {
            System.out.println("Data Mahasiswa Valid");
        } else {
            System.out.println("Data Mahasiswa Tidak Valid");
        }
    }

    void DisplayInfo() {
        System.out.println("==INFORMASI MAHASISWA==");
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Mahasiswa Berhasil Login!");
    }
}