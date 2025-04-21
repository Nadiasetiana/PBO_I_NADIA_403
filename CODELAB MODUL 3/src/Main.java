public class Main {
    public static void main(String[] args) {
        KarakterGame karakterGame = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        System.out.println("Status awal : ");
        pahlawan.Info();
        musuh.Info();

        pahlawan.Serang(musuh);
        musuh.Serang(pahlawan);
    }
}
