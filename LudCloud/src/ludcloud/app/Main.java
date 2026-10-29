package ludcloud.app;

import ludcloud.modelo.Administrador;
import ludcloud.modelo.Catalogo;
import ludcloud.modelo.Jogo;
import ludcloud.modelo.Usuario;

public class Main {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Administrador admin = new Administrador(1, "Admin", "admin@ludcloud.com", "123456", catalogo);
        admin.cadastrarJogo(new Jogo(1, "Mineirinho Adventures", "Plataforma", "PC", "Resenha em Minas Gerais."));
        admin.cadastrarJogo(new Jogo(2, "AVIÃOZINHO DO TRÁFICO 3:ABRI UM PORTAL PRO INFERNO NA FAVELA TENTANDO REVIVER MIT AIA E PRECISO FECHAR", "Indie", "PC", "Melhor jogo do MCU."));
        

        Usuario jogador = new Usuario(2, "Vasilikosz", "jogador@email.com", "senha123");
        System.out.println("Conta criada: " + jogador.criarConta());
        System.out.println("Login: " + jogador.fazerLogin());

        System.out.println("Pesquisa por 'min':");
        for (Jogo jogo : catalogo.pesquisarJogo("min")) {
            System.out.println("  " + jogo.exibirInformacoes());
            jogador.getBiblioteca().adicionarJogo(jogo);
        }

        System.out.println("Biblioteca:");
        for (Jogo jogo : jogador.getBiblioteca().listarJogos()) {
            System.out.println("  " + jogo.exibirInformacoes());
        }
    }
}
