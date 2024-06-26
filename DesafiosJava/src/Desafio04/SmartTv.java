package Desafio04;

public class SmartTv {
    boolean ligada = false;
    boolean desligada = true;
    int volume = 10;
    int canal;

    public SmartTv() {
    }

    public SmartTv(boolean ligada, boolean desligada, int volume, int canal) {
        this.ligada = ligada;
        this.desligada = desligada;
        this.volume = volume;
        this.canal = canal;
    }
    public void aumentarVolume(int novoVolume) {
        this.volume++;
    }
    public void diminuirVolume(int novoVolume) {
        this.volume--;
    }
}



