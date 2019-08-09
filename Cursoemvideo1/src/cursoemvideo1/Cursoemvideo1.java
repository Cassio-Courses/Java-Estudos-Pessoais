package cursoemvideo1;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
public class Cursoemvideo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Date data = new Date();
        System.out.println(data.toString());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("sua resolução é: " + d.width + " x " + d.height);
        Locale idioma = Locale.getDefault();
        System.out.println("O Idioma está configurado para: " + idioma.getDisplayLanguage());
                
        }
    
}
