package aula07;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado.getNome().equals(desafiante.getNome())) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (isAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = (int) (0 + Math.random() * (0 + 2));
            switch (vencedor) {
                case 0:
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2:
                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    // Constructor
    public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
    }

    //getters and setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
