import java.util.Scanner;
public class Mahasiswa {
    Scanner input = new Scanner(System.in);

    String Nama = "Nadia";
    String NIM = "202410370110403";

    void Login() {
        System.out.print("Masukan Nama: ");
        Nama = input.nextLine();
        System.out.print("Masukan Nim: ");
        NIM = input.nextLine();

        if (Nama.equals("Nadia") && NIM.equals("202410370110403")) {
            System.out.println("Data Mahasiswa Valid");
            DisplayInfo();

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