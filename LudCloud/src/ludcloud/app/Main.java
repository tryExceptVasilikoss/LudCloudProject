package ludcloud.app;

import ludcloud.modelo.Administrador;
import ludcloud.modelo.Catalogo;
import ludcloud.modelo.Jogo;
import ludcloud.modelo.Usuario;

public class Main {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Administrador admin = new Administrador(1, "Admin", "admin@ludcloud.com", "123456", catalogo);
        admin.cadastrarJogo(new Jogo(1, "Mineirinho Adventures", "Plataforma", "PC", "Resenha em Minas Gerais.", 30.0));
        admin.cadastrarJogo(new Jogo(2, "AVIÃOZINHO DO TRÁFICO 3:ABRI UM PORTAL PRO INFERNO NA FAVELA TENTANDO REVIVER MIT AIA E PRECISO FECHAR", "Indie", "PC", "Melhor jogo do MCU.", 71.0));
        

        Usuario jogador = new Usuario(2, "BatataGameplays", "batatajogadora321@email.com", "batata123_");
        System.out.println("Conta criada: " + jogador.criarConta());
        System.out.println("Login: " + jogador.fazerLogin());

        System.out.println("Saldo adicionado: " + jogador.adicionarSaldo(100.99));
        System.out.println(String.format("Saldo: R$ %.2f", jogador.getSaldo()));

        System.out.println("Pesquisa por 'AVI':");
        for (Jogo jogo : catalogo.pesquisarJogo("AVI")) {
            System.out.println("  " + jogo.exibirInformacoes());
            System.out.println("  Compra: " + jogador.comprarJogo(jogo));
        }
        System.out.println(String.format("Saldo: R$ %.2f", jogador.getSaldo()));

        System.out.println("Biblioteca:");
        for (Jogo jogo : jogador.getBiblioteca().listarJogos()) {
            System.out.println("  " + jogo.exibirInformacoes());
        }
    }
}
