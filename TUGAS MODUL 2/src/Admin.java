import java.util.Scanner;
public class Admin {
    Scanner input = new Scanner(System.in);

    String Username = "admin";
    String Password = "12345";

    void Login() {
        System.out.print("Masukan Username: ");
        Username = input.nextLine();
        System.out.print("Masukan Password: ");
        Password = input.nextLine();

        if (Username.equals("admin") && Password.equals("12345")) {
            System.out.println("Data Admin Valid");
            Info();

        }else {
            System.out.println("Data Admin Tidak Valid");
        }
    }

    void Info() {
        System.out.println("Halo " + Username);
    }
}
