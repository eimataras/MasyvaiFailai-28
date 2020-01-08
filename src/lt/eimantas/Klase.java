package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Klase {
    private String _failoVardas;
    private ArrayList<Integer> _arr;

    public Klase(String failoVardas) {
        this._failoVardas = failoVardas;
        this._arr = new ArrayList<>();
    }


    public void nuskaitymasISarasa() {
        try {
            FileReader _in = new FileReader(_failoVardas);
            BufferedReader _bufferis = new BufferedReader(_in);
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                Integer number = Integer.parseInt(eilute);
                this._arr.add(number);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void atvaizdavimasIsSaraso() {
        for (Integer part : this._arr) {
            System.out.println(part);
        }
    }


    public Integer suma() {
        Integer sum = 0;
        for (Integer part : _arr) {
            sum = sum + part;
        }
        System.out.println("Faile esanciu skaiciu suma: " + sum);
        return sum;
    }
}
