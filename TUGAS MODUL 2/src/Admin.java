public class Admin {
    String Username = "admin";
    String Password = "12345";

    void Login(String InputUser, String InputPassword) {
        if (InputUser.equals("admin") && InputPassword.equals("12345")) {
            System.out.println("Data Admin Valid");
        }else {
            System.out.println("Data Admin Tidak Valid");
        }
    }

    void Info() {
        System.out.println("Halo Admin....");
    }
}
