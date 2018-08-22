package poo;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Tempo(int h) {
        if(h>=0 && h < 24){
            hora = h;
        }else{
            hora = 0;
        }
        minuto = 0;
        segundo = 0;
    }

    public Tempo(int h, int m) {
        if(h>=0 && h < 24 && m>=0 && m<60){
            this.hora = h;
            this.minuto = m;
        }else{
            this.hora = 0;
            this.minuto = 0;
        }
        this.segundo = 0;
    }

    public Tempo(int h, int m, int s) {
        if(h>=0 && h < 24 && m>=0 && m<60 && s>=0 && s<60){
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }else{
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public String toString(){
        String saida = hora + ":" + minuto + ":" + segundo;
        return saida;
    }

    public boolean setHora(int hora) {
        if(hora>=0 && hora < 24){
            this.hora = hora;
            return true;
        }else{
            this.hora = 0;
            return false;
        }
    }

    public boolean setMinuto(int minuto) {
        if(minuto>=0 && minuto < 60){
            this.minuto = minuto;
            return true;
        }else{
            this.minuto = 0;
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if(segundo>=0 && segundo < 60){
            this.segundo = segundo;
            return true;
        }else{
            this.segundo = 0;
            return false;
        }
    }

    public long temposeg(){
        long convertido = (((this.hora * 60) + this.minuto)* 60) + this.segundo;
        return convertido;
    }
}
