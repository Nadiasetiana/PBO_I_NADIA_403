import java.util.Scanner;
public class Mahasiswa extends  User {

    Scanner input = new Scanner(System.in);

    public Mahasiswa (String Nama, String Nim) {
        super(Nama, Nim);
    }

    @Override
    public void Login() {
        System.out.println("=== LOGIN MAHASISWA ===");
        System.out.print("Masukkan Nama Mahasiswa : ");
        String inputnama = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        String inputnim = input.nextLine();

        if (inputnama.equals(getNama()) && inputnim.equals(getNim())) {
            System.out.println("Login Berhasil!!");
            Info();

        }else{
            System.out.println("Login Gagal!! Nama atau Nim salah");
        }
    }

    @Override
    public void Info() {
        System.out.println("Halo " + getNama());
        System.out.println("NIM " + getNim());
    }
}