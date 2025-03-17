import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("===LOGIN SYSTEM===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            String Username, Password;

            System.out.print("Masukan Username: ");
            Username = input.nextLine();
            System.out.print("Masukan Password: ");
            Password = input.nextLine();

            if (Username.equals(admin.Username) && Password.equals(admin.Password)) {
               admin.Login(Username, Password);
               admin.Info();
            } else {
                System.out.println("Login Gagal!");
            }

        } else if (pilihan == 2) {
            String Nama, NIM;

            System.out.print("Masukan Nama: ");
            Nama = input.nextLine();
            System.out.print("Masukan Nim: ");
            NIM = input.nextLine();

            if (Nama.equals(mahasiswa.Nama) && NIM.equals(mahasiswa.NIM)) {
                mahasiswa.login(Nama, NIM);
                mahasiswa.DisplayInfo();
            } else {
                System.out.println("Login Gagal!");
            }

        } else {
            System.out.println("System Eror Login Gagal!");
        }
    }
}
