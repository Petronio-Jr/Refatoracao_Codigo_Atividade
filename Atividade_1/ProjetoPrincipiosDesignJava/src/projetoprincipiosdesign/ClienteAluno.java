package projetoprincipiosdesign;

public class ClienteAluno extends Cliente{

    public ClienteAluno(String nome, Endereco endereco){
        super(nome,endereco);
    }

    @Override
    public double calcularDesconto(double totalPedido){
        return totalPedido * 0.90;
    }

}
