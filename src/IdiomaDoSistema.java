
import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        // Obtém o Locale padrão da máquina do usuário
        Locale idiomaPadrao = Locale.getDefault();
        
        // Exibe o idioma para o usuário
        System.out.println("O idioma da máquina do usuário é: " + idiomaPadrao.getDisplayLanguage());
    }
}

