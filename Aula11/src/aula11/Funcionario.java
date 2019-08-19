package aula11;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    //Métodos especiais

    /**
     * Caso trabalho seja true, será setado para falso.
     * Caso trabalho seja falso, será setado para true.
     */
    public void mudarTrabalho() {
        if (isTrabalhando()) {
            setTrabalhando(false);
        } else {
            setTrabalhando(true);
        }
    }

    @Override
    public String toString() {
        if (isTrabalhando()) {
            return "Funcionario: " + this.getNome() + " setor: " + setor + ", trabalhando";

        } else {
            return "Funcionario: " + this.getNome() + " setor: " + setor + ", Folga";
        }
    }

    //Método construtor
    public Funcionario(String nome, int idade, char sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    //Getters and Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
