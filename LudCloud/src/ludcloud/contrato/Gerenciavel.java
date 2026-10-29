package ludcloud.contrato;

import ludcloud.modelo.Jogo;

public interface Gerenciavel {

    void cadastrarJogo(Jogo jogo);

    void editarJogo(Jogo jogo);

    void removerJogo(int id);
}
