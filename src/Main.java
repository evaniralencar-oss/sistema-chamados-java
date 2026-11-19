public class Main {
    public static void main(String[] args) {
        Chamado chamado = new Chamado(
                1,
                "Acesso ao sistema",
                "Usuário não consegue acessar o sistema.",
                "Alta"
        );

        chamado.exibirDetalhes();
    }
}