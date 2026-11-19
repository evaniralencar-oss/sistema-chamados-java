public class Chamado {
    private int numero;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String status;

    public Chamado(int numero, String titulo, String descricao, String prioridade) {
        this.numero = numero;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = "Aberto";
    }

    public void exibirDetalhes() {
        System.out.println("Chamado #" + numero);
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Status: " + status);
    }
}