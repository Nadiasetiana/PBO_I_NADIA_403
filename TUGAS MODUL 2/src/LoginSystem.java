import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("===LOGIN SYSTEM===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            admin.Login();

        } else if (pilihan == 2) {
            mahasiswa.Login();

        } else {
            System.out.println("System Eror Login Gagal!");
        }
    }
}