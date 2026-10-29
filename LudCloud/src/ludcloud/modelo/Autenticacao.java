package ludcloud.modelo;

public class Autenticacao {

    private Usuario usuario;

    public Autenticacao(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean autenticar(String email, String senha) {
        return usuario.getEmail().equals(email) && usuario.getSenha().equals(senha);
    }
}
