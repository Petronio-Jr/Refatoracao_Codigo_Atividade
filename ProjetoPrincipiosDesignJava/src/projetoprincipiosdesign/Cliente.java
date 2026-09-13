package projetoprincipiosdesign;

//Classe abstrata não pode ser instanciada
public abstract class Cliente {

    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract double calcularDesconto(double totalPedido);

    public String obterNomeCidade(){
        return endereco.obterNomeCidade();
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}