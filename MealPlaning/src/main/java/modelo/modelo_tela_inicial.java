package modelo;

public class modelo_tela_inicial {
    private String nome;
    private String ingredientes;

    public modelo_tela_inicial(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void processarReceita() {
        System.out.println("Processando receita: " + nome);
    }
}
