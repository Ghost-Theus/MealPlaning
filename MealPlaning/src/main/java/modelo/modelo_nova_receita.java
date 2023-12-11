package modelo;

public class modelo_nova_receita {
    private int pesos[];
    private String nomes[];
    private String nomeReceita;

    public modelo_nova_receita() {
        this.pesos = new int[15];
        this.nomes = new String[15];
        this.nomeReceita = "";
    }

    public int[] getPesos() {
        return pesos;
    }

    public void setPesos(int[] pesos) {
        this.pesos = pesos;
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }
}
