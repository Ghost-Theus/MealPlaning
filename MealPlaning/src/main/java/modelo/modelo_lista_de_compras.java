package modelo;

public class modelo_lista_de_compras {
    private int[] pesos;
    private String[] nomes;

    public modelo_lista_de_compras(int[] pesos, String[] nomes) {
        this.pesos = pesos;
        this.nomes = nomes;
    }

    public int[] getPesos() {
        return pesos;
    }

    public String[] getNomes() {
        return nomes;
    }
}
