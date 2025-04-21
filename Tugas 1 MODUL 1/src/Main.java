import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Pilihan;
        String user = "Admin403";
        String password = "Password403";
        String nama = "Nadia Setiana Paris";
        String nim = "202410370110402";

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        Pilihan = sc.nextInt();

        if (Pilihan == 1) {
            sc.nextLine();
            System.out.printf("Masukkan Username : ");
            user = sc.nextLine();
            System.out.printf("Masukkan Password : ");
            password = sc.nextLine();
            if (user.equals("Admin403") && password.equals("Password403")) {
                System.out.println("Login admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (Pilihan == 2) {
            sc.nextLine();
            System.out.printf("Masukkan Nama : ");
            nama = sc.nextLine();
            System.out.printf("Masukkan Nim : ");
            nim = sc.nextLine();
            if (nama.equals("Nadia Setiana Paris") && nim.equals("202410370110403")) {
                System.out.println("Login Mahasiswa berhasil!");
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);

        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}

