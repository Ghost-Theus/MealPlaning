package controle;

import modelo.modelo_lista_de_compras;
import visao.Lista_de_Compra;

public class controle_lista_de_compras {
    private controle_lista_de_compras receitaModel;
    private Lista_de_Compra listaDeCompraView;

    public controle_lista_de_compras(controle_lista_de_compras receitaModel, Lista_de_Compra listaDeCompraView) {
        this.receitaModel = receitaModel;
        this.listaDeCompraView = listaDeCompraView;


}
}
