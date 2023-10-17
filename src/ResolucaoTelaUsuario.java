import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoTelaUsuario {
    public static void main(String[] args) {
        // Obtém o toolkit padrão
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obtém a resolução da tela
        Dimension resolucaoTela = toolkit.getScreenSize();
        int largura = (int) resolucaoTela.getWidth(); // Largura da tela
        int altura = (int) resolucaoTela.getHeight(); // Altura da tela

        // Exibe a resolução da tela para o usuário
        System.out.println("A resolução da tela da máquina do usuário é: " + largura + "x" + altura);
    }
}
