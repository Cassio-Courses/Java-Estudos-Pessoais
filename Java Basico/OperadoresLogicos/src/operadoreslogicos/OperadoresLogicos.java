package operadoreslogicos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        /*
        * Operadores Lógicos: && = e; || = ou; ^ = ou exclusivo
        * ^ retorna verdadeiro quando uma das operações é exclusivamente verdadeira
        */
        r = (x < y ^ y == z) ? true : false; // true porque um dos dois é verdadeiro.
        System.out.println(r);
        r = (x < y ^ y < z) ? true : false; // false porque os dois são verdadeiros.
        System.out.println(r);
    }
    
}
