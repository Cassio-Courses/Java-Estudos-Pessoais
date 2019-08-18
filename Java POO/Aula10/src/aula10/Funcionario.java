package aula10;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    //Métodos especiais
    public void mudarTrabalho() {
        if (isTrabalhando()) {
            setTrabalhando(false);
        } else {
            setTrabalhando(true);
        }
    }

    public String detalhes() {
        if (isTrabalhando()) {
            return "Funcionario: " + this.getNome() + "setor: " + setor + ", trabalhando";

        }else{
            return "Funcionario: " + this.getNome() + "setor: " + setor + ", Folga";
        }
    }

    //Método construtor
    public Funcionario(String setor, boolean trabalhando, String nome, int idade, char sexo) {
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
