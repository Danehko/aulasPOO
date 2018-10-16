/*exemplo1
public class Fluxo2 {
    public void disparar(){
        for(int i=0; i<10; i++){
            System.err.println("Fluxo 2");
        }
    }
}
*/
public class Fluxo2 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.err.println("Fazendo uso de interface");
        }
    }
}