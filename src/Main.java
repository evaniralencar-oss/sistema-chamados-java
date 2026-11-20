public class Main {
    public static void main(String[] args) {
        Chamado chamado = new Chamado(
                1,
                "Impressora não funciona",
                "Usuário não consegue imprimir documentos.",
                "Alta"
        );

        chamado.exibirDetalhes();
    }
}