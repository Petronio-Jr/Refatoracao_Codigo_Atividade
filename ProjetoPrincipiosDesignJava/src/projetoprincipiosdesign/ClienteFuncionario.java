package projetoprincipiosdesign;

public class ClienteFuncionario extends Cliente{

    public ClienteFuncionario(String nome, Endereco endereco){
        super(nome,endereco);
    }

    @Override
    public double calcularDesconto(double totalPedido){
        return totalPedido * 0.80;
    }
}
