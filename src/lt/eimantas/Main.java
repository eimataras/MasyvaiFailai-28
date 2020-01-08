package lt.eimantas;

public class Main {
    public static final String FILE_NAME = "skaiciai.txt";
    public static final String FILE_NAME2 = "dideli_skaiciai.txt";

    public Main() {
        Klase obj = new Klase(Main.FILE_NAME2);
        obj.nuskaitymasISarasa();
        obj.atvaizdavimasIsSaraso();
        obj.suma();
    }


    public static void main(String[] args) {
        // write your code here
        Main object = new Main();

    }
}
