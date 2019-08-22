package aula12;

public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(String corPelo, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public Mamifero() {
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando");
    }

    @Override
    public void emitirsom() {
        System.out.println("Emitindo som");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getMembros() {
        return membros;
    }

    @Override
    public void setMembros(int membros) {
        this.membros = membros;
    }

}
