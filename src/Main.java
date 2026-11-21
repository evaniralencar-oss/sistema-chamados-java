import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner titulo = new Scanner(System.in);
        System.out.println("Digite o titulo do chamado");
        Chamado chamado = new Chamado(
                1,
                titulo.nextLine(),
                "Usuário não consegue imprimir documentos.",
                "Baixa"
        );

        chamado.exibirDetalhes();
    }
}