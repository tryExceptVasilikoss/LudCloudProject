package ludcloud.modelo;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private Biblioteca biblioteca = new Biblioteca();

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public boolean criarConta() {
        return nome != null && !nome.isBlank() && email != null && email.contains("@")
                && senha != null && !senha.isBlank();
    }

    public boolean fazerLogin() {
        return new Autenticacao(this).autenticar(email, senha);
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public Biblioteca getBiblioteca() { return biblioteca; }
}
