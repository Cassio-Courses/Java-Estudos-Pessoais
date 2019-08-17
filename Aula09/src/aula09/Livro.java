package aula09;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //Métodos Especiais
    public void detalhes() {
        System.out.println("Titulo livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de Páginas: " + getTotPaginas());
        System.out.println("Página Atual: " + getPagAtual());
        if (isAberto()) {
            System.out.println("Livro está Aberto");
        } else {
            System.out.println("Livro está Fechado");
        }
        System.out.println("Leitor: " + getLeitor());

    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Interface Publicacao
    @Override
    public void abrir() {
        if (isAberto()) {
            setAberto(true);
            System.out.println("Livro foi aberto");
        } else {
            System.out.println("Livro já está aberto");
        }

    }

    @Override
    public void fechar() {
        if (isAberto()) {
            setAberto(false);
            System.out.println("Livro foi fechado");
        } else {
            System.out.println("Livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        System.out.println(getTitulo() + "\n" + getTotPaginas());

    }

    @Override
    public void avancarPag() {
        if (pagAtual >= totPaginas) {
            System.out.println("Você já folheou todas as páginas do livro");
        } else {
            setPagAtual(getPagAtual() + 1);
            System.out.println("Você passou para pagina: " + getPagAtual());
        }
    }

    @Override
    public void voltarPag() {
        if (pagAtual <= 0) {
            System.out.println("Não há páginas antes dessa.");
        } else {
            setPagAtual(getPagAtual() - 1);
            System.out.println("Você voltou para página: " + getPagAtual());
        }
    }
}
