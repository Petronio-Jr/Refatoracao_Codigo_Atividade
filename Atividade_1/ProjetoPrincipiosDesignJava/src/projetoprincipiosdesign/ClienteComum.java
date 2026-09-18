package projetoprincipiosdesign;

public class ClienteComum extends Cliente {

    public ClienteComum(String nome, Endereco endereco){
        super(nome,endereco);
    }

    @Override
    public double calcularDesconto(double totalPedido){
        return totalPedido;
    }
}
