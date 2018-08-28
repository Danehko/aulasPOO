package poo;

public class Robo {
    private int area;
    private int posix;
    private int posiy;
    private String frente;

    public Robo(int area,int posix, int posiy, String frente){
        this.area = area;
        this.posix = posix;
        this.posiy = posiy;
        this.frente = frente;
    }

    public void e(){
        if(this.frente.equals("N")){
            this.frente="L";
        }
        else if(this.frente.equals("L")){
            this.frente="S";
        }
        else if(this.frente.equals("S")){
            this.frente="O";
        }
        else if(this.frente.equals("O")){
            this.frente="N";
        }
    }

    public void d(){
        if(this.frente.equals("N")){
            this.frente="O";
        }
        else if(this.frente.equals("L")){
            this.frente="N";
        }
        else if(this.frente.equals("S")){
            this.frente="L";
        }
        else if(this.frente.equals("O")){
            this.frente="S";
        }
    }

    public void m(){
        if(this.frente.equals("N")){
            this.posiy=this.posiy + 1;
        }
        else if(this.frente.equals("L")){
            this.posix=this.posix + 1;
        }
        else if(this.frente.equals("S")){
            this.posiy=this.posiy - 1;
        }
        else if(this.frente.equals("O")){
            this.posix=this.posix - 1;
        }
    }
    public void plano(){
        this.e();
        this.m();
        this.e();
        this.m();
        this.e();
        this.m();
        this.e();
        this.m();
        this.m();
        System.out.println(this.posix + " " + this.posiy + " " + this.frente);
    }
}

