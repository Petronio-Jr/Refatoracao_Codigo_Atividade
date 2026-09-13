package projetoprincipiosdesign;

public class Cliente {

    private String nome;
    private Endereco endereco;
    private TipoCliente tipo;

    public Cliente(String nome, Endereco endereco, TipoCliente tipo) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    //Adicionando um enum com os possíveis tipos de cliente
    public enum TipoCliente {ALUNO, PROFESSOR, FUNCIONARIO};

    public String obterNomeCidade(){
        return endereco.obterNomeCidade();
    }

    //Getters and Setters
    public TipoCliente getTipo(){
        return tipo;
    }
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