package aula11;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public Bolsista(String nome, int idade, char sexo, int matr, String curso) {
        super(nome, idade, sexo, matr, curso);
    }
    public void renovarBolsa(){
        
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Bolsista, pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
