import java.util.Scanner;
public class Loginsystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("Admin", "2025");
        Mahasiswa mahasiswa = new Mahasiswa("Nadia", "202410370110403");

        System.out.println("==SILAHKAN PILIH LOGIN ANDA==");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            admin.Login();

        } else if (pilihan == 2) {
            mahasiswa.Login();

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}