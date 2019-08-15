package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(1, "Cassio");
        System.out.println(c1.fecharConta());
        System.out.println(c1.abrirConta("CC"));
        System.out.println(c1.depositar(500));
        System.out.println(c1.fecharConta());
        System.out.println(c1.pagarMensal());
        System.out.println(c1.sacar(1500f));
        System.out.println(c1.fecharConta());
        System.out.println(c1.sacar(538));
        System.out.println(c1.fecharConta());
        System.out.println(c1.status());
        System.out.println(c1.pagarMensal());
    }
    
}
