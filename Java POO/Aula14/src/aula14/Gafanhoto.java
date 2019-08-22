package aula14;

public class Gafanhoto {

    private String login;
    private int totAssistindo;

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
