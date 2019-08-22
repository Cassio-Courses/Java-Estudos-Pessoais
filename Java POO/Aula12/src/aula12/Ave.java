package aula12;

public class Ave extends Animal {

    private String corPena;

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
}
