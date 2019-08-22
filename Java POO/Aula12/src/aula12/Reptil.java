package aula12;

public class Reptil extends Animal {

    private String corEscama;

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

}
