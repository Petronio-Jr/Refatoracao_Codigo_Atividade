package projetoprincipiosdesign;

public class ClienteProfessor extends Cliente {

    public ClienteProfessor(String nome, Endereco endereco){
        super(nome,endereco);
    }

    @Override
    public double calcularDesconto(double totalPedido){
        return totalPedido * 0.85;
    }
}
