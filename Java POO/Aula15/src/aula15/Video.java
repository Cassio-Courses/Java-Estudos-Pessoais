package aula15;

public class Video implements AcoesVideo {

    private String titulo;
    private boolean reproduzindo;
    private int visualizacoes, avaliacao, curtidas;

    public Video(String titulo) {
        this.titulo = titulo;
        this.reproduzindo = false;
        this.visualizacoes = 0;
        this.avaliacao = 0;
        this.curtidas = 0;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", reproduzindo=" + reproduzindo
                + ", visualizacoes=" + visualizacoes + ", avaliacao="
                + avaliacao + ", curtidas=" + curtidas + '}';
    }

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

}
