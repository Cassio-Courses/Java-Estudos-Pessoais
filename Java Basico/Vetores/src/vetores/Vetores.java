package vetores;

public class Vetores {
    public static void main(String[] args) {
        int cc = 0; 
       // String teste[] = {"Cassio", "Fernando", "Juninho", "Paula", "Danela"};
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", 
                        "Set", "Out", "Nov", "Dez"};
        int totDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30}; 
       /* while (cc < n.length){
            System.out.print(n[cc++] + ", ");
        }
        cc = 0;
        while (cc < teste.length){
            System.out.println(teste[cc++]);
        }*/
       for (int i = 0; i < mes.length; i++){
           System.out.println("O mês " + mes[i] + " possui " + totDias[i] + " dias");
       }
    
    }
    
}
