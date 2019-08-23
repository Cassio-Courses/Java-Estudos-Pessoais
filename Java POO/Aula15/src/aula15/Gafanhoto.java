package aula15;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistindo;

    public Gafanhoto(String login, String nome, char sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistindo = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Gafanhoto{" + "login=" + login + ", totAssistindo=" + totAssistindo + '}';
    }

    public void viuMaisUm() {
        setTotAssistindo(getTotAssistindo() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

}
