package aula10;

public class Professor extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {

    }

    public Professor(String setor, boolean trabalhando, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

}
