import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) throws Exception {
        //TODO = a finalidade do programa a seguir, é de mostrar a data e hora em tempo real do nosso sistema.

        Date relogio = new Date(); // Aqui, temos um objeto em questão, o objeto Date no caso, pois possui a característica NEW atrelado á ele.
        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString()); // Nesse caso, convertemos o objeto à uma string.

        
    }
}

