package aula12;

public class Ave extends Animal {

    private String corPena;

    public Ave(String corPena, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public Ave() {
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som da ave");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
