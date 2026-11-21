import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o titulo do chamado:  ");
        String titulo = teclado.nextLine();

        System.out.println("Descreva o problema:  ");
        String descricao = teclado.nextLine();

        Chamado chamado = new Chamado(
                1,
                titulo,
                descricao,
                "Baixa"
        );

        chamado.exibirDetalhes();
    }
}