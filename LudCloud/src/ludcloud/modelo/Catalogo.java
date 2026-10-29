package ludcloud.modelo;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Jogo> jogos = new ArrayList<>();

    public List<Jogo> pesquisarJogo(String nome) {
        List<Jogo> resultado = new ArrayList<>();
        for (Jogo jogo : jogos) {
            if (jogo.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(jogo);
            }
        }
        return resultado;
    }

    public void cadastrarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public void removerJogo(int id) {
        jogos.removeIf(j -> j.getId() == id);
    }
}
