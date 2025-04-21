import java.util.Scanner;
public class Admin extends User {

    String username;
    String password;

    Scanner input = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void Login() {
        System.out.println("=== LOGIN ADMIN ===");
        System.out.print("Masukkan Username : ");
        username = input.nextLine();
        System.out.print("Masukkan password : ");
        password = input.nextLine();

        if (username.equals("Admin") && password.equals("2025")) {
            System.out.println("Login Admin Berhasil!!");
            Info();

        }else {
            System.out.println("Login Gagal. Username atau Password salah");
        }
    }

    @Override
    public void Info() {
        System.out.println("Halo " + username);
    }
}