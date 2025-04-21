public class User {

    private String Nama;
    private String  Nim;

    public User (String Nama,String Nim){
        this.Nama = Nama;
        this.Nim = Nim;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getNama() {
        return Nama;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }
    public String  getNim() {
        return Nim;
    }

    public void Login(){
        System.out.println("Login");
    }

    public void Info(){
        System.out.println("==Informasi Pengguna==");
    }
}

