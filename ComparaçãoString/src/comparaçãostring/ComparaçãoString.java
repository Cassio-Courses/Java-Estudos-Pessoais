package comparaçãostring;
public class ComparaçãoString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        /*
        * Como está sendo comparado com uma instância retornará falso.
        * método .equals() é utilizado para comparação de conteúdo entre objetos.
        */
        res = (nome1 == nome3) ? "igual" : "diferente";
        System.out.println(res);
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
        
    }
    
}
