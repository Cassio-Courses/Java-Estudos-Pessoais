package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO, está tampada");
        }
        else{
            System.out.println("Rabisco");
        }
    }
    
    public void tampar(){
        if(this.tampada == true) {
            System.out.println("Já estava tampada");
        }
        else{
            this.tampada = true;
        }
    }
    
    public void destampar(){
        if(this.tampada == false) {
            System.out.println("Já estava destampada");
        }
        else{
            this.tampada = false;
        }
    }
    void status(){
        System.out.print("Uma caneta modelo:  " + this.modelo + ", cor: " + this.cor);
        if (this.tampada == true){
            System.out.println(" está tampada");
        }
        else{
            System.out.println(" não está tampada");
        }
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("");
    }
    
}
