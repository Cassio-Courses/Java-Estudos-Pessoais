package aula09;

public class Livro implements Publicacao {

    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        setTitulo(titulo);
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //Métodos Especiais
    public void detalhes() {
        System.out.println("_____________________________DETALHES_____________________________");
        System.out.println("Titulo do livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de Páginas: " + getTotPaginas());
        System.out.println("Página Atual: " + getPagAtual());
        if (isAberto()) {
            if (getPagAtual() == 0) {
                System.out.println("O livro está aberto");
            }
        } else {
            System.out.println("O  livro está Fechado");
        }
        System.out.println("Leitor: " + this.leitor.getNome());

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
            System.out.println("O livro já está aberto!");
        } else {
            setAberto(true);
            if (getPagAtual() == 0) {
                System.out.println(this.leitor.getNome() + " abriu o livro");
            } else {
                System.out.println(this.leitor.getNome() + " abriu o livro na página: " + getPagAtual());
            }
        }

    }

    @Override
    public void fechar() {
        if (isAberto()) {
            setAberto(false);
            System.out.println("Você fechou o livro. marcou a página: " + getPagAtual());
        } else {
            System.out.println("Livro já está fechado!");
        }
    }

    @Override
    public void folhear() {
        System.out.println("Título: " + getTitulo() + "\n" + "Páginas: " + getTotPaginas());

    }

    @Override
    public void avancarPag() {
        if (isAberto()) {

            if (pagAtual >= totPaginas) {
                System.out.println("Você já folheou todas as páginas do livro");
            } else {
                setPagAtual(getPagAtual() + 1);
                System.out.println("Você passou para pagina: " + getPagAtual());
            }
        } else {
            System.out.println("O livro está fechado, abra-o para folhear.");
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()) {
            if (pagAtual <= 0) {
                System.out.println("Não há páginas antes dessa.");
            } else {
                setPagAtual(getPagAtual() - 1);
                System.out.println("Você voltou para página: " + getPagAtual());
            }
        } else {
            System.out.println("O livro está fechado, abra-o para folhear.");
        }

    }
}
