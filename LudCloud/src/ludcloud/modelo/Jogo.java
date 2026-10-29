package ludcloud.modelo;

public class Jogo {

    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private String descricao;

    public Jogo(int id, String nome, String genero, String plataforma, String descricao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.descricao = descricao;
    }

    public String exibirInformacoes() {
        return id + " - " + nome + " (" + genero + ", " + plataforma + "): " + descricao;
    }

    public void atualizarInformacoes() {
        System.out.println("Informações do jogo " + nome + " atualizadas.");
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
}
