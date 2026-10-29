package ludcloud.modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Jogo> jogos = new ArrayList<>();

    public boolean adicionarJogo(Jogo jogo) {
        if (jogos.contains(jogo)) {
            return false;
        }
        return jogos.add(jogo);
    }

    public boolean removerJogo(int id) {
        return jogos.removeIf(j -> j.getId() == id);
    }

    public List<Jogo> listarJogos() {
        return new ArrayList<>(jogos);
    }
}
