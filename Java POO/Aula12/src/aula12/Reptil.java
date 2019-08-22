package aula12;

public class Reptil extends Animal {

    private String corEscama;

    public Reptil(String corEscama, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public Reptil() {
    }

    @Override
    public void locomover() {
        System.out.println("Rastejaqndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirsom() {
        System.out.println("som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
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
