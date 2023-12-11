package controle;

import modelo.modelo_tela_inicial;
import visao.Tela_Inicial;

public class controle_tela_inicial {

    private Tela_Inicial telaInicial;


    private void abrirListaDeCompras() {
        System.out.println("Abrindo lista de compras");
    }

    private void abrirReceitasCadastradas() {
        System.out.println("Abrindo receitas cadastradas");
    }

    private void abrirNovaReceita() {
        modelo_tela_inicial novaReceita = new modelo_tela_inicial("Nova Receita", "Ingredientes...");
        System.out.println("Abrindo tela de edição para a nova receita");
        novaReceita.processarReceita();
    }
}
