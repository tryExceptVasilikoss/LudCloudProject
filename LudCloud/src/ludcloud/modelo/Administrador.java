package ludcloud.modelo;

import ludcloud.contrato.Gerenciavel;

public class Administrador extends Usuario implements Gerenciavel {

    private Catalogo catalogo;

    public Administrador(int id, String nome, String email, String senha, Catalogo catalogo) {
        super(id, nome, email, senha);
        this.catalogo = catalogo;
    }

    @Override
    public void cadastrarJogo(Jogo jogo) {
        catalogo.cadastrarJogo(jogo);
    }

    @Override
    public void editarJogo(Jogo jogo) {
        catalogo.removerJogo(jogo.getId());
        catalogo.cadastrarJogo(jogo);
    }

    @Override
    public void removerJogo(int id) {
        catalogo.removerJogo(id);
    }
}
