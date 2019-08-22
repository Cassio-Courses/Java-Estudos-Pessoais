package aula12;

public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(int idade, int membros, double peso, String corPelo) {
        this.corPelo = corPelo;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
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

}
