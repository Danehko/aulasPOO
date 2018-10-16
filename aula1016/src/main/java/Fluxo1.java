/*exemplo1
public class Fluxo1 {
    public void disparar(){
        for(int i=0; i<10; i++){
            System.err.println("Fluxo 1");
        }
    }
}*/
public class Fluxo1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.err.println("Fazendo uso de herança");
        }
    }
}