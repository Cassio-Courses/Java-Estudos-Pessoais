package aula04;
public class Caneta {
    private final int id;
    private static int count = 0;
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, float ponta, String cor) {
        this.id = ++count;
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    @Override
    public String toString() {
        if (this.tampada == true){
        return "Caneta " +id + ", modelo: " + modelo + ", ponta: " + ponta + ", cor: " + cor + ", tampada.";
        }
        else{
        return "Caneta " +id + ", modelo: " + modelo + ", ponta: " + ponta + ", cor: " + cor + ", destampada.";
        }
    }
    
    
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
    }
    
}
